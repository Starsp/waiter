package by.waiter.DAO.Impl;

import by.waiter.DAO.ProductDAO;
import by.waiter.DAO.mapper.ProductRowMapper;
import by.waiter.core.BaseDao;
import by.waiter.model.Cafe;
import by.waiter.model.Category;
import by.waiter.model.Product;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import by.waiter.BooleanUtil;

import java.util.List;

/**
 * Created by Vassilev on 28.06.2015.
 */
public class ProductDAOImpl extends BaseDao implements ProductDAO {

    public Product getProductByID(int id) {
        return getJdbcTemplate().queryForObject("SELECT * FROM \"product\" WHERE id = ?", ProductRowMapper.INSTANCE, id);
    }

    public List<Product> getAllProducts() {
        List<Product> allProducts;
        try {
            allProducts = getJdbcTemplate().query("SELECT * FROM \"product\"", ProductRowMapper.INSTANCE);
        } catch (EmptyResultDataAccessException e) {
            logger.error("Не заполненв таблица товаров!");
            return null;
        }
        return allProducts;
    }

    //todo переделать по возможности
    public Product mergeProduct(Product product) {

        try {
            Object[] param = new Object[]{product.getId(), product.getName(), BooleanUtil.booleanAsInteger(product.isAvailable()),
                    product.getCafe().getId(), product.getCategory().getId(), product.getComposition(), product.getOutput(),
                    product.getPrice(), product.getPrice(), product.getUnit().getId()};
            if (product.getId() == null) {
                getJdbcTemplate().update("INSERT INTO \"product\" (id,name,available,cafeID,categoryid,composition,output,price,unitid)" +
                        " VALUES (?,?,?,?,?,?,?,?,?,?)", param);
            } else {
                getJdbcTemplate().update("UPDATE \"product\" SET" +
                        " productid=?,name=?,available=?,cafeID=?,categoryid=?,composition=?,output=?,price=?,unitid=?", param);
            }
        } catch (DataAccessException dataAccessException) {
            logger.error("Не удалось сохранить продукт {} ({})", product.getId(), product.getName());
        }
        return product;
    }

    //Меню конкретного заведения
    public List<Product> getProductListByCafe(Cafe cafe, Category category) {
        List<Product> allProducts;
        try {
            allProducts = getJdbcTemplate().query("SELECT * FROM \"product\" WHERE cafeID = ? AND categoryid = ?",
                    ProductRowMapper.INSTANCE, cafe.getId(), category.getId());
        } catch (EmptyResultDataAccessException e) {
            logger.error("Не найдены продукты в заведении № = {} ({}) , в ветка = {}({})!",
                    cafe.getId(), cafe.getName(), category.getId(), category.getName());
            return null;
        }
        return allProducts;
    }
}
