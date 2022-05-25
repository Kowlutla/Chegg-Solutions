package circleAndRectangle;

public class Rectangle {

	private double length;
	private double width;
	public double perimeter()
	{
		if(length==0 || width==0)
		{
			return 0;
		}
		return 2*(length+width);
	}
	
	public double area()
	{
		return length*width;
	}
	
	public void setLength(double length)
	{
		if(length>0.0 && length<20)
		{
			this.length=length;
		}
		else
		{
			try {
				throw new Exception("");
			} catch (Exception e) {
				System.out.println("Exception:Entered Length is not in range");
			}
		}
	}
	
	public void setWidth(double width)
	{
		if(width>0.0 && width<20)
		{
			this.width=width;
		}
		else
		{
			try {
				throw new Exception();
			} catch (Exception e) {
				System.out.println("Exception: Entered Width is not in range");
			}
		}
	}
	
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
}
