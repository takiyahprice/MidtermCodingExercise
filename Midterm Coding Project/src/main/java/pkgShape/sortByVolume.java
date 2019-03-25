package pkgShape;

import java.util.*;

public class sortByVolume implements Comparator<Cuboid> {
	sortByVolume() {}
	
	public int compare(Cuboid cub1, Cuboid cub2) {
		if (cub1.volume() > cub2.volume())
			return 1;
		else if (cub1.volume() == cub2.volume())
			return 0;
		else 
			return -1;
	}
}
