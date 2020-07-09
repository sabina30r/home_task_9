package nix.edu;

import nix.edu.service.impl.BlockImpl;
import nix.edu.util.Retry;

public class Main {

    public static void main(String[] args) throws Exception {

        BlockImpl block = new BlockImpl();
        Retry retryClass = new Retry<BlockImpl>();
        retryClass.retry(block, 10);
    }

}
