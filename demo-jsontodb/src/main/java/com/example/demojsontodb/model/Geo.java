package com.example.demojsontodb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Embeddable
public class Geo {

    private String lat;
    private String lng;
}
