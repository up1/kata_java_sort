package kata_sort;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SortTest {

	@Test
	public void emptyInput() {
		MySort sort = new MySort();
		assertEquals(list(), sort.sort(list()));
	}
	
	private List<Integer> list(int... integers) {
		List<Integer> list = new ArrayList<Integer>();
		for (int integer : integers) {
			list.add(integer);
		}
		return list;
	}

}
