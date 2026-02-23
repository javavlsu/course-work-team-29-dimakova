package ru.vlsu.ispi.farmermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlsu.ispi.farmermarket.model.Seller;
import ru.vlsu.ispi.farmermarket.model.User;

import java.util.List;
import java.util.Optional;

/**
 * Репозиторий для работы с продавцами (фермерами).
 */

public interface SellerRepository extends JpaRepository<Seller, Integer> {
    /**
     * Находит продавца по пользователю.
     * @param user пользователь
     * @return Optional с продавцом
     */
    Optional<Seller> findByUser(User user);

    /**
     * Ищет продавцов по названию фермы.
     * @param farm название фермы
     * @return Optional с продавцом
     */
    Optional<Seller> findByFarm(String farm);

}
