package tech.dev.codingbat.string;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SumNumbersTests {
  private SumNumbers sumNumbers;

  @BeforeEach
  void setUP() {
    sumNumbers = new SumNumbers();
  }

  @ParameterizedTest
  @CsvFileSource(
      files = "src/test/resources/sumNumbersData.csv",
      numLinesToSkip = 1)
  void the_sum_of_the_numbers_appearing_in_the_string_ignoring_all_other_characters(String sumNumbersData, int requiredResult ) {

    assertEquals(requiredResult, sumNumbers.sumNumbers(sumNumbersData));
  }

}
