package com.crud.resarvation.service;

import com.crud.resarvation.entity.ReservationEnt;

import java.util.List;

public interface ResarvationService {

    ReservationEnt createResarvation(ReservationEnt reservationEnt);

    ReservationEnt getReservationById(Long reservationId);

    List<ReservationEnt> getAllReservation();

    ReservationEnt updateReservation(ReservationEnt reservationEnt);

    void deleteReservation(Long reservationId);
}
