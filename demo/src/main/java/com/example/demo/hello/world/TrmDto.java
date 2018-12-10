package com.example.demo.hello.world;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TrmDto {
    @JsonProperty("USD_COP")
    private Double trm;

    public TrmDto(Double trm) {
        this.trm = trm;
    }

    public TrmDto(){
super();
    }

    public Double getTrm() {
        return trm;
    }

    public void setTrm(Double trm) {
        this.trm = trm;
    }
}
