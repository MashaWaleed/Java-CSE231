import javafx.geometry.*;

public class Main {
	
	static Vector v1 = new Vector(15,-31);
	static Vector v2 = new Vector(-30,61);
	
	
	public static void main(String[] args) {
		testStatic_Add_Sub(v1, v2);
		testLine();
		testMutable();
		testImmutable();
	}
	
	
	
	/*********************TESTING FUNCTIONS**************************/
	public static void testStatic_Add_Sub(Vector v1, Vector v2)
	{
		System.out.println("************************ (1) STATIC ADD AND SUB *************************\n");
		System.out.println("******  V1 AND V2  *******\n");
		v1.print();
		v2.print();
		System.out.println("\n******  SUB AND ADD  ******\n");
		
		Vector v3 = new Vector();
		v3 = Vector.add(v1, v2);
		v3.print();
		v3 = Vector.sub(v1, v2);
		v3.print();
	}
	
	public static void testLine()
	{
		System.out.println("\n************************ (2) Line Class Test *************************\n");
		// Empty constructor
		Line l1 = new Line();
		
		// Line Constructor based on passed objects
		Line l2 = new Line(new Vector(100, 50),new Point2D(10,20));
		
		// Line Constructor based on passed information
		Line l3 = new Line(100,50,10,20);
		
		System.out.println("******  Line Empty Constructor print *******\n");
		l1.print();
		System.out.println("\n******  Line Constructor based on passed objects print *******\n");
		l2.print();
		System.out.println("\n******  Line Constructor based on passed information *******\n");
		l3.print();
	}
	
	public static void testMutable() {
		System.out.println("\n************************ (3) mutable string Class Test *************************\n");
		MyStringBuffer buffer = new MyStringBuffer("Hello CSE231");
		
		System.out.println("******  mutable String Print *******\n");
		buffer.print();
		
		System.out.println("\n******  mutable String Print after ERASE *******\n");
		buffer.erase(6, 6);
		buffer.print();
		
		System.out.println("\n******  mutable String Print after INSERT *******\n");
		buffer.insert(6, "Java");
		buffer.print();
		
		System.out.println("\n******  mutable String Index of J *******\n");
		System.out.println(buffer.indexOf('J'));
		
	}
	
	public static void testImmutable() {
		System.out.println("\n************************ (4) Immutable string Class Test *************************\n");
		MyString buffer = new MyString("Mohamed Waleed ,2100623, Sec3");
		buffer.print();
	}
	

}





















