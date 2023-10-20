package tech.dev.codingbat.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;;

public class CountClumpsTests {

  private CountClumps countClumps;

  @BeforeEach
  public void init() {
    countClumps = new CountClumps();
  }

  @Test
  @DisplayName("return 4 As CountClumps For A Given Array 2_2_1_1_1_2_1_1_2_2")
  public void return_4_As_CountClumps_For_A_Given_Array_2_2_1_1_1_2_1_1_2_2(){
    int[] nums = {2,2,1,1,1,2,1,1,2,2};

    assertEquals(4, countClumps.countClumps(nums));

  }

  @Test
  @DisplayName("return 2 As CountClumps For A Given Array_1_2_2_3_4_4")
  public void return_4_As_CountClumps_For_A_Given_Array_1_2_2_3_4_4(){
    int[] nums = {1,2,2,3,4,4};

    assertEquals(2, countClumps.countClumps(nums));

  }

  @Test
  @DisplayName("return 2 As CountClumps For Given Array 1_1_2_1_1")
  public void return_2_As_CountClumps_For_Given_Array_1_1_2_1_1(){
    int[] nums = {1,1,2,1,1};

    assertEquals(2, countClumps.countClumps(nums));

  }

  @Test
  @DisplayName("return 1 As CountClumps For Given Array 1_1_1_1_1")
  public void return_4_As_CountClumps_For_Given_Array_1_1_1_1_1(){
    int[] nums = {1,1,1,1,1};

    assertEquals(1, countClumps.countClumps(nums));

  }

  @Test
  @DisplayName("return 0 As CountClumps For Given Array []")
  public void return_0_As_CountClumps_For_Given_Array_Empty(){
    int[] nums = {};

    assertEquals(0, countClumps.countClumps(nums));

  }
  @Test
  @DisplayName("return 5 As CountClumps For Given Array 0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2")
  public void return_5_As_CountClumps_For_Given_Array_0_0_0_2_2_1_1_1_2_1_1_2_2(){
    int[] nums = {0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2};

    assertEquals(5, countClumps.countClumps(nums));

  }

}
