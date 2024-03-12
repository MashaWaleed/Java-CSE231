
public class Vector {
	private double X;
	private double Y;
	
	
	public Vector()
	{
		this.X = 0;
		this.Y = 0;
	}
	
	public Vector(double X, double Y)
	{
		this.X = X;
		this.Y = Y;
	}
	
	
	public double getY() {
		return Y;
	}
	public void setY(double y) {
		Y = y;
	}
	public double getX() {
		return X;
	}
	public void setX(double x) {
		X = x;
	}
	
	
	public void read(double X, double Y)
	{
		this.X =X;
		this.Y =Y;
	}
	
	public double magnitude()
	{
		return Math.sqrt(( Math.pow(X, 2) + Math.pow(Y, 2))) ;
	}
	
	public double angle()
	{
		return Math.atan2(this.Y , this.X);
	}
	
	public void print()
	{
		System.out.printf("(%.2f i + %.2f j)", this.X, this.Y);
        System.out.printf(" (Magnitude %.2f [%f])\n", this.magnitude(), this.angle());
	}
	
	public static Vector add(Vector v1,Vector v2)
	{
		Vector vnew = new Vector(v1.X + v2.X, v1.Y + v2.Y);
		return vnew;
	}
	
	public static Vector sub(Vector v1,Vector v2)
	{
		Vector vnew = new Vector(v1.X - v2.X, v1.Y - v2.Y);
		return vnew;
	}
}
