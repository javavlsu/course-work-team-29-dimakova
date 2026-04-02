package ru.vlsu.ispi.farmermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlsu.ispi.farmermarket.model.Buyer;
import ru.vlsu.ispi.farmermarket.model.Order;
import ru.vlsu.ispi.farmermarket.model.OrderStatus;

import java.time.LocalDate;
import java.util.List;

/**
 * Репозиторий для работы с заказами.
 */
public interface OrderRepository extends JpaRepository<Order, Integer> {
    /**
     * Находит заказы покупателя.
     * @param buyer покупатель
     * @return список заказов
     */
    List<Order> findByBuyer(Buyer buyer);


    /**
     * Находит заказы по статусу.
     * @param status статус заказа
     * @return список заказов
     */
    List<Order> findByStatus(OrderStatus status);
}
