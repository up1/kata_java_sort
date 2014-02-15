package kata_sort;

import java.util.List;

public class MySort {

	public Object sort(List<Integer> list) {
		if (list.size() == 2) {
			if (list.get(0) > list.get(1)) {
				swap(list, 0, 1);
			}
		} else if(list.size() == 3) {
			if (isSwap(list,0,1)) {
				swap(list, 0, 1);
			}
			if (isSwap(list,1,2)) {
				swap(list, 1, 2);
			}
			if (isSwap(list,0,1)) {
				swap(list, 0, 1);
			}
			if (isSwap(list,1,2)) {
				swap(list, 1, 2);
			}
		}
		return list;
	}
	
	private boolean isSwap(List<Integer> list, int startPosition, int finishPosition) {
		return list.get(startPosition) > list.get(finishPosition);
	}
	
	private void swap(List<Integer> list, int startPosition, int finishPosition) {
		int temp = list.get(startPosition);
		list.set(startPosition, list.get(finishPosition));
		list.set(finishPosition, temp);
	}

}
