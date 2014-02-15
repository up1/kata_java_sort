package kata_sort;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SortTest {

	MySort sort = new MySort();
	
	@Test
	public void emptyInput() {
		assertEquals(list(), sort.sort(list()));
	}
	
	@Test
	public void listOfOneShouldReturnListOfOne() throws Exception {
		assertEquals(list(1), sort.sort(list(1)));
	}
	
	private List<Integer> list(int... integers) {
		List<Integer> list = new ArrayList<Integer>();
		for (int integer : integers) {
			list.add(integer);
		}
		return list;
	}

}
