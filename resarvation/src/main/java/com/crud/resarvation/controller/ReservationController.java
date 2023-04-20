package com.crud.resarvation.controller;

import com.crud.resarvation.entity.ReservationEnt;
import com.crud.resarvation.service.ResarvationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/reservation")
public class ReservationController {

    private ResarvationService resarvationService;

    @PostMapping
    public ResponseEntity<ReservationEnt> createReservation(ReservationEnt reservationEnt){
        ReservationEnt savedReservation = resarvationService.createResarvation(reservationEnt);
        return new ResponseEntity<>(reservationEnt, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<ReservationEnt>> getAllReservation(){
        List<ReservationEnt> reservationEnts = resarvationService.getAllReservation();
        return new ResponseEntity<>(reservationEnts, HttpStatus.OK);
    }
    @PutMapping("{id}")
    public ResponseEntity<ReservationEnt> updateReservationEnt(@PathVariable("id")Long reservationId,@RequestParam
                                                               ReservationEnt reservationEnt){
        reservationEnt.setId(reservationId);
        ReservationEnt updateReservationEnt = resarvationService.updateReservation(reservationEnt);
                return new ResponseEntity<>(updateReservationEnt, HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteReservationEnt(@PathVariable("id")Long reservationId)
    {
        resarvationService.deleteReservation(reservationId);
        return new ResponseEntity<>( "Reservation detail successifuly deleted", HttpStatus.OK);
    }

}
