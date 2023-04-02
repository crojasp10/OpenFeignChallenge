package com.canguro.challenge.got.service;

import com.canguro.challenge.got.client.GotClientService;
import com.canguro.challenge.got.model.House;
import com.canguro.challenge.got.model.Lord;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

class gotServiceFeignTest {

    @Mock
    private GotClientService houseClient;

    @InjectMocks
    GotServiceFeignImpl gotServiceFeign;

    private Lord lord1;
    private House house1;
    private Lord lord2;
    private House house2;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        Lord lord1 = new Lord();
        lord1.setName("Aegon Targeryan");
        lord1.setUrl("https://www.anapioficeandfire.com/api/characters/298");
        lord1.setGender("Male");

        
        House house1 = new House();
        house1.setName("Targeryan");
        house1.setRegion("Dragon rock");
        house1.setUrl("https://www.anapioficeandfire.com/api/houses/1");
        house1.setCurrenLord(lord1);
        house1.setCurrentLord("https://www.anapioficeandfire.com/api/characters/298");

        Lord lord2 = new Lord();
        lord2.setName("Daenerys Targeryan");
        lord2.setUrl("https://www.anapioficeandfire.com/api/characters/29");
        lord2.setGender("Female");

        House house2 = new House();
        house2.setName("Targeryan");
        house2.setRegion("Dragon rock");
        house2.setUrl("https://www.anapioficeandfire.com/api/houses/2");
        house2.setCurrentLord("https://www.anapioficeandfire.com/api/characters/29");
        house2.setCurrenLord(lord2);


    }

    @Test
    void findAll() {

        when(houseClient.findAll()).thenReturn(Arrays.asList(house1,house2));
        assertNotNull(gotServiceFeign.findAll());
    }


}