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

/*

+10+
Bad naming, it's not cleare what is testing
It would be better to give reasonable names:
Task01 -> JewelsOnStonesSolution
testCountJewelsInStones() -> countJewelsInStones_StonesAreInJewels_CoutedOk, or something using given when then rule

+12+
Consider using assetThat(actual).isEqualTo(expected)

+16+
Split it to different tests - positive, negative, edge cases

 */
