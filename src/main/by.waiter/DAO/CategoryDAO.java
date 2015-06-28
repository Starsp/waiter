package DAO;

import model.Category;

import java.util.List;

/**
 * Created by Vassilev on 28.06.2015.
 */
public interface CategoryDAO {

    public Category getCategoryByID(int id);

    public List<Category> getAllCategories();

    public Category mergeCategory(Category category);
}
