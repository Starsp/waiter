package by.waiter.model;

/**
 * Created by Vassilev on 28.06.2015.
 */
//В БД таблица сущности имеет древовидную структуру
public class Category {

    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
