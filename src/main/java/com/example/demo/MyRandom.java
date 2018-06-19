package com.example.demo;

import java.util.Random;

public class MyRandom {
    Random random;
    
    public MyRandom(Random random) {
        this.random = random;
     }

    public int generate() {
        return this.random.nextInt(10);
    }

}
