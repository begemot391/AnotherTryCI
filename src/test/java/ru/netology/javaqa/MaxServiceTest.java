package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxServiceTest {

    @Test
    public void aMax(){

        MaxService max = new MaxService();

        int a = 5;
        int b = 3;

        int exp = a;
        int act = max.findMax( a, b);

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void bMax(){

        MaxService max = new MaxService();

        int a = 4;
        int b = 6;

        int exp = b;
        int act = max.findMax( a, b);

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void numEqual(){

        MaxService max = new MaxService();

        int a = 5;
        int b = 5;

        int exp = 0;
        int act = max.findMax( a, b);

        Assertions.assertEquals(exp, act);
    }
}
