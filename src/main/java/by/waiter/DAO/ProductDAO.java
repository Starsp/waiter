package by.waiter.DAO;

import by.waiter.model.Retail;
import by.waiter.model.Category;
import by.waiter.model.Product;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Vassilev on 28.06.2015.
 */
public interface ProductDAO {

    Product getProductByID(int id);

    List<Product> getAllProducts();

    @Transactional
    Product mergeProduct(Product product);

    List<Product> getProductListByCafe(Retail retail, Category category);
}
