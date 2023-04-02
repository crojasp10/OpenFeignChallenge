package com.canguro.challenge.got.service;


import com.canguro.challenge.got.client.GotClientService;
import com.canguro.challenge.got.model.House;
import com.canguro.challenge.got.model.Lord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("GotServiceFeign")
public class GotServiceFeignImpl implements GotService{

    @Autowired
    GotClientService houseClient;

    @Override
    public List<House> findAll() {

        List<House> houses = houseClient.findAll();
        List resultResponse = new ArrayList();

        for (House house: houses) {
            House newHouse = new House();
            String urlLord = house.getCurrentLord();
            Lord lord = new Lord();
            newHouse = house;
            if (urlLord != ""){
                String lordCodeString = urlLord.substring(49);
                lord = houseClient.getLordByid(Integer.parseInt(lordCodeString));
                newHouse.setCurrenLord(lord);
                }

            resultResponse.add(newHouse);
        }
        return resultResponse;
    }
}
