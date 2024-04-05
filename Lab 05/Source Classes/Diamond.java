import javafx.geometry.Point2D;

public class Diamond extends Shape implements Comparable<Diamond>,Moveable{
	private double length;
	private double width;
	
	public Diamond()
	{
		this(new Point2D(0, 0),0.0,0.0);
	}
	
	public Diamond(Point2D startPoint,double length, double width)
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
		System.out.println("Diamond Start: " + this.startPoint);
		System.out.println("Diamond length: " + this.length);
		System.out.println("Diamond width: " + this.width);
		System.out.println("Diamond area: " + this.calcArea());
		System.out.println("=================");
	}
	public int compareTo(Diamond d)
	{
		double a1 = this.calcArea();
		double a2 = d.calcArea();
		
		if(a1 == a2)
		{
			return 0;
		}
		else if(a1>a2)
		{
			return  1;
		}
		else {
			return -1;
		}
	}
	private double calcArea()
	{
		return(this.length * this.width);
	}
	public void move(double dx, double dy)
	{
		Point2D newPoint = new Point2D(this.startPoint.getX() + dx , this.startPoint.getY() + dy);
		this.startPoint = newPoint;
	}
}
