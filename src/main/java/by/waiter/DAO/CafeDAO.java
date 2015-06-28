package by.waiter.DAO;

import by.waiter.model.Cafe;

import java.util.List;

/**
 * Created by Vassilev on 28.06.2015.
 */
public interface CafeDAO {

     Cafe getCafeById(int id);

     List<Cafe> getCafeList();

     Cafe mergeCafe(Cafe cafe);
}
