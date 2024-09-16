
public class Rectangle
{

	private double length;
	private double width;
	
	public Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}

	public double getLength()
	{
		return this.length;
	}

	public double getWidth()
	{
		return this.width;
	}
	
	public boolean isSquare()
	{
		return this.width==this.length;
	}
	public double getDiagonal()
	{
		return Math.sqrt(this.length*this.length+this.width*this.width);
	}

	public void setLength(Double length)
	{
		this.length = length;
	}

	public void setWidth(Double width) 
	{
		this.width = width;
	}

	public String toString() 
	{
		return "Rectangle the Length is : " + 
                  this.length + " the Width is : " +                   
                  this.width;
	}

	
}

