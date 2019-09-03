package pl.javastart.eulersix.service;

public class CountSquareOfSumService {
    public double countSquareOfSum(int limit){
        int sum = 0;
        for (int i = 0; i <= limit; i++) {
            sum += i;
        }
        return Math.pow(sum, 2);
    }
}
