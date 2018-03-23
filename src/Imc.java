import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		float weight = 0;
		float height = 0;
		float imc= 0;
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your height below:");
		height = input.nextFloat();
		System.out.println("Enter your weight below:");
		weight = input.nextFloat();
		
	     	imc = weight / (height * height);
	     
	     	    if (imc < 16.0)
			    System.out.println("Light Weight!");
		
				if (imc >= 16.0 && imc < 17.0)
				System.out.println("Moderate leanness!");
			
			    if (imc >= 17.0 && imc < 18.5 )
				System.out.println("Lightness!");
		
				if (imc >= 18.5 && imc < 25.0)
				System.out.println("Healthy!");
				
				if (imc >= 25.0 && imc < 30.0)
				System.out.println("Overweight!");

				if (imc >= 30.0 && imc < 35.0)
				System.out.println("Obesity Degree I!");

				if (imc >= 35.0 && imc < 40.0)
				System.out.println("Obesity Degree II(Severe)!");
			
				if (imc >= 40.0)
				System.out.println("Obesity Degree III(Morbid)!");
				
			    System.out.println("END OF PROGRAM");
	     	

	}

}
