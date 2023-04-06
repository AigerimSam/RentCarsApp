package com.example.rentcarsapp.model.dto;

import com.example.rentcarsapp.model.Address;
import com.example.rentcarsapp.model.Car;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderDto {
    private Long id;
    private Car car;
    private Boolean babySeat;
    private Boolean withDriver;
    private String clientName;
    private String clientPhone;
    private String clientEmail;
    private List<Address> getAddress;
    private List<Address> returnAddress;
    private LocalDateTime dateTimeFrom;
    private LocalDateTime dateTimeTo;
    private Double priceBeforeDiscount;
    private Double priceWithDiscount;

}
