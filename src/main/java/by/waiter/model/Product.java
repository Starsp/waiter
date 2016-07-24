package by.waiter.model;

import java.math.BigDecimal;

/**
 * Created by Vassilev
 * 28.06.2015.
 */
public class Product {

    private Integer id;
    private String name;
    private RetailUnit retailUnit;
    private Float weight;
    private Integer time;
    private boolean available;
    private BigDecimal price;
    private Category category;
    private Retail retail;
    private String description;

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

    public RetailUnit getRetailUnit() {
        return retailUnit;
    }

    public void setRetailUnit(RetailUnit retailUnit) {
        this.retailUnit = retailUnit;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Retail getRetail() {
        return retail;
    }

    public void setRetail(Retail retail) {
        this.retail = retail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
