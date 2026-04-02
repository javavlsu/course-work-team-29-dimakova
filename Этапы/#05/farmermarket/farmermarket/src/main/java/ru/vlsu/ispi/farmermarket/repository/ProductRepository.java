package ru.vlsu.ispi.farmermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlsu.ispi.farmermarket.model.Category;
import ru.vlsu.ispi.farmermarket.model.Product;
import ru.vlsu.ispi.farmermarket.model.Seller;

import java.math.BigDecimal;
import java.util.List;

/**
 * Репозиторий для работы с товарами.
 */

public interface ProductRepository extends JpaRepository<Product, Integer> {
    /**
     * Находит товары по названию (без учета регистра).
     * @param name часть названия
     * @return список товаров
     */
    List<Product> findByNameContainingIgnoreCase(String name);

    /**
     * Находит товары в диапазоне цен.
     * @param minPrice минимальная цена
     * @param maxPrice максимальная цена
     * @return список товаров
     */
    List<Product> findByPriceBetween(BigDecimal minPrice, BigDecimal maxPrice);

    /**
     * Находит товары конкретного продавца.
     * @param seller продавец
     * @return список товаров
     */
    List<Product> findBySeller(Seller seller);

    /**
     * Находит товары по категории.
     * @param category категория
     * @return список товаров
     */
    List<Product> findByCategory(Category category);
}
