package com.example.demo.hello.world;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;

@Service
public class HelloWorldService {

    public static final String URL = "https://free.currencyconverterapi.com/api/v5/convert?q=USD_COP&compact=ultra";

    private RestTemplate restTemplate = new RestTemplate();

    public HelloWorldDto getDtoWithTRM(String greeting){
        return new HelloWorldDto(greeting, 1L, getTRM() );
    }

    private Double getTRM() {
        try {
            TrmDto trm = restTemplate.getForEntity(new URI(URL), TrmDto.class).getBody();
            return trm.getTrm();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("No TRM");
        }
    }
}
