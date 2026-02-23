package ru.vlsu.ispi.farmermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlsu.ispi.farmermarket.model.Buyer;
import ru.vlsu.ispi.farmermarket.model.Cart;
import ru.vlsu.ispi.farmermarket.model.User;

import java.util.Optional;

/**
 * Репозиторий для работы с корзинами.
 */

public interface CartRepository extends JpaRepository<Cart, Integer> {
    /**
     * Находит корзину покупателя.
     * @param buyer покупатель
     * @return Optional с корзиной
     */
    Optional<Cart> findByBuyer(Buyer buyer);

    /**
     * Находит корзину по ID покупателя.
     * @param buyerId ID покупателя
     * @return Optional с корзиной
     */
    Optional<Cart> findByBuyerIdBuyer(Integer buyerId);
}
