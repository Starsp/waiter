package by.waiter.DAO.Impl;

import by.waiter.DAO.CategoryDAO;
import by.waiter.DAO.mapper.CategoryRowMapper;
import by.waiter.core.BaseDao;
import by.waiter.model.Category;
import org.springframework.dao.EmptyResultDataAccessException;

import java.util.List;

/**
 * Created by Vassilev on 28.06.2015.
 */
public class CategoryDAOImpl extends BaseDao implements CategoryDAO {

    public Category getCategoryByID(int id) {
        try {
            return getJdbcTemplate().queryForObject("SELECT id,name FROM \"category\" WHERE id = ?", CategoryRowMapper.INSTANCE, id);
        } catch (EmptyResultDataAccessException e) {
            logger.error("Не найдена категория в БД с ID {}", id);
            return null;
        }
    }

    public List<Category> getAllCategories() {
        List<Category> allCategories;
        try {
            allCategories = getJdbcTemplate().query("SELECT id,name FROM \"category\"", CategoryRowMapper.INSTANCE);
        } catch (EmptyResultDataAccessException e) {
            logger.error("Не справочник категроий продукции!");
            return null;
        }
        return allCategories;
    }

    //todo исправить !
    public Category mergeCategory(Category category) {
        try {
            if (category.getId() == null) {
                getJdbcTemplate().update("INSERT INTO \"category\" (name) VALUES (name = ?)", category.getName());
            } else {
                getJdbcTemplate().update("UPDATE \"category\" SET name = ?", category.getName());
            }
        } catch (EmptyResultDataAccessException e) {
            logger.error("Не удалось добавить категорию!");
        }
        return category;
    }

}
