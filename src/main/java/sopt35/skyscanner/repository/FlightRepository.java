package sopt35.skyscanner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findAllByIsLikeTrue();

    // 가격 합 기준으로 상위 5개 항공편 조회
    List<Flight> findTop5ByOrderByArrPriceAsc();

    // 전체 가격 합 평균 계산
    @Query("SELECT AVG(f.arrPrice + f.depPrice) FROM Flight f")
    float findAveragePriceSum();

}
