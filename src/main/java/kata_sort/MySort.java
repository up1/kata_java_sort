package kata_sort;

import java.util.List;

public class MySort {

	public Object sort(List<Integer> list) {
		if (list.size() == 2) {
			if (list.get(0) > list.get(1)) {
				swap(list, 0, 1);
			}
		} else if(list.size() == 3) {
			if (list.get(0) > list.get(1)) {
				swap(list, 0, 1);
			}
			if (list.get(1) > list.get(2)) {
				swap(list, 1, 2);
			}
		}
		return list;
	}
	
	private void swap(List<Integer> list, int startPosition, int finishPosition) {
		int temp = list.get(startPosition);
		list.set(startPosition, list.get(finishPosition));
		list.set(finishPosition, temp);
	}

}
