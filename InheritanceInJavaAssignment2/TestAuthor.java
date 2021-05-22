
public class TestAuthor {

	public static void main(String[] args) {
	      // Test constructor and toString()
	      Author Boateng = new Author("Samuel Boateng", "samuelboat11@yahoo.com", 'm');
	      System.out.println(Boateng);  // toString()
	     

	      // Test Setters and Getters
	      Boateng.setEmail("samuelboat11@yahoo.com");
	      System.out.println(Boateng);  // toString()
	      
	      System.out.println("name is: " + Boateng.getName());
	      //name is: Samuel Boateng
	      System.out.println("gender is: " + Boateng.getGender());
	      //gender is: m
	      System.out.println("email is: " + Boateng.getEmail());
	      

	}

}
