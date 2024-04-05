import javafx.geometry.Point2D;

public abstract class Shape {
	
	protected Point2D startPoint;
	
	
	
	public Shape()
	{
		this(new Point2D(0, 0));
	}
	
	public Shape(Point2D startPoint)
	{
		this.startPoint = startPoint;
	}
	
	public Point2D getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(Point2D startPoint) {
		this.startPoint = startPoint;
	}
	
	protected abstract void draw();
}
