package ru.mkr.bonnyfriend.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.net.URI;
import java.util.Objects;

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

  public URI getImagePath() {
    return imagePath;
  }

  public void setImagePath(URI imagePath) {
    this.imagePath = imagePath;
  }

  public String getRecall() {
    return recall;
  }

  public void setRecall(String recall) {
    this.recall = recall;
  }

  public String getSpecification() {
    return specification;
  }

  public void setSpecification(String specification) {
    this.specification = specification;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public BigDecimal getSalePrice() {
    return salePrice;
  }

  public void setSalePrice(BigDecimal salePrice) {
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
