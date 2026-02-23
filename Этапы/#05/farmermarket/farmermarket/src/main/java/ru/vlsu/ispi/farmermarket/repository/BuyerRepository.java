package ru.vlsu.ispi.farmermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlsu.ispi.farmermarket.model.Buyer;
import ru.vlsu.ispi.farmermarket.model.User;

import java.util.Optional;

/**
 * Репозиторий для работы с покупателями.
 */

public interface BuyerRepository extends JpaRepository<Buyer, Integer> {
    /**
     * Находит покупателя по пользователю.
     * @param user пользователь
     * @return Optional с покупателем
     */

    Optional<Buyer> findByUser(User user);

    /**
     * Находит покупателя по ID пользователя.
     * @param userId ID пользователя
     * @return Optional с покупателем
     */

    Optional<Buyer> findByUserIdUser(Integer userId);
}
