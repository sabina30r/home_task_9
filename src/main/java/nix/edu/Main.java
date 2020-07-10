package nix.edu;

import nix.edu.service.impl.BlockImpl;
import nix.edu.util.Retry;

public class Main {

    public static void main(String[] args) {

        BlockImpl block = new BlockImpl();
        Retry retryClass = new Retry<BlockImpl>();
        try {
            retryClass.retry(block, 10);
        } catch (Exception e) {
            System.out.println("Attempts are over. Exception was caught in Main class");
            e.printStackTrace();
        }
    }

}

