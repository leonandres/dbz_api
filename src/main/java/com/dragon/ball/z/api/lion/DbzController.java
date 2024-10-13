package com.dragon.ball.z.api.lion;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
@RequestMapping("/api/personajes")
public class DbzController {

    private final String DBZ_URL = "https://dragonball-api.com/api/characters/";
    private final RestTemplate restTemplate = new RestTemplate();
    @GetMapping("/{id}")
    public Personaje getPersonajePorId(@PathVariable int id){
        return restTemplate.getForObject(DBZ_URL + id, Personaje.class);
    }
}
