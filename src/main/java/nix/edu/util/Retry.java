package nix.edu.util;

import nix.edu.service.Block;

public class Retry<T extends Block> {

    private static final int PAUSE = 100;

    public void retry(T block, int numberOfTries) throws Exception {
        for (int attempt = 0; attempt < numberOfTries; attempt++) {
            try {
                System.out.println("This is " + attempt + " attempt");
                block.run();
                Thread.sleep(PAUSE * attempt);
            } catch (Exception e) {
                System.out.println("Exception from interface implementation was caught. Message: " + e.getMessage());
                Thread.sleep(PAUSE * attempt);
                if (attempt == numberOfTries - 1) {
                    throw e;
                }
            }
        }
    }
}
