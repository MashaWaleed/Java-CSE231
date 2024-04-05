import javafx.geometry.Point2D;

public class Ellipse extends Shape{
	private double length;
	private double width;
	
	
	public Ellipse()
	{
		this(new Point2D(0, 0),0.0,0.0);
	}
	
	public Ellipse(Point2D startPoint,double length, double width)
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
		System.out.println("Ellipse Start: " + this.startPoint);
		System.out.println("Ellipse length: " + this.length);
		System.out.println("Ellipse width: " + this.width);
	}
}
