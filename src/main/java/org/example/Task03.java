package org.example;

public class Task03 {

    public int maxNumbersOfBalloons(String text) {
        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;
        int count = 0;

        for (char c : text.toCharArray()) {
            switch (c) {
                case 'b':
                    b += 1;
                    break;
                case 'a':
                    a += 1;
                    break;
                case 'l':
                    l += 1;
                    break;
                case 'o':
                    o += 1;
                    break;
                case 'n':
                    n += 1;
                    break;
            }

            if (b >= 1 && a >= 1 && l >= 2 && o >= 2 && n >= 1) {
                count += 1;

                b -= 1;
                a -= 1;
                l -= 2;
                o -= 2;
                n -= 1;
            }
        }
        return count;
    }
}
