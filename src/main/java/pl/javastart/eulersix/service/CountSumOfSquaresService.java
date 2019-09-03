package pl.javastart.eulersix.service;

public class CountSumOfSquaresService {
    public int countSumOfSquares(int limit){
        int sum = 0;
        for (int i = 0; i <= limit; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }
}
