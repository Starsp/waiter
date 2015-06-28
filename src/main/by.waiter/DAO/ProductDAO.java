package DAO;

import model.Product;

import java.util.List;

/**
 * Created by Vassilev on 28.06.2015.
 */
public interface ProductDAO {

    public Product getProductByID(int id);

    public List<Product> getAllProducts();

    public Product mergeProduct(Product product);
}
