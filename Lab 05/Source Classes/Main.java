import java.util.*;
import javafx.geometry.*;
public class Main {
	
	public static void main(String[] args) {
		System.out.println("<<<<<<<<<<<<<<<<<<<<<< Q3 >>>>>>>>>>>>>>>>>>>>>>>>>");
		
		// Making a canvas object
		Canvas c = new Canvas();
		
		// Making an arraylist of shape refrences
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		// Arbitrary members from all shape classes
		// Line
		Line l = new Line(new Point2D(1,1), new Point2D(2,2));
		
		// Rectangle
		Rectangle r = new Rectangle(new Point2D(4,0), 5.0,6.5);
		
		// Ellipse
		Ellipse e = new Ellipse(new Point2D(3,7),3.5,8.6);
		
		// Setting the elements
		c.setShapes(shapes);
		c.addShape(l);
		c.addShape(r);
		c.addShape(e);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<< DRAW ALL  AND ADD TEST >>>>>>>>>>>>>>>>>>>>>>>>>");
		// Draw all
		c.drawAll();
		System.out.println("<<<<<<<<<<<<<<<<<<<<<< REMOVE AND THEN DRAW ALL >>>>>>>>>>>>>>>>>>>>>>>>>");
		// Remove shape and draw
		c.removeShape(r);
		c.drawAll();
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<< GET SHAPE FROM POINT >>>>>>>>>>>>>>>>>>>>>>>>>");
		c.getShape(new Point2D(1.1,1)).draw();
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<< Q5 >>>>>>>>>>>>>>>>>>>>>>>>>");
		Moveable[] ms = new Moveable[3];
		Diamond d1 = new Diamond(new Point2D(1,1),5,4);
		Diamond d2 = new Diamond(new Point2D(2,2),6,7);
		Diamond d3 = new Diamond(new Point2D(3,3),1,2);
		
		ms[0] = d1;
		ms[1] = d2;
		ms[2] = d3;
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<< Print moveables after sort by area >>>>>>>>>>>>>>>>>>>>>>>>>");
		Arrays.sort(ms);
		
		for(int i = 0; i < ms.length;i++)
		{
			((Diamond)ms[i]).draw();
		}
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<< Print moveables after moving by 2,2>>>>>>>>>>>>>>>>>>>>>>>>>");
		for(int i = 0; i < ms.length;i++)
		{
			ms[i].move(2, 2);
		}
		for(int i = 0; i < ms.length;i++)
		{
			((Diamond)ms[i]).draw();
		}
	}
}





















