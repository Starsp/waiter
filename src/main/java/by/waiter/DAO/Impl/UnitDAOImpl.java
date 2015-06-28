package by.waiter.DAO.Impl;

import by.waiter.DAO.UnitDAO;
import by.waiter.DAO.mapper.UnitRowMapper;
import by.waiter.core.BaseDao;
import by.waiter.model.Unit;
import org.springframework.dao.EmptyResultDataAccessException;

import java.util.List;

/**
 * Created by Vassilev on 28.06.2015.
 */
public class UnitDAOImpl extends BaseDao implements UnitDAO {

    public List<Unit> getAllUnits() {
        List<Unit> allUnits;
        try {
            allUnits = getJdbcTemplate().query("SELECT * FROM \"unit\"", UnitRowMapper.INSTANCE);
        } catch (EmptyResultDataAccessException e) {
            logger.error("Не заполнены справочники единиц измерения!");
            return null;
        }
        return allUnits;
    }

    public Unit getUnitByID(int id) {
        try {
            return getJdbcTemplate().queryForObject("SELECT * FROM \"unit\" WHERE id = ?", UnitRowMapper.INSTANCE, id);
        } catch (EmptyResultDataAccessException e) {
            logger.error("Не найдена единица измерения в БД с ID {}", id);
            return null;
        }
    }
}
