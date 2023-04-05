package com.example.rentcarsapp.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tb_car")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String model;
    private  String photo;
    private  LocalDate mnfYear;
    private  String color;
    private  Double engineVolume;
    private String engineType;
    private String transmission;
    private  Integer gasPer100;
    private String category;
    private  Boolean isAvailable;
    @OneToMany
    private  List<Price> price;
    @OneToOne(mappedBy = "car_id", cascade = CascadeType.ALL)
    private  Order orderDetails;
}
