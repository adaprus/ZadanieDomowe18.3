package pl.javastart.eulersix.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SquareServiceTest {
    private SquareService underTest;

    @BeforeEach
    void setUp() {
        underTest = new SquareService();
    }

    @Test
    void whenLimitIsTwo_shouldBeFour() {
        //given
        int limit = 2;
        double expectedResult = 4;

        //when
        double result = underTest.countSubtractSquareOfSumAndSumOfSquares(limit);

        //then
        Assertions.assertThat(expectedResult).isEqualTo(result);
    }

    @Test
    void whenLimitIsThree_shouldBeTwentyTwo() {
        //given
        int limit = 3;
        double expectedResult = 22;

        //when
        double result = underTest.countSubtractSquareOfSumAndSumOfSquares(limit);

        //then
        Assertions.assertThat(expectedResult).isEqualTo(result);
    }

    @Test
    void whenLimitIsFour_shouldBeSeventy() {
        //given
        int limit = 4;
        double expectedResult = 70;

        //when
        double result = underTest.countSubtractSquareOfSumAndSumOfSquares(limit);

        //then
        Assertions.assertThat(expectedResult).isEqualTo(result);
    }
}