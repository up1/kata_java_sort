package kata_sort;

import java.util.ArrayList;
import java.util.List;

public class MySort {

	public List<Integer> sort(List<Integer> list) {
		if (list.size() > 1) {
			final int firstNumber = list.get(0);
			final List<Integer> lessList = list();
			final List<Integer> greaterList = list();
			for (Integer integer : list) {
				if (integer < firstNumber) {
					lessList.add(integer);
				} else if (integer > firstNumber) {
					greaterList.add(integer);
				}
			}
			return new ArrayList<Integer>() {
				{
					addAll(lessList);
					add(firstNumber);
					addAll(greaterList);
				}
			};
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
