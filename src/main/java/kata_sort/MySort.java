package kata_sort;

import java.util.List;

public class MySort {

	public Object sort(List<Integer> list) {
		if (list.size() == 2) {
			if (list.get(0) > list.get(1)) {
				int temp = list.get(0);
				list.set(0, list.get(1));
				list.set(1, temp);
			}
		} else if(list.size() == 3) {
			if (list.get(0) > list.get(1)) {
				int temp = list.get(0);
				list.set(0, list.get(1));
				list.set(1, temp);
			}
			if (list.get(1) > list.get(2)) {
				int temp = list.get(1);
				list.set(1, list.get(2));
				list.set(2, temp);
			}
		}
		return list;
	}

}
