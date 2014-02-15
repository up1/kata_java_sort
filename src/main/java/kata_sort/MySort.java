package kata_sort;

import java.util.ArrayList;
import java.util.List;

public class MySort {

	public List<Integer> sort(List<Integer> list) {
		if (list.size() > 1) {
			int firstNumber = list.get(0);
			int secondNumber = list.get(1);
			if (firstNumber > secondNumber) {
				return list(secondNumber, firstNumber);
			} else {
				return list(firstNumber, secondNumber);
			}
		}
		return list;
	}

	private List<Integer> list(int... integers) {
		List<Integer> list = new ArrayList<Integer>();
		for (int integer : integers) {
			list.add(integer);
		}
		return list;
	}
}
