package pkgShape;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;

public class CuboidTest {
	
	@Test
	public void CuboidConstructor_Test1() {
		Cuboid cub = new Cuboid(5,4,6);
		
		assertEquals(cub.getWidth(),5);
		assertEquals(cub.getLength(),4);
		assertEquals(cub.getDepth(),6);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void CuboidConstructor_Test2() {
		new Cuboid (-5,4,6);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void CuboidConstructor_Test3() {
		new Cuboid (5,-4,6);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void CuboidConstructor_Test4() {
		new Cuboid (5,4,-6);
	}
	
	@Test
	public void setDepth_Test() {
		Cuboid cub = new Cuboid(5,4,6);
		
		cub.setDepth(12);
		assertEquals(cub.getDepth(),12);
	}
	
	@Test
	public void area_Test() {
		Cuboid cub = new Cuboid(5,4,6);
		
		assertTrue(Double.compare(cub.area(), (double) 148) == 0);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void perimeter_Test() {
		Cuboid cub = new Cuboid(5,4,6);
		cub.perimeter();
	}
	
	@Test
	public void volume_Test() {	//might be unnecessary
		Cuboid cub = new Cuboid(5,4,6);
		
		assertTrue(Double.compare(cub.volume(), (double) 120) == 0);
	}
	
	@Test
	public void sortByArea_Test() {
		ArrayList<Cuboid> cubs = new ArrayList<Cuboid>(4);
		cubs.add(new Cuboid(12,12,1));
		cubs.add(new Cuboid(2,3,11));
		cubs.add(new Cuboid(6,10,5));
		cubs.add(new Cuboid(4,4,9));
		
		System.out.println("Unsorted Cuboids");
		for (int i=0; i < cubs.size(); i++) {
			System.out.printf("Cuboid %d: Surface Area = %.1f\n",i+1, cubs.get(i).area());
		}
		
		Collections.sort(cubs, new sortByArea());
		
		System.out.println("\nSorted Cuboids");
		for (int i=0; i < cubs.size(); i++) {
			System.out.printf("Cuboid %d: Surface Area = %.1f\n",i+1, cubs.get(i).area());
		}
		System.out.println();
	}
	
	@Test
	public void sortByVolume_Test() {
		ArrayList<Cuboid> cubs = new ArrayList<Cuboid>(4);
		cubs.add(new Cuboid(4,5,9));
		cubs.add(new Cuboid(2,3,11));
		cubs.add(new Cuboid(6,10,5));
		cubs.add(new Cuboid(4,4,9));
		
		System.out.println("Unsorted Cuboids");
		for (int i=0; i < cubs.size(); i++) {
			System.out.printf("Cuboid %d: Volume = %.1f\n",i+1, cubs.get(i).volume());
		}
		
		Collections.sort(cubs, new sortByVolume());
		
		System.out.println("\nSorted Cuboids");
		for (int i=0; i < cubs.size(); i++) {
			System.out.printf("Cuboid %d: Volume = %.1f\n",i+1, cubs.get(i).volume());
		}
		System.out.println();
	}
	
	@Test
	public void compareTo_Test() {
		ArrayList<Cuboid> cubs = new ArrayList<Cuboid>(5);
		cubs.add(new Cuboid(3,3,3));
		cubs.add(new Cuboid(3,3,8));
		cubs.add(new Cuboid(1,9,3));
		cubs.add(new Cuboid(4,3,6));
		cubs.add(new Cuboid(1,1,14));

		System.out.println("Unsorted Cuboids");
		for (int i=0; i < cubs.size(); i++) {
			System.out.printf("Cuboid %d: Volume = %.1f, Area = %.1f\n",i+1, cubs.get(i).volume(),cubs.get(i).area());
		}
		
		Collections.sort(cubs);
		
		System.out.println("\nSorted Cuboids");
		for (int i=0; i < cubs.size(); i++) {
			System.out.printf("Cuboid %d: Volume = %.1f, Area = %.1f\n",i+1, cubs.get(i).volume(),cubs.get(i).area());
		}
		System.out.println();
		
	}
}
