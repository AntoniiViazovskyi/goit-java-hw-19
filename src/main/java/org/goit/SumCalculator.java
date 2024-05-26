package org.goit;

public class SumCalculator {
    public int sum(int number) {
        if (number < 1) {throw new IllegalArgumentException("Number can't be less than 1");}
        int result = 0;
        for (int i = 1; i < number + 1; i++) {
            result += i;
        }
        return result;
    }
}
