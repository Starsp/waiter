package DAO;

import model.Cafe;

import java.util.List;

/**
 * Created by Vassilev on 28.06.2015.
 */
public interface CafeDAO {

    public Cafe getCafeById(int id);

    public List<Cafe> getCafeList();

    public Cafe mergeCafe(Cafe cafe);
}
