package tech.dev.codingbat.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CanBalanceTests {
  private CanBalance canBalance;

  public static int[][] splitData() {
    return new int[][] { { 1, 1, 1, 2, 1 }, {10, 10}, { 10, 0, 1, -1, 10 },
                         {1, 1, 1, 1, 4},{1, 2, 3, 1, 0, 2, 3} };
  }

  public static int[][] nonSplitData() {
    return new int[][] { { 2, 1, 1, 2, 1 }, {2, 1, 1, 1, 4}, { 2, 3, 4, 1, 2 },
                         {1, 2, 3, 1, 0, 1, 3}, {1} };
}

  @BeforeEach
  public void setUp() {
    canBalance = new CanBalance();
  }


  @ParameterizedTest
  @MethodSource(value =  "splitData")
  public void there_is_a_place_to_balance_the_given_array_by_split(int[] splitdata) {

    assertEquals(true, canBalance.canBalance(splitdata) );
  }


  @ParameterizedTest
  @MethodSource(value =  "nonSplitData")
  public void there_is_no__place_to_balance_the_given_array_by_split(int[] nonSplitData) {

    assertEquals(false, canBalance.canBalance(nonSplitData) );
  }

}
