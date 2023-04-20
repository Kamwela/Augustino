package com.crud.resarvation.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "reservation_det")
public class ReservationEnt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(nullable = false)
    private String customername;
    @Column(nullable = false)
    private String contactInfo;
    @Column(nullable = false)
    private LocalDate resarvationDate;
    @Column(nullable = false)
    private Integer resarvatioTime;
    @Column(nullable = false)
    private Integer numberGuest;
    @Column(nullable = false)
    private String status;
    @Column(nullable = false)
    private String paymentMode;
}
