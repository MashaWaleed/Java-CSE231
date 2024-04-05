import javafx.geometry.Point2D;

public class Rectangle extends Shape {
	private double length;
	private double width;
	
	public Rectangle()
	{
		this(new Point2D(0, 0),0.0,0.0);
	}
	
	public Rectangle(Point2D startPoint,double length, double width)
	{
		super(startPoint);
		this.length = length;
		this.width = width;
	}
	
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void draw()
	{
		System.out.println("Rectangle Start: " + this.startPoint);
		System.out.println("Rectangle length: " + this.length);
		System.out.println("Rectangle width: " + this.width);
	}
	
}
