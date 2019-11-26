package com.example.cleancode.farm;

import com.example.cleancode.farm.animal.Chick;
import com.example.cleancode.farm.animal.Cow;
import com.example.cleancode.farm.animal.Pig;
import com.example.cleancode.farm.feeding.BirdFeedingStation;
import com.example.cleancode.farm.feeding.CattleFeedingStation;
import com.example.cleancode.farm.paddock.MaterialDeliveryCompany;
import com.example.cleancode.farm.paddock.Paddock;
import com.example.cleancode.farm.walking.WalkingScheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OldMacdonaldJob {

    @Autowired
    private MaterialDeliveryCompany materialDeliveryCompany;
    @Autowired
    private CattleFeedingStation cattleFeedingStation;
    @Autowired
    private BirdFeedingStation birdFeedingStation;
    @Autowired
    private WalkingScheduler walkingScheduler;
    @Autowired
    private Paddock paddock;

    public void liveNormalDayAtFarm(List<Cow> cows, List<Pig> pigs, List<Chick> chicks) {
        lodgeAnimals(cows, pigs);
        feedAnimals(cows, pigs, chicks);
        organizeFreeWalkingConditions(chicks);
    }

    private void organizeFreeWalkingConditions(List<Chick> chicks) {
        for (Chick chick : chicks) {
            walkingScheduler.initializeWalking(chick);
        }
    }

    private void feedAnimals(List<Cow> cows, List<Pig> pigs, List<Chick> chicks) {
        for (Chick chick : chicks) {
            birdFeedingStation.feed(chick);
        }
        for (Cow cow : cows) {
            cattleFeedingStation.feed(cow);
        }
        for (Pig pig : pigs) {
            cattleFeedingStation.feed(pig);
        }
    }

    private void lodgeAnimals(List<Cow> cows,  List<Pig> pigs) {
        for (Cow cow : cows) {
            paddock.lodgeAnimal(cow);
        }
        for (Pig pig : pigs) {
            paddock.lodgeAnimal(pig);
        }
    }

}
