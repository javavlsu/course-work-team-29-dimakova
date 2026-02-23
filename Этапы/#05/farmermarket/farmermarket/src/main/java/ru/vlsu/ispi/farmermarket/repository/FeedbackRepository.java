package ru.vlsu.ispi.farmermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlsu.ispi.farmermarket.model.Buyer;
import ru.vlsu.ispi.farmermarket.model.Feedback;
import ru.vlsu.ispi.farmermarket.model.Product;

import java.util.List;

/**
 * Репозиторий для работы с отзывами.
 */
public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {

    /**
     * Находит отзывы на товар.
     * @param product товар
     * @return список отзывов
     */
    List<Feedback> findByProduct(Product product);

    /**
     * Находит отзывы покупателя.
     * @param buyer покупатель
     * @return список отзывов
     */
    List<Feedback> findByBuyer(Buyer buyer);
}

