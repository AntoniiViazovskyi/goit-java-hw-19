package org.goit;

public class SumCalculator {
    public int sum(int numberToSum) {
        if (numberToSum < 1) {throw new IllegalArgumentException("Number can't be less than 1");}
        int result = 0;
        for (int i = 1; i < numberToSum + 1; i++) {
            result += i;
        }
        return result;
    }
}
