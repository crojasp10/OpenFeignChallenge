package com.canguro.challenge.got.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data
@NoArgsConstructor
public class House {

    private String url;
    private String name;
    private String region;
    private Lord currenLord;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String currentLord;

}
