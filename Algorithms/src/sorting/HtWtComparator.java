package sorting;

import java.util.Comparator;

public class HtWtComparator  implements Comparator<HtWt>{

	@Override
	public int compare(HtWt p1, HtWt p2) {
		if(p1.height > p2.height)
			return -1;
		else if(p1.height < p2.height)
			return 1;
		else
			return 0;
	}
}
