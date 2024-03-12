import javafx.geometry.*;

public class Line {
	
	private Vector direction;
	private Point2D point;
	
	
	public Line() {
		this.direction = new Vector();
		this.point = new Point2D(0, 0);
	}
	
	
	// The constructor for passed Vector and Point objects
	public Line(Vector direction, Point2D point)
	{
		this.direction = direction;
		this.point = point;
	}
	
	// The constructor for passed information
	public Line(double px, double py, double vx, double vy)
	{
		this.point = new Point2D(px,py); 
		this.direction = new Vector(vx,vy); 
	}
	
	
	
	public Vector getDirection() {
		return direction;
	}
	public void setDirection(Vector direction) {
		this.direction = direction;
	}
	
	public Point2D getPoint() {
		return point;
	}
	public void setPoint(Point2D point) {
		this.point = point;
	}
	
	
	
	public void print()
	{
		System.out.println("The poition of "+ this + " is ("+this.point.getX()+","+this.point.getY()+")");
		System.out.print("The direction of "+ this + " is ");
		this.direction.print();
	}
	
	
}
