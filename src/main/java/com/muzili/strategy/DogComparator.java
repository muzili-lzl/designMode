package com.muzili.strategy;

/**
 *
 * @author lizuoliang
 * @create 2022/10/18 15:59
 */
public class DogComparator implements Comparator<Dog>{
    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.getFood() < o2.getFood()) return -1;
        if (o1.getFood() > o2.getFood()) return 1;
        return 0;
    }
}
