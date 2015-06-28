package by.waiter.DAO.Impl;

import by.waiter.DAO.CafeDAO;
import by.waiter.DAO.mapper.CafeRowMapper;
import by.waiter.core.BaseDao;
import by.waiter.model.Cafe;
import org.springframework.dao.EmptyResultDataAccessException;

import java.util.List;

/**
 * Created by Vassilev on 28.06.2015.
 */
public class CafeDAOImpl extends BaseDao implements CafeDAO {

    public Cafe getCafeById(int id) {
        try {
            return getJdbcTemplate().queryForObject("SELECT id,name FROM cafe WHERE id = ?", CafeRowMapper.INSTANCE, id);
        } catch (EmptyResultDataAccessException e) {
            logger.error("Не найдена категория в БД с ID {}", id);
            return null;
        }
    }

    public List<Cafe> getCafeList() {
        List<Cafe> cafeList;
        try {
            cafeList = getJdbcTemplate().query("SELECT * FROM \"cafe\"", CafeRowMapper.INSTANCE);
        } catch (EmptyResultDataAccessException e) {
            logger.error("Не справочник категроий продукции!");
            return null;
        }
        return cafeList;
    }

    //todo исправить !
    public Cafe mergeCafe(Cafe cafe) {
        try {
            if (cafe.getId() == null) {
                getJdbcTemplate().update("INSERT INTO \"cafe\"  (name) VALUES (?)", cafe.getName());
            } else {
                getJdbcTemplate().update("UPDATE \"cafe\" SET name = ?", cafe.getName());
            }
        } catch (EmptyResultDataAccessException e) {
            logger.error("Не удалось добавить категорию!");
        }
        return cafe;
    }
}
