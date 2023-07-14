package tech.dev.codingbat.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CanFix45Tests {
  private CanFix45 canFix45;

  /*
      fix45([5, 4, 9, 4, 9, 5]) - [9, 4, 5, 4, 5, 9] [9, 4, 5, 4, 5, 9]  OK
      fix45([1, 4, 1, 5]) - [1, 4, 5, 1]  [1, 4, 5, 1]  OK
      fix45([1, 4, 1, 5, 5, 4, 1]) - [1, 4, 5, 1, 1, 4, 5]  [1, 4, 5, 1, 1, 4, 5] OK
      fix45([4, 9, 4, 9, 5, 5, 4, 9, 5]) - [4, 5, 4, 5, 9, 9, 4, 5, 9]  [4, 5, 4, 5, 9, 9, 4, 5, 9] OK
      fix45([5, 5, 4, 1, 4, 1]) - [1, 1, 4, 5, 4, 5]  [1, 1, 4, 5, 4, 5]  OK
      fix45([4, 2, 2, 5]) - [4, 5, 2, 2]  [4, 5, 2, 2]  OK
      fix45([4, 2, 4, 2, 5, 5]) - [4, 5, 4, 5, 2, 2]  [4, 5, 4, 5, 2, 2]  OK
      fix45([4, 2, 4, 5, 5]) - [4, 5, 4, 5, 2]  [4, 5, 4, 5, 2] OK
      fix45([1, 1, 1]) - [1, 1, 1]  [1, 1, 1] OK
      fix45([4, 5]) - [4, 5]  [4, 5]  OK
      fix45([5, 4, 1]) - [1, 4, 5]  [1, 4, 5] OK
      fix45([]) - []  []  OK
      fix45([5, 4, 5, 4, 1]) - [1, 4, 5, 4, 5]  [1, 4, 5, 4, 5] OK
      fix45([4, 5, 4, 1, 5]) - [4, 5, 4, 5, 1]  [4, 5, 4, 5, 1] OK
      fix45([3, 4, 5]) - [3, 4, 5]  [3, 4, 5] OK
      fix45([4, 1, 5]) - [4, 5, 1]  [4, 5, 1] OK
      fix45([5, 4, 1]) - [1, 4, 5]  [1, 4, 5] OK
      fix45([2, 4, 2, 5]) - [2, 4, 5, 2]  [2, 4, 5, 2]  OK
   */
  private static int[][][] fix45Data() {
    return new int[][][] { {new int[]{5, 4, 9, 4, 9, 5},new int[]{9, 4, 5, 4, 5, 9}},
                            {new int[]{1, 4, 1, 5}, new int[]{1, 4, 5, 1}},
                            {new int[]{1, 4, 1, 5, 5, 4, 1}, new int[]{1, 4, 5, 1, 1, 4, 5}},
                            {new int[]{4, 9, 4, 9, 5, 5, 4, 9, 5},new int[]{4, 5, 4, 5, 9, 9, 4, 5, 9}},
                            {new int[]{5, 5, 4, 1, 4, 1},new int[]{1, 1, 4, 5, 4, 5}},
                            {new int[]{4, 2, 2, 5},new int[]{4, 5, 2, 2}},
                            {new int[]{4, 2, 4, 2, 5, 5},new int[]{4, 5, 4, 5, 2, 2}},
                            {new int[]{1, 1, 1},new int[]{1, 1, 1}},
                            {new int[]{4, 5},new int[]{4, 5}},
                            {new int[]{5, 4, 1},new int[]{1, 4, 5}},
                            {new int[]{},new int[]{}},
                            {new int[]{5, 4, 5, 4, 1},new int[]{1, 4, 5, 4, 5}},
                            {new int[]{4, 5, 4, 1, 5},new int[]{4, 5, 4, 5, 1}},
                            {new int[]{2, 4, 2, 5},new int[]{2, 4, 5, 2}}
                            };
  }

  @BeforeEach
  void setUp() {
    canFix45 = new CanFix45();
  }
  @ParameterizedTest
  @MethodSource(value =  "fix45Data")
  void rearranged_so_that_every_4_is_immediately_followed_by_a_5(int[][] fix45Data) {

    assertEquals(true, Arrays.equals(fix45Data[1], canFix45.fix45(fix45Data[0])));
  }

}
