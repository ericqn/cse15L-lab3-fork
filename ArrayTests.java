import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlace2() {
    int[] input2 = { 3, 4, 5 };
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 5, 4, 3 }, input2);
	}

  @Test 
	public void testReverseInPlace3() {
    int[] input3 = { };
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{ }, input3);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input2 = {3, 4, 5, 6, 7};
    assertArrayEquals(new int[]{7, 6, 5, 4, 3}, ArrayExamples.reversed(input2));
  }

  @Test
  public void testReversed3() {
    int[] input3 = {3};
    assertArrayEquals(new int[]{3}, ArrayExamples.reversed(input3));
  }

  @Test
  public void testAverageWithoutLowestEmpty() {
    double[] input = { };
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input), 0);
  }

  @Test
  public void testAverageWithoutLowestSizeOne() {
    double[] input = {3.0};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input), 0);
  }

  @Test
  public void testAverageWithoutLowestBiggerSize() {
    double[] input = {1.0, 2.0, 4.0, 10.0};
    assertEquals(4.0, ArrayExamples.averageWithoutLowest(input), 0);
  }
}
