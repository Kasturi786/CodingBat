package tech.dev.codingbat.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CanFix34Tests {
  private CanFix34 canFix34;

  /* fix34([1, 3, 1, 4]) - [1, 3, 4, 1] [1, 3, 4, 1]  OK
     fix34([1, 3, 1, 4, 4, 3, 1]) - [1, 3, 4, 1, 1, 3, 4]  [1, 3, 4, 1, 1, 3, 4] OK
     fix34([3, 2, 2, 4]) - [3, 4, 2, 2]  [3, 4, 2, 2]  OK
     fix34([3, 2, 3, 2, 4, 4]) - [3, 4, 3, 4, 2, 2]  [3, 4, 3, 4, 2, 2]  OK
     fix34([2, 3, 2, 3, 2, 4, 4]) - [2, 3, 4, 3, 4, 2, 2]  [2, 3, 4, 3, 4, 2, 2] OK
     fix34([5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5]) - [5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4]  [5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4]  OK
     fix34([3, 1, 4]) - [3, 4, 1]  [3, 4, 1] OK
     fix34([3, 4, 1]) - [3, 4, 1]  [3, 4, 1] OK
     fix34([1, 1, 1]) - [1, 1, 1]  [1, 1, 1] OK
     fix34([1]) - [1]  [1] OK
     fix34([]) - []  []  OK
     fix34([7, 3, 7, 7, 4]) - [7, 3, 4, 7, 7]  [7, 3, 4, 7, 7] OK
     fix34([3, 1, 4, 3, 1, 4]) - [3, 4, 1, 3, 4, 1]  [3, 4, 1, 3, 4, 1]  OK
     fix34([3, 1, 1, 3, 4, 4]) - [3, 4, 1, 3, 4, 1]  [3, 4, 1, 3, 4, 1]  OK
   */
  private static int[][][] fix34Data() {
    return new int[][][] { {new int[]{1, 3, 1, 4},new int[]{1, 3, 4, 1}},
                            {new int[]{1, 3, 1, 4, 4, 3, 1}, new int[]{1, 3, 4, 1, 1, 3, 4}},
                            {new int[]{3, 2, 2, 4}, new int[]{3, 4, 2, 2}},
                            {new int[]{3, 2, 3, 2, 4, 4},new int[]{3, 4, 3, 4, 2, 2}},
                            {new int[]{5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5},new int[]{5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4}},
                            {new int[]{3, 1, 4},new int[]{3, 4, 1}},
                            {new int[]{3, 4, 1},new int[]{3, 4, 1}},
                            {new int[]{1, 1, 1},new int[]{1, 1, 1}},
                            {new int[]{1},new int[]{1}},
                            {new int[]{},new int[]{}},
                            {new int[]{7, 3, 7, 7, 4},new int[]{7, 3, 4, 7, 7}},
                            {new int[]{3, 1, 4, 3, 1, 4},new int[]{3, 4, 1, 3, 4, 1}},
                            {new int[]{3, 1, 1, 3, 4, 4},new int[]{3, 4, 1, 3, 4, 1}}
                            };
  }

  @BeforeEach
  void setUp() {
    canFix34 = new CanFix34();
  }
  @ParameterizedTest
  @MethodSource(value =  "fix34Data")
  void rearranged_so_that_every_3_is_immediately_followed_by_a_4(int[][] fix34Data) {

    assertEquals(true, Arrays.equals(fix34Data[1], canFix34.fix34(fix34Data[0])));
  }
}
