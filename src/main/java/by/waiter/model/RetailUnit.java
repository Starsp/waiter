package by.waiter.model;

import java.util.List;

/**
 * Created by Vassilev
 * 28.06.2015.
 */
public class RetailUnit {

    private Integer id;
    private Retail retail;
    private List<RetailUnit> retailUnits;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Retail getRetail() {
        return retail;
    }

    public void setRetail(Retail retail) {
        this.retail = retail;
    }

    public List<RetailUnit> getRetailUnits() {
        return retailUnits;
    }

    public void setRetailUnits(List<RetailUnit> retailUnits) {
        this.retailUnits = retailUnits;
    }
}
