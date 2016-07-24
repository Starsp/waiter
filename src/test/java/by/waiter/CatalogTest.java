package by.waiter;

import by.waiter.DAO.RetailDAO;
import by.waiter.model.Retail;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by Vassilev on 28.06.2015.
 */
public class CatalogTest extends BaseTest {

    @Resource
    RetailDAO retailDAO;

    @Test
    public void addCafeTest(){
        Retail retail = new Retail();
        retail.setName("Test Retail");
        retailDAO.mergeCafe(retail);
    }
}
