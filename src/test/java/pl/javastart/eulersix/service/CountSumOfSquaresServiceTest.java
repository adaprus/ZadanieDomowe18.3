package pl.javastart.eulersix.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountSumOfSquaresServiceTest {
    private CountSumOfSquaresService underTest;
    @BeforeEach
    void setUp() {
        underTest = new CountSumOfSquaresService();
    }

    @Test
    void whenLimitIsTwo_shouldBeFive() {
        //given
        int limit = 2;
        int expectedResult = 5;

        //when
        int result = underTest.countSumOfSquares(limit);

        //then
        Assertions.assertThat(expectedResult).isEqualTo(result);
    }

    @Test
    void whenLimitIsThree_shouldBeFourteen() {
        //given
        int limit = 3;
        int expectedResult = 14;

        //when
        int result = underTest.countSumOfSquares(limit);

        //then
        Assertions.assertThat(expectedResult).isEqualTo(result);
    }

    @Test
    void whenLimitIsFour_shouldBeThirty() {
        //given
        int limit = 4;
        int expectedResult = 30;

        //when
        int result = underTest.countSumOfSquares(limit);

        //then
        Assertions.assertThat(expectedResult).isEqualTo(result);
    }


}