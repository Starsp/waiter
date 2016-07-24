package by.waiter.DAO;

import by.waiter.model.Retail;

import java.util.List;

/**
 * Created by Vassilev
 * 28.06.2015.
 */
public interface RetailDAO {

    Retail getCafeById(int id);

    List<Retail> getCafeList();

    Retail mergeCafe(Retail retail);
}
