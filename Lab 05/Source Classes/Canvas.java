import java.util.*;
import javafx.geometry.*;

public class Canvas  {
	private ArrayList<Shape> shapes;
	
	public Canvas()
	{
		this(new ArrayList<Shape>());
	}
	public Canvas(ArrayList<Shape> shapes)
	{
		// This is dangerous and we shouldnt do it
		// this.shapes = shapes;
		
		// This is better
		this.shapes = (ArrayList)shapes.clone();
	}
	public ArrayList<Shape> getShapes() {
		return shapes;
	}
	public void setShapes(ArrayList<Shape> shapes) {
		this.shapes = shapes;
	}
	
	public void addShape(Shape s)
	{
		this.shapes.add(s);
	}
	public void removeShape(Shape s)
	{
		this.shapes.remove(s);
	}
	public Shape getShape(Point2D p)
	{
		double min = calcDistance(shapes.get(0), p);
		int pos = 0;
		for(int i = 1; i < this.shapes.size();i++ )
		{
			double d = calcDistance(shapes.get(i), p);
			if(d < min)
			{
				min = d;
				pos = i;
			}
		}
		return(shapes.get(pos));
	}
	
	public void drawAll() {
		for(Shape shape:this.shapes)
		{
			shape.draw();
			System.out.println("=================");
		}
	}
			
			
	private double calcDistance(Shape s, Point2D p)
	{
		return(Math.sqrt(Math.pow((s.startPoint.getX() - p.getX()),2) + Math.pow((s.startPoint.getY() - p.getY()), 0)));
	}
	
	
}
