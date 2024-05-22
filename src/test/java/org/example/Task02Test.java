package org.example;

import org.junit.Assert;
import org.junit.Test;

public class Task02Test {

    @Test
    public void numGoodPair() {
        Task02 testNum = new Task02();

        int num1[] = {1, 2, 3, 1, 1, 3};
        int num2[] = {1, 1, 1, 1};
        int num3[] = {1, 2, 3};

        Assert.assertEquals(4, testNum.numGoodPair(num1));
        Assert.assertEquals(6, testNum.numGoodPair(num2));
        Assert.assertEquals(0, testNum.numGoodPair(num3));
    }
}
