package com.example.cleancode.farm.walking;

import com.example.cleancode.farm.animal.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class WalkingScheduler {

    Logger logger = Logger.getLogger("WalkingScheduler");

    private FenceController fenceController;

    @Autowired
    public WalkingScheduler(FenceController fenceController) {
        this.fenceController = fenceController;
    }

    public void initializeWalking(Animal animal) {
        System.out.println("Initialised walking for the animal " + animal.toString());
    }
}
