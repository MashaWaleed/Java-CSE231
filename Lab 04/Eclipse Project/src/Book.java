import java.time.LocalDate;

public abstract class Book {
	protected static int ID = 0;
	protected String title;
	protected LocalDate release;
	protected double price;
	
	public Book() {
		ID += 1;
		this.setTitle("");
		this.setRelease(LocalDate.now());
	}
	
	public Book(String title, double price)
	{
		ID += 1;
		this.title = title;
		this.price  = price;
		this.release = LocalDate.now();
	}

	public  abstract String getTitle();
	public abstract void setTitle(String title);

	public abstract LocalDate getRelease();
	public abstract void setRelease(LocalDate release);

	public abstract double getPrice();
	public abstract void setPrice(double price);

	
	
	
}
