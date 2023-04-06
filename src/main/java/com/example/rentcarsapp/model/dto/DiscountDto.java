package com.example.rentcarsapp.model.dto;

import com.example.rentcarsapp.model.Car;
import lombok.Data;

import javax.persistence.ManyToOne;
import java.time.LocalDate;
@Data
public class DiscountDto {
    private Long id;
    private CarDto carDto;
    private Double discount;
    private LocalDate startDate;
    private LocalDate endDate;
}
