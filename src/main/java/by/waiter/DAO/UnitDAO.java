package by.waiter.DAO;

import by.waiter.model.RetailUnit;

import java.util.List;

/**
 * Created by Vassilev on 28.06.2015.
 */
public interface UnitDAO {

    public List<RetailUnit> getAllUnits();

    public RetailUnit getUnitByID(int id);

}
