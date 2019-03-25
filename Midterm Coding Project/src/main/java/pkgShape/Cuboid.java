package pkgShape;


public class Cuboid extends Rectangle {
	private int iDepth;
	
	public Cuboid(int Width, int Length, int Depth) throws IllegalArgumentException {
		super(Width,Length);
		
		if (Depth <= 0) {
			throw new IllegalArgumentException("The depth must be a positive value");
		}
		iDepth = Depth;
	}
	public int getDepth() {
		return iDepth;
	}
	public void setDepth(int Depth) {
		iDepth = Depth;
	}
	
	public double volume() {
		return (double) (super.area() * iDepth);
	}
	
	@Override
	public double area() {
		return (double) 2 *(super.area()+ iDepth * (this.getLength() + this.getWidth()));
	}
	
	@Override
	public double perimeter() throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public int compareTo(Object obj) {
		//instructions not clear so this just sorts by volume then surface area...
		Cuboid cub = (Cuboid) obj;
		sortByVolume sbv = new sortByVolume();
		sortByArea sba = new sortByArea();
		int result = sbv.compare(this, cub);
		
		if (result != 0)
			return result;
		else
			return sba.compare(this, cub);
		
	}
	
}