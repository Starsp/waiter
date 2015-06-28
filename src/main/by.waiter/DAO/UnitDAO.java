package DAO;

import model.Unit;

import java.util.List;

/**
 * Created by Vassilev on 28.06.2015.
 */
public interface UnitDAO {

    public List<Unit> getAllUnits();

    public Unit getUnitByID(int id);

    public Unit mergeUnit(Unit unit);

}
