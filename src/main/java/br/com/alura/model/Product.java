package br.com.alura.model;

import com.opencsv.bean.CsvBindByName;

import java.math.BigDecimal;

public class Product {

    @CsvBindByName(column = "ProductID", required = true)
    private Integer id;
    @CsvBindByName(column = "ProductName", required = true)
    private String name;
    @CsvBindByName(column = "Description", required = true)
    private String description;
    @CsvBindByName(column = "Price", required = true)
    private BigDecimal price;
    @CsvBindByName(column = "Category", required = true)
    private String category;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
