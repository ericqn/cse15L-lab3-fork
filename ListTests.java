import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test 
	public void testFilter() {
    List<String> input = new ArrayList<>();
    StringChecker boom = new ChecksBomb();

    input.add("kabOMb");
    input.add("bobby");
    input.add("apple");
    input.add("bomb");

    List<String> inputMod = new ArrayList<>();

    inputMod.add("kabOMb");
    inputMod.add("bomb");

    assertEquals(inputMod, ListExamples.filter(input, boom));
	}

    @Test 
	public void testMerge() {
    List<String> input = new ArrayList<>();

    input.add("a");
    input.add("b");
    input.add("c");
    input.add("d");

    List<String> input2 = new ArrayList<>();

    input2.add("e");
    input2.add("f");

    List<String> inputMod = new ArrayList<>();

    inputMod.add("a");
    inputMod.add("b");
    inputMod.add("c");
    inputMod.add("d");
    inputMod.add("e");
    inputMod.add("f");

    assertEquals(inputMod, ListExamples.merge(input, input2));
	}
}
