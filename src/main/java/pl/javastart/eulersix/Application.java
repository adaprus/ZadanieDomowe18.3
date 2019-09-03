package pl.javastart.eulersix;
import pl.javastart.eulersix.service.CountSquareOfSumService;
import pl.javastart.eulersix.service.CountSumOfSquaresService;

public class Application {
    public static void main(String[] args) {
        CountSumOfSquaresService sumOfSquaresService = new CountSumOfSquaresService();
        CountSquareOfSumService squareOfSumService = new CountSquareOfSumService();
        int limit = 100;
        long subtract = (long) squareOfSumService.countSquareOfSum(limit)
                - (long) sumOfSquaresService.countSumOfSquares(limit);
        System.out.println("Różnica kwadratu sumy i sumy kwadratów liczb do " + limit + " wynosi " + subtract);
    }
}
