package kata_sort;

import java.util.List;

public class MySort {

	public Object sort(List<Integer> list) {
		if (list.size() > 1) {
			if (list.get(0) > list.get(1)) {
				int temp = list.get(0);
				list.set(0, list.get(1));
				list.set(1, temp);
			}
		}
		return list;
	}

}
