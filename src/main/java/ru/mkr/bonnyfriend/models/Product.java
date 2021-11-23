package ru.mkr.bonnyfriend.models;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.net.URI;
import java.util.Objects;

@Data
@Entity
public class Product {
  @Id
  @Column(name = "id", nullable = false)
  private String id;
  @Column(name = "title")
  private String title;
  @Column(name = "description")
  private String description;
  @Column(name = "price", nullable = false)
  private BigDecimal price;
  @Column(name = "salePrice")
  private BigDecimal salePrice;
  @Column(name = "imagePath")
  private URI imagePath;
  @Column(name = "recall")
  private String recall;
  @Column(name = "specification")
  private String specification;

  public Product() {

  }

  public Product(String id, String title, String description, BigDecimal price, BigDecimal salePrice, URI image, String recall, String specification) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.price = price;
    this.salePrice = salePrice;
    this.imagePath = image;
    this.recall = recall;
    this.specification = specification;
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
