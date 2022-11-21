package com.example.demojsontodb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Embeddable
public class Address {

    private String street;
    private String suite;
    private String city;
    private String zipcode;

    @Embedded
    private Geo geo;

}
