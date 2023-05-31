package gr.upatras.junit.first;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class MyClassTest {
 @Test
 void testExceptionIsThrown() {
	 MyClass tester = new MyClass();
	 assertThrows(IllegalArgumentException.class, () ->
	 tester.subtract(1000, 5));
 }
 @Test
 void testSubtract() {
	 MyClass tester = new MyClass();
	 assertEquals("NEGATIVE", tester.subtract(5, 10), "5 - 10 must be -5");
 }
}