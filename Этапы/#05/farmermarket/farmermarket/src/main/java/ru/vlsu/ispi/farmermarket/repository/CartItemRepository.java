package ru.vlsu.ispi.farmermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlsu.ispi.farmermarket.model.Cart;
import ru.vlsu.ispi.farmermarket.model.CartItem;
import ru.vlsu.ispi.farmermarket.model.Product;

import java.util.List;
import java.util.Optional;
/**
 * Репозиторий для работы с элементами корзины.
 */
public interface CartItemRepository extends JpaRepository<CartItem, Integer> {
    /**
     * Находит все элементы в корзине.
     * @param cart корзина
     * @return список элементов
     */
    List<CartItem> findByCart(Cart cart);

    /**
     * Находит элемент корзины по товару.
     * @param product товар
     * @return Optional с элементом
     */
    Optional<CartItem> findByProduct(Product product);

    /**
     * Удаляет все элементы из корзины.
     * @param cart корзина
     */
    void deleteByCart(Cart cart);

}
