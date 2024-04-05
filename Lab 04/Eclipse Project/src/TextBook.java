import java.time.LocalDate;

public class TextBook extends Book{
	private int numOfPages;
	
	public TextBook()
	{
		super();
	}
	
	public TextBook(String title, double price, int numOfPages)
	{
		super(title, price);
		this.numOfPages = numOfPages;
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
	
	public int getNumOfPages() {
		return numOfPages;
	}
	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}
	
	public String toString()
	{	
		
		return ("Title: " + this.title +"\n"+ 
				"Price: " + this.price +"\n"+
				"Release Date : " + this.release +"\n"+
				"Number of Pages: " + this.numOfPages +"\n");
	}
}
