import java.time.LocalDate;

public class AudioBook extends Book{
	private int numOfMinutes;

	public AudioBook() {
		super();
	}
	
	public AudioBook(String title, double price, int numOfMinutes)
	{
		super(title,price);
		this.numOfMinutes = numOfMinutes;
	}
	
	public   String getTitle()
	{
		return(this.title);
	}
	public  void setTitle(String title)
	{
		this.title = title;
	}

	public  LocalDate getRelease()
	{
		return (this.release);
	}
	public  void setRelease(LocalDate release)
	{
		this.release = release;
	}

	public  double getPrice()
	{
		return (this.price);
	}
	public  void setPrice(double price)
	{
		this.price = price;
	}
	
	public int getNumOfMinutes() {
		return numOfMinutes;
	}

	public void setNumOfMinutes(int numOfMinutes) {
		this.numOfMinutes = numOfMinutes;
	}
	
	public String toString()
	{	
		
		return ("Title: " + this.title +"\n"+ 
				"Price: " + this.price +"\n"+
				"Release Date : " + this.release +"\n"+
				"Number of Minutes: " + this.numOfMinutes +"\n");
	}
	
	
}
