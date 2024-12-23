package sopt35.skyscanner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {
}
