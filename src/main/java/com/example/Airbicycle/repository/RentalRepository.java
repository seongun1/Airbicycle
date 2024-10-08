package com.example.Airbicycle.repository;

import com.example.Airbicycle.domain.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface RentalRepository extends JpaRepository<Rental,Long> {
    // 특정 사용자의 대여기록
    List<Rental> findByUserId(Long userId);
    // 특정 자전거의 대여 기록
    List<Rental> findByBicycleId(Long BicycleId);
}
