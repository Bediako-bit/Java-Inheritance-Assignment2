
public class Book {
	
	// The private instance variables
	   private String name;
	   private Author author;
	   private double price;
	   private int qty;
	   
	   /** Constructs a Book instance with the given author */
	   public Book(String name, Author author, double price, int qty) {
	      this.name = name;
	      this.author = author;
	      this.price = price;
	      this.qty = qty;
	   }

	   //Generate setters and getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	 /** Returns a self-descriptive String */
	   public String toString() {
	      return "'" + name + "' by " + author;  // author.toString()
	   }
	}