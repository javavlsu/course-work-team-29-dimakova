package ru.vlsu.ispi.farmermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlsu.ispi.farmermarket.model.Category;
import ru.vlsu.ispi.farmermarket.model.User;

import java.util.Optional;

/**
 * Репозиторий для работы с категориями товаров.
 */

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    /**
     * Находит категорию по названию.
     * @param name название категории
     * @return Optional с категорией
     */

    Optional<Category> findByName(String name);

    /**
     * Проверяет, существует ли категория с таким названием.
     * @param name название категории
     * @return true если существует
     */

    boolean existsByName(String name);
}
