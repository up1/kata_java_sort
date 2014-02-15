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
	
	@Test
	public void listOf2ValueThatOrdersShouldReturnSameList() throws Exception {
		assertEquals(list(1,2), sort.sort(list(1,2)));
	}
	
	@Test
	public void listOf2ValueThatNotOrderShouldReturnOrderList() throws Exception {
		assertEquals(list(1,2), sort.sort(list(2,1)));
	}
	
	@Test
	public void listOf3ValueThatOrdersShouldReturnSameList() throws Exception {
		assertEquals(list(1,2,3), sort.sort(list(1,2,3)));
	}
	
	@Test
	public void listOf3ValueThatNotOrderShouldReturnOrderList() throws Exception {
		assertEquals(list(1,2,3), sort.sort(list(2,1,3)));
	}
	
	@Test
	public void listOf3ValueThatNotOrderShouldReturnOrderList2() throws Exception {
		assertEquals(list(1,2,3), sort.sort(list(1,3,2)));
	}
	
	@Test
	public void listOf3ValueThatNotOrderShouldReturnOrderList3() throws Exception {
		assertEquals(list(1,2,3), sort.sort(list(3,2,1)));
	}
	
	private List<Integer> list(int... integers) {
		List<Integer> list = new ArrayList<Integer>();
		for (int integer : integers) {
			list.add(integer);
		}
		return list;
	}

}
