package pl.javastart.eulersix.service;

public class SquareService {
    private int countSquareOfSum(int limit) {
        int sum = 0;
        for (int i = 0; i <= limit; i++) {
            sum += i;
        }
        return (int)Math.pow(sum, 2);
    }

    private int countSumOfSquares(int limit) {
        int sum = 0;
        for (int i = 0; i <= limit; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    public int countSubtractSquareOfSumAndSumOfSquares(int limit){
        return countSquareOfSum(limit) - countSumOfSquares(limit);
    }
}
