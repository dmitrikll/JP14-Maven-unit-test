package org.example;

import org.junit.Assert;
import org.junit.Test;

public class Task03Test {

    @Test
    public void testMaxNumbersOfBalloons() {
        Task03 testMAxNumbers = new Task03();

        Assert.assertEquals(1, testMAxNumbers.maxNumbersOfBalloons("nlaebolko"));
        Assert.assertEquals(2, testMAxNumbers.maxNumbersOfBalloons("loonbalxballpoon"));
        Assert.assertEquals(0, testMAxNumbers.maxNumbersOfBalloons("qweqweqwe"));
    }
}
