package ru.mkr.bonnyfriend.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Product {
  @Id
  @Column(unique = true, name = "id", nullable = false)
  private String id;
  @Column(name = "title")
  private String title;
  @Column(name = "description")
  private String description;
  @Column(name = "price", nullable = false)
  private String price;
  @Column(name = "salePrice")
  private String salePrice;

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public String getSalePrice() {
    return salePrice;
  }

  public void setSalePrice(String salePrice) {
    this.salePrice = salePrice;
  }

  protected Product(String title, String description) {
    this.title = title;
    this.description = description;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Product product = (Product) o;
    return Objects.equals(id, product.id) && Objects.equals(title, product.title) && Objects.equals(description, product.description) && Objects.equals(price, product.price) && Objects.equals(salePrice, product.salePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, price, salePrice);
  }
}
