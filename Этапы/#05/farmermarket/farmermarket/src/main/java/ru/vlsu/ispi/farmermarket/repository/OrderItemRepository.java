package ru.vlsu.ispi.farmermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlsu.ispi.farmermarket.model.Order;
import ru.vlsu.ispi.farmermarket.model.OrderItem;
import ru.vlsu.ispi.farmermarket.model.OrderItemStatus;
import ru.vlsu.ispi.farmermarket.model.Seller;

import java.util.List;

/**
 * Репозиторий для работы с элементами заказа.
 */
public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {
    /**
     * Находит все элементы заказа.
     * @param order заказ
     * @return список элементов
     */
    List<OrderItem> findByOrder(Order order);

    /**
     * Находит элементы заказа по продавцу.
     * @param seller продавец
     * @return список элементов
     */
    List<OrderItem> findBySeller(Seller seller);

    /**
     * Находит элементы заказа по статусу.
     * @param status статус
     * @return список элементов
     */
    List<OrderItem> findByStatus(OrderItemStatus status);

}
