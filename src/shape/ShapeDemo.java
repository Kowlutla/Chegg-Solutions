package shape;

public class ShapeDemo {

	public static void main(String[] args) {
		
		Ellipsoid s=new Ellipsoid(3,4,6);
		System.out.println(s.isCircle());
		System.out.println(s.area());
		System.out.println(s.getVolume());
		Circle e=new Ellipse(10,20);
		m1((Ellipse)e);
	}
	
	public static void m1(Ellipse e)
	{
		
	}

}
