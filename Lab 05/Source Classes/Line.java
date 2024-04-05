import javafx.geometry.*;

public class Line extends Shape {
	private Point2D endPoint;
	
	public Line()
	{
		this(new Point2D(0, 0),new Point2D(0, 0));
	}
	
	public Line(Point2D startPoint, Point2D endPoint)
	{
		super(startPoint);
		this.endPoint = endPoint;
	}
	
	public void draw()
	{
		System.out.println("Line Start: " + this.startPoint);
		System.out.println("Line end: " + this.endPoint);
	}
}
