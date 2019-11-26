package com.example.cleancode.farm.config;

import com.example.cleancode.farm.GrainProvider;
import com.example.cleancode.farm.GrassProvider;
import com.example.cleancode.farm.paddock.MaterialDeliveryCompany;
import com.example.cleancode.farm.paddock.MaterialType;
import com.example.cleancode.farm.paddock.Paddock;
import com.example.cleancode.farm.walking.FenceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FarmConfiguration {

    @Autowired
    MaterialDeliveryCompany materialDeliveryCompany;

    @Bean
    public FenceController createFenceController () {
        return new FenceController(MaterialType.Wood, materialDeliveryCompany);
    }

    @Bean
    public GrainProvider createGrainProvider () {
        return new GrainProvider("");
    }

    @Bean
    public GrassProvider createGrassProvider() {
        return new GrassProvider("x600 - grass authority");
    }

    @Bean
    public Paddock createPaddock() {
        return new Paddock(1, 2, MaterialType.Wood, materialDeliveryCompany);
    }


}
