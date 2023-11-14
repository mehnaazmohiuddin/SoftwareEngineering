package com.mehnaaz.makeadonation.model;

import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

@Table
public record Charity(
                        @Id
                      int id,
                      @NotEmpty  String name,
                      String orgnaization,
                      @NotEmpty int amount,
                      @NotEmpty String currency,
                      Date date,
                      String city) {



}
