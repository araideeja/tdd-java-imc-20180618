package com.example.demo;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class MyRandomTest {

    @Test
    public void test() {
        Random random = new Random5();
        MyRandom myRandom = new MyRandom(random);
        int actualResult = myRandom.generate();
        
        assertEquals(5, actualResult);
    }

}

class Random5 extends Random {
    @Override
    protected int next(int bits) {
        return 5;
    }
}
