package ru.mkr.bonnyfriend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mkr.bonnyfriend.models.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
  Product findByTitle(String title);
}