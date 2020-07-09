package nix.edu.service.impl;

import nix.edu.service.Block;

import java.util.Random;

public class BlockImpl implements Block {

    Random random = new Random();
    int randomNumber = random.nextInt(10);
    int randomNumberForComparison = random.nextInt(10);

    @Override
    public void run() throws Exception {
        if (randomNumber != randomNumberForComparison) {
            throw new Exception("Numbers aren't equal");
        } else {
            System.out.println("What luck, both numbers are equal to " + randomNumber);
        }
    }

}
