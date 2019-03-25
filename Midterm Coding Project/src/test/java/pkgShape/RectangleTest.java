package pkgShape;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;

public class RectangleTest {
	
	@Test
	public void RectangleConstructor_Test1() {
		
		Rectangle rec = new Rectangle(5,4);
		
		assertEquals(rec.getLength(),4);
		assertEquals(rec.getWidth(),5);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void RectangleConstructor_Test2() {
		new Rectangle(-3,5);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void RectangleConstructor_Test3() {
		new Rectangle(3,-5);
	}
	
	@Test
	public void setLength_Test() {
		Rectangle rec = new Rectangle(5,4);
		
		rec.setLength(8);
		assertEquals(rec.getLength(),8);
	}
	
	@Test
	public void setWidth_Test() {
		Rectangle rec = new Rectangle(5,4);
		
		rec.setWidth(12);
		assertEquals(rec.getWidth(),12);
	}
	
	@Test
	public void area_Test() {
		Rectangle rec = new Rectangle(5,4);
		
		assertTrue(Double.compare(rec.area(), (double) 20) == 0);
	}
	
	@Test
	public void perimeter_Test() {
		Rectangle rec = new Rectangle(5,4);
		
		assertTrue(Double.compare(rec.perimeter(), (double) 18) == 0);
	}
	@Test
	public void compareTo_Test1() {
		Rectangle rec1 = new Rectangle(5,4);
		Rectangle rec2 = new Rectangle(4,4);
		
		assertEquals(rec1.compareTo(rec2),1);
	}
	@Test
	public void compareTo_Test2() {
		Rectangle rec1 = new Rectangle(5,4);
		Rectangle rec2 = new Rectangle(4,4);
		
		assertEquals(rec2.compareTo(rec1),-1);
	}
	@Test
	public void compareTo_Test3() {
		Rectangle rec1 = new Rectangle(5,4);
		Rectangle rec2 = new Rectangle(5,4);
		
		assertEquals(rec1.compareTo(rec2),0);
	}
	
	@Test
	public void compareTo_Test4() {
		ArrayList<Rectangle> recs = new ArrayList<Rectangle>(4);
		recs.add(new Rectangle(4,8));
		recs.add(new Rectangle(2,2));
		recs.add(new Rectangle(18,3));
		recs.add(new Rectangle(3,7));
		
		System.out.println("Unsorted Rectangles");
		for (int i=0; i < recs.size(); i++) {
			System.out.printf("Rectangle %d: Width = %d, Length = %d, Area = %.1f\n",i+1, recs.get(i).getWidth(),recs.get(i).getLength(),recs.get(i).area());
		}
		
		Collections.sort(recs);
		
		System.out.println("\nSorted Rectangles");
		
		for (int i=0; i < recs.size(); i++) {
			System.out.printf("Rectangle %d: Width = %d, Length = %d, Area = %.1f\n",i+1, recs.get(i).getWidth(),recs.get(i).getLength(),recs.get(i).area());
		}
	}
}
