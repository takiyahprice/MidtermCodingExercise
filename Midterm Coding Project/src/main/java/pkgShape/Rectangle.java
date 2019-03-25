package pkgShape;

public class Rectangle extends Shape implements Comparable<Object> {
	private int iWidth;
	private int iLength;
	
	public Rectangle(int iWidth, int iLength) throws IllegalArgumentException {
		super();
		if (iWidth <= 0 || iLength <=0) {
			throw new IllegalArgumentException("The width and length must be positive values");
		}
		this.iWidth = iWidth;
		this.iLength = iLength;
	}
	
	public int getWidth() {
		return iWidth;
	}
	public void setWidth(int Width) {
		iWidth = Width;
	}
	
	public int getLength() {
		return iLength;
	}
	public void setLength(int Length) {
		iLength = Length;
	}
	
	@Override
	public double area() {
		return (double) (iWidth * iLength);
	}

	@Override
	public double perimeter() {
		return (double) (2*iLength + 2*iWidth);
	}

	@Override
	public int compareTo(Object obj) {
		Rectangle r = (Rectangle) obj;
		
		if (this.area() > r.area())
			return 1;
		else if (this.area() == r.area())
			return 0;
		else 
			return -1;
	}
}
