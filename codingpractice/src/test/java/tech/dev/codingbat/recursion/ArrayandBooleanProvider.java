package tech.dev.codingbat.recursion;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;



public class ArrayandBooleanProvider implements ArgumentsProvider{

  @Override
  public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
    // TODO Auto-generated method stub
    return Stream.of(
        Arguments.of(new int[] {-5, 5, 5}, true),
        Arguments.of(new int[] {5, 5, 6}, false),
        Arguments.of(new int[] {5, 5, 6, 1}, true),
        Arguments.of(new int[] {6, 5, 5, 1}, true),
        Arguments.of(new int[] {6, 5, 5, 1, 10}, true),
        Arguments.of(new int[] {6, 5, 5, 5, 1}, false),
        Arguments.of(new int[] {1}, true),
        Arguments.of(new int[] {}, false),
        Arguments.of(new int[] {10, 7, 5, 5}, true),
        Arguments.of(new int[] {10, 0, 5, 5}, false),
        Arguments.of(new int[]{10, 7, 5, 5, 2}, true),
        Arguments.of(new int[] {10, 7, 5, 5, 1}, false)

    );
  }

}
