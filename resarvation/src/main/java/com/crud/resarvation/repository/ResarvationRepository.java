package com.crud.resarvation.repository;

import com.crud.resarvation.entity.ReservationEnt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResarvationRepository extends JpaRepository<ReservationEnt, Long> {
}
