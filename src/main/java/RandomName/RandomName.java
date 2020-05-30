package RandomName;

import java.io.IOException;

import com.github.javafaker.Faker;

public class RandomName {

	public static void main(String[] args) throws IOException
		   {
			   System.out.println("Hello");
			   
			   Faker faker = new Faker();

			   String name = faker.name().fullName();
			   String firstName = faker.name().firstName();
			   System.out.println(firstName);
			   String lastName = faker.name().lastName();
			   System.out.println(lastName);
			   String streetAddress = faker.address().streetAddress();
			   System.out.println(streetAddress);
		   }
	}

	

