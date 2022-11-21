package com.example.demojsontodb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Embeddable
public class Company {

    @Column( name = "company_name")
    private String name;
    private String catchPhrase;
    private String bs;
}
