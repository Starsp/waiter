package by.waiter.DAO.mapper;

import by.waiter.model.Category;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Vassilev on 28.06.2015.
 */
public class CategoryRowMapper implements RowMapper<Category> {

    public static final CategoryRowMapper INSTANCE = new CategoryRowMapper();

    public Category mapRow(ResultSet resultSet, int i) throws SQLException {
        Category category = new Category();
        category.setId(resultSet.getInt("id"));
        category.setName(resultSet.getString("name"));
        return null;
    }
}
