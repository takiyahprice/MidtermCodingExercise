package pkgShape;

import java.util.*;

public class sortByArea implements Comparator<Cuboid> {
	sortByArea() {}
	
	public int compare(Cuboid cub1, Cuboid cub2) {
		if (cub1.area() > cub2.area())
			return 1;
		else if (cub1.area() == cub2.area())
			return 0;
		else 
			return -1;
	}
}
