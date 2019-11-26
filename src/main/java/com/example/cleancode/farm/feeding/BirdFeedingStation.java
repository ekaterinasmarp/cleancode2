package com.example.cleancode.farm.feeding;

import com.example.cleancode.farm.GrainProvider;
import com.example.cleancode.farm.animal.Bird;
import com.example.cleancode.farm.feeding.FeedingStation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BirdFeedingStation implements FeedingStation {

    @Autowired
    public BirdFeedingStation(GrainProvider grainProvider) {

    }

    public void feed(Bird bird) {
    }
}
