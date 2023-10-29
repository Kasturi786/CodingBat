package tech.dev.codingbat.recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

public class SplitOdd10Tests {

  private SplitOdd10 splitOdd10;

  /**
   *  splitOdd10([5, 5, 5]) → true true  OK
      splitOdd10([5, 5, 6]) → false false OK
      splitOdd10([5, 5, 6, 1]) → true true  OK
      splitOdd10([6, 5, 5, 1]) → true true  OK
      splitOdd10([6, 5, 5, 1, 10]) → true true  OK
      splitOdd10([6, 5, 5, 5, 1]) → false false OK
      splitOdd10([1]) → true  true  OK
      splitOdd10([]) → false  false OK
      splitOdd10([10, 7, 5, 5]) → true  true  OK
      splitOdd10([10, 0, 5, 5]) → false false OK
      splitOdd10([10, 7, 5, 5, 2]) → true true  OK
      splitOdd10([10, 7, 5, 5, 1]) → false  false OK
   */

  @BeforeEach
  void setUp() {
    splitOdd10 = new SplitOdd10();
  }

  /**
   *  Given an array of ints ,
   *  is it possible to divide the ints into two groups,
   *  so that the sum of one group is a multiple of 10,
   *  and the sum of the other group is odd.
   */

  @ParameterizedTest
  @ArgumentsSource(ArrayandBooleanProvider.class)
  void is_it_possible_to_divide_the_ints_into_two_groups(int[] actual, boolean expected) {
    assertEquals(splitOdd10.splitOdd10(actual),expected);
  }

}
