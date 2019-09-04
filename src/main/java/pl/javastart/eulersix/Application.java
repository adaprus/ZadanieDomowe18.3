package pl.javastart.eulersix;
import pl.javastart.eulersix.service.SquareService;
import pl.javastart.eulersix.service.CountSumOfSquaresService;

public class Application {
    public static void main(String[] args) {
        CountSumOfSquaresService sumOfSquaresService = new CountSumOfSquaresService();
        SquareService squareOfSumService = new SquareService();
        int limit = 100;
        long subtract = (long) squareOfSumService.countSubtractSquareOfSumAndSumOfSquares(limit);
        System.out.println("Różnica kwadratu sumy i sumy kwadratów liczb do " + limit + " wynosi " + subtract);
    }
}
