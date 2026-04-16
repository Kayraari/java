package w6;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		
		Vehicle[] vehicle = new Vehicle[6];
		int count =0;
		
		while(true) {
			System.out.println("What is the type of vehicle? (Car, Truck,Suv)");
			String type = keyboard.nextLine();
			if(type.equalsIgnoreCase("exit")) {
				break;
			}
			System.out.println("Enter the brand: ");
			String brand = keyboard.nextLine();
			System.out.println("Enter the gear type (manual or automatic): ");
			String gear= keyboard.nextLine();
			System.out.println("Enter the manufacturing year: ");
			int year= keyboard.nextInt();
			System.out.println("Enter the horsepower: ");
			double hp = keyboard.nextDouble();
			
			Vehicle v= null;
			
			if(type.equalsIgnoreCase("Car")) {
				v = new Car(brand, year, hp, gear);
			} else if(type.equalsIgnoreCase("Truck")) {
				v = new Truck(brand, year, hp, gear);
			} else if(type.equalsIgnoreCase("suv")) {
				v= new SUV(brand, year, hp, gear);
			}
			if(v!= null) {
				vehicles[count]=v;
				count++;
			}
			
			for (int i=0; i<count; i++) {
				Vehicle v =vehicles[i];
				System.out.println((i + 1) + "th vehicle:");
	            System.out.println(v.toString());
	            System.out.println("Tax cost is: "+ v.taxcalculator());
	            System.out.println("Environmental impact is: "+ v.environmentalimpact());
	            if( v instanceof SUV) {
	            	SUV s = (SUV) v;
	            	System.out.println("Market Value Loss Rate is: "+ s.marketvaluelossrate());
	            	
	            }
			}
		}	
		
	}

}
