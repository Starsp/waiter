package by.waiter;

import by.waiter.DAO.CafeDAO;
import by.waiter.model.Cafe;
import org.junit.Test;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;

/**
 * Created by Vassilev on 28.06.2015.
 */
public class CatalogTest extends BaseTest {

    @Resource
    CafeDAO cafeDAO;

    @Test
    public void addCafeTest(){
        Cafe cafe = new Cafe();
        cafe.setName("Test Cafe");
        cafeDAO.mergeCafe(cafe);
    }
}
