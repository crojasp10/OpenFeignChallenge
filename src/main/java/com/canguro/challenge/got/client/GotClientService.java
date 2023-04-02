package com.canguro.challenge.got.client;

import com.canguro.challenge.got.model.House;
import com.canguro.challenge.got.model.Lord;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@FeignClient(name="House-service",url= "https://www.anapioficeandfire.com")
public interface GotClientService {

    @GetMapping("/api/houses")
    public List<House> findAll();

    @GetMapping("/api/characters/{id}")
    public Lord getLordByid(@PathVariable long id);
}
