package ru.vlsu.ispi.farmermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlsu.ispi.farmermarket.model.User;

import java.util.Optional;
/**
 * Репозиторий для работы с пользователями.
 * Предоставляет методы доступа к данным таблицы user.
 */

public interface UserRepository extends JpaRepository<User, Integer> {
    /**
     * Находит пользователя по email.
     * @param email email пользователя
     * @return Optional с пользователем или пустой Optional
     */

    Optional<User> findByEmail(String email);

    /**
     * Проверяет, существует ли пользователь с указанным email.
     * @param email email для проверки
     * @return true если существует, false если нет
     */

    boolean existsByEmail(String email);
}
