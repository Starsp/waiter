package by.waiter.DAO;

import by.waiter.model.Category;

import java.util.List;

/**
 * Created by Vassilev on 28.06.2015.
 */
public interface CategoryDAO {

     Category getCategoryByID(int id);

     List<Category> getAllCategories();

     Category mergeCategory(Category category);
}
