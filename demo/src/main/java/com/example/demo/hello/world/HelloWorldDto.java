package com.example.demo.hello.world;

import jdk.nashorn.internal.objects.annotations.Getter;

public class HelloWorldDto {

    private String greeting;
    private Long id;
    private double trm;

    public double getTrm() {
        return trm;
    }

    public void setTrm(double trm) {
        this.trm = trm;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    public HelloWorldDto(String greeting, long id, double trm) {
        this.greeting = greeting;
        this.id = id;
        this.trm = trm;
    }
}
