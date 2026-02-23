package ru.vlsu.ispi.farmermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlsu.ispi.farmermarket.model.Buyer;
import ru.vlsu.ispi.farmermarket.model.Complaint;
import ru.vlsu.ispi.farmermarket.model.ComplaintStatus;
import ru.vlsu.ispi.farmermarket.model.Seller;

import java.util.List;

/**
 * Репозиторий для работы с жалобами.
 */
public interface ComplaintRepository extends JpaRepository<Complaint, Integer> {

    /**
     * Находит жалобы на продавца.
     * @param seller продавец
     * @return список жалоб
     */
    List<Complaint> findBySeller(Seller seller);

    /**
     * Находит жалобы покупателя.
     * @param buyer покупатель
     * @return список жалоб
     */
    List<Complaint> findByBuyer(Buyer buyer);

    /**
     * Находит жалобы по статусу.
     * @param status статус
     * @return список жалоб
     */
    List<Complaint> findByStatus(ComplaintStatus status);
}
