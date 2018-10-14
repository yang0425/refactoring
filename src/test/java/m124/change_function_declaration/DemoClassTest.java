package m124.change_function_declaration;

import org.junit.jupiter.api.Test;

import static m124.change_function_declaration.DemoClass.circum;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoClassTest {

  @Test
  void shouldCalculateCircumference() {
    assertEquals(2 * Math.PI * 1, circum(1));
  }
}
