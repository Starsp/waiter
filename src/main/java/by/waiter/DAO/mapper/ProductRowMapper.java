package by.waiter.DAO.mapper;

import by.waiter.DAO.CafeDAO;
import by.waiter.DAO.CategoryDAO;
import by.waiter.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import by.waiter.BooleanUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Vassilev on 28.06.2015.
 */
public class ProductRowMapper implements RowMapper<Product> {

    public static final ProductRowMapper INSTANCE = new ProductRowMapper();
    @Autowired
    private CategoryDAO categoryDAO;
    @Autowired
    private CafeDAO cafeDAO;

    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        Product product = new Product();
        product.setId(resultSet.getInt("id"));
        product.setName(resultSet.getString("name"));
        product.setAvailable(BooleanUtil.intAsBoolean(resultSet.getInt("available")));
        product.setCategory(categoryDAO.getCategoryByID(resultSet.getInt("categoryid")));
        product.setComposition(resultSet.getString("composition"));
        product.setOutput(resultSet.getInt("output"));
        product.setTime(resultSet.getInt("time"));
        product.setPrice(resultSet.getInt("price"));
        product.setCafe(cafeDAO.getCafeById(resultSet.getInt("cafeID")));
        return product;
    }

}
