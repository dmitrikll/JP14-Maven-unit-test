package org.example;

public class Task01 {

    public int countJewelsInStones(String jewels, String stones) {
        int count = 0;

        for (int i = 0; i < stones.length(); i += 1) {
            if (jewels.indexOf(stones.charAt(i)) != -1) {
                count += 1;
            }
        }
        return count;
    }
}
