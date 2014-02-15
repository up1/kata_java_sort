package kata_sort;

import java.util.List;

public class MySort {

	public List<Integer> sort(List<Integer> list) {
		if (list.size() >= 2) {
			swapAll(list, 0);
			sort(list.subList(0, list.size()-1));
		}
		return list;
	}
	
	private void swapAll(List<Integer> list, int startPosition) {
		if(startPosition +1 > list.size()-1) return;
		swap(list, startPosition, startPosition+1);
		swapAll(list, startPosition+1);
	}

	private boolean isSwap(List<Integer> list, int startPosition, int finishPosition) {
		return list.get(startPosition) > list.get(finishPosition);
	}

	private void swap(List<Integer> list, int startPosition, int finishPosition) {
		if (isSwap(list, startPosition, finishPosition)) {
			int temp = list.get(startPosition);
			list.set(startPosition, list.get(finishPosition));
			list.set(finishPosition, temp);
		}
	}

}
