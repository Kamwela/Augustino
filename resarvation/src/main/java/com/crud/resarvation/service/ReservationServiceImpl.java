package com.crud.resarvation.service;

import com.crud.resarvation.entity.ReservationEnt;
import com.crud.resarvation.repository.ResarvationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements ResarvationService{
    private ResarvationRepository resarvationRepository;
    @Override
    public ReservationEnt createResarvation(ReservationEnt reservationEnt) {
        return resarvationRepository.save(reservationEnt);
    }

    @Override
    public ReservationEnt getReservationById(Long reservationId) {
        Optional<ReservationEnt> optionalReservationEnt = resarvationRepository.findById(reservationId);
        return optionalReservationEnt.get();
    }

    @Override
    public List<ReservationEnt> getAllReservation() {

        return resarvationRepository.findAll();
    }

    @Override
    public ReservationEnt updateReservation(ReservationEnt reservationEnt) {
        ReservationEnt existingReservation = resarvationRepository.findById(reservationEnt.getId()).get();
        existingReservation.setCustomername(reservationEnt.getCustomername());
        existingReservation.setContactInfo(reservationEnt.getContactInfo());
        existingReservation.setResarvationDate(reservationEnt.getResarvationDate());
        existingReservation.setResarvatioTime(reservationEnt.getResarvatioTime());
        existingReservation.setNumberGuest(reservationEnt.getNumberGuest());
        existingReservation.setStatus(reservationEnt.getStatus());
        existingReservation.setPaymentMode(reservationEnt.getPaymentMode());
        return null;
    }

    @Override
    public void deleteReservation(Long reservationId) {

        resarvationRepository.deleteById(reservationId);
    }
}
