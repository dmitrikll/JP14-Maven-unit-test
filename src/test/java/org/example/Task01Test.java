package org.example;

import org.junit.Assert;
import org.junit.Test;

public class Task01Test {

    @Test
    public void testCountJewelsInStones() {
        Task01 testCount = new Task01();

        Assert.assertEquals(3, testCount.countJewelsInStones("aA", "aAAbbbb"));
        Assert.assertEquals(0, testCount.countJewelsInStones("", ""));
        Assert.assertEquals(0, testCount.countJewelsInStones("aa", "AA"));
        Assert.assertEquals(6, testCount.countJewelsInStones("acd", "aaabbbccc"));
    }


}
