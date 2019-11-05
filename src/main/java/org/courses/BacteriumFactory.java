package org.courses;

import java.util.HashMap;

public class BacteriumFactory {
    private static final HashMap<BacteriumType, Bacterium> bacteriumMap = new HashMap<>();


    public static Bacterium getBacterium(BacteriumType bacteriumType) {
        Bacterium bacterium = bacteriumMap.get(bacteriumType);
        if (bacterium == null) {
            switch (bacteriumType) {
                case BIGGER:
                    bacterium = new BiggerBacterium();
                case BIG:
                    bacterium = new BigBacterium();
                case MIDDLE:
                    bacterium = new MiddleBacterium();
                case SMALL:
                    bacterium = new SmallBacterium();
            }
            bacteriumMap.put(bacteriumType, bacterium);
        }
        return bacterium;

    }


}
