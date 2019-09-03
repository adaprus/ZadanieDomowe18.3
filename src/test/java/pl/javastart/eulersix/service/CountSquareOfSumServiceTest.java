package pl.javastart.eulersix.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CountSquareOfSumServiceTest {
    private CountSquareOfSumService underTest;

    @BeforeEach
    void setUp() {
        underTest = new CountSquareOfSumService();
    }

    @Test
    void whenLimitIsTwo_shouldBeNine() {
        //given
        int limit = 2;
        double expectedResult = 9;

        //when
        double result = underTest.countSquareOfSum(limit);

        //then
        Assertions.assertThat(expectedResult).isEqualTo(result);
    }

    @Test
    void whenLimitIsThree_shouldBeThirtySix() {
        //given
        int limit = 3;
        double expectedResult = 36;

        //when
        double result = underTest.countSquareOfSum(limit);

        //then
        Assertions.assertThat(expectedResult).isEqualTo(result);
    }

    @Test
    void whenLimitIsFour_shouldBeHundred() {
        //given
        int limit = 4;
        double expectedResult = 100;

        //when
        double result = underTest.countSquareOfSum(limit);

        //then
        Assertions.assertThat(expectedResult).isEqualTo(result);
    }
}