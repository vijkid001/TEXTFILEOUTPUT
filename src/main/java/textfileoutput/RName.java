package textfileoutput;

import java.io.IOException;

import com.github.javafaker.Faker;

public class RName {

	public static void main(String[] args) throws IOException
		   {
			   //System.out.print("Hello");
			   
			   Faker faker = new Faker();

			   int i = 1;
			   
			   while (i<=10) {				   
			   String fname = faker.name().fullName();
			   System.out.print(fname+",");
			   
			   String firstName = faker.name().firstName();
			   System.out.print(firstName+",");
			   
			   
			   String lastName = faker.name().lastName();
			   System.out.print(lastName+",");
			   
			   String streetAddress = faker.address().streetAddress();
			   System.out.print(streetAddress+",");
			   
			   String city = faker.address().city();
			   System.out.print(city+",");
			   
			   String state = faker.address().state();
			   System.out.print(state+",");
			   
			   String country = faker.address().country();
			   System.out.print(country+",");
			   
			   String zip = faker.address().zipCode();
			   System.out.println(zip);
			   System.out.println(faker.book().author());
			   System.out.println(faker.business().creditCardExpiry());
			   System.out.println(faker.cat().breed());
			   System.out.println(faker.shakespeare().asYouLikeItQuote());
					  i=i+1;
			   }
			   
			   
			   
		   }
	}

	


