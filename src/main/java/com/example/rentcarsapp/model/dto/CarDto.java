package com.example.rentcarsapp.model.dto;

import com.example.rentcarsapp.model.Order;
import com.example.rentcarsapp.model.Price;
import com.example.rentcarsapp.model.enums.Category;
import com.example.rentcarsapp.model.enums.Color;
import com.example.rentcarsapp.model.enums.EngineType;
import com.example.rentcarsapp.model.enums.Transmission;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
@Data
public class CarDto {
    private Long id;
    private String model;
    private String photo;
    private LocalDate mnfYear;
    private Color color;
    private Double engineVolume;
    private EngineType engineType;
    private Transmission transmission;
    private Integer gasPer100;
    private Category category;
    private Boolean isAvailable;
    private List<Price> price;
    private Order orderDetails;
}
