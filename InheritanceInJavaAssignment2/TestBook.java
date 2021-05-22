
public class TestBook {

	public static void main(String[] args) {
		// We need an Author instance to create a Book instance
	      Author Boateng = new Author("Boateng", "samuelboat11@yahoo.com", 'm');
	      System.out.println(Boateng);  // Author's toString()
	      
	   // Test Book's constructor and toString()
	      Book storyBook = new Book("Storytelling Book", Boateng,20.4, 120);
	      System.out.println(storyBook); 
	      
	      //Test setters and getters
        storyBook.setPrice(19.4);
        storyBook.setQty(100);
        
        System.out.println("name is: " + storyBook.getName());
        System.out.println("price is: " + storyBook.getPrice());
        //price is:19.4
        System.out.println("qty is: " + storyBook.getQty());
        //qty is: 100
        System.out.println("author is: " + storyBook.getAuthor());  // invoke Author's toString()
        //author is: Samuel Boateng (m) at SamuelBoat11@yahoo.com
        System.out.println("author's name is: " + storyBook.getAuthor().getName());
        //author's name is: Samuel Boateng
        System.out.println("author's email is: " + storyBook.getAuthor().getEmail());
        //author's email is: SamuelBoat11@yahoo.com
        System.out.println("author's gender is: " + storyBook.getAuthor().getGender());
        //author's gender is: m

     // Using an anonymous Author instance to create a Book instance
        Book ExtraStoryBook = new Book("Extra Story Books",
              new Author("Joseph Wedam", "josephabazeri@yahoo.com", 'm'), // an anonymous Author's instance
              30.9, 12);
        System.out.println(ExtraStoryBook);  // Book's toString()
	}

}
