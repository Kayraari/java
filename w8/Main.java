package w8;
import java.util.Scanner;
public class Main {
	

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Device[] devices = new Device[100];
		int count =0;
		
		while(true) {
			System.out.println("1. Store new device");
			System.out.println("2. Delete a device");
			System.out.println("3. Display all devices");
			System.out.println("4. Exit");
			System.out.println("Enter your choice");
			int choice = keyboard.nextInt();
			
			switch(choice) {
			case 1: 
				System.out.println("Enter new device 1) Lapotop 2) Tablet");
				int type = keyboard.nextInt();
                keyboard.nextLine();
		
                if(type==1) {
                	System.out.print("Enter model: ");
                    String model = keyboard.nextLine();
                    System.out.print("Enter power: ");
                    int power = keyboard.nextInt();
                    System.out.print("Enter storage: ");
                    int storage = keyboard.nextInt();
                    System.out.print("Enter screen size: ");
                    double screen = keyboard.nextDouble();
                    System.out.print("Has dedicated GPU? (true/false): ");
                    boolean gpu = keyboard.nextBoolean();
                    devices[count++] = new Laptop(model, power, storage, screen, gpu);
                }else if(type==2) {
                	System.out.print("Enter model: ");
                    String model = keyboard.nextLine();
                    System.out.print("Enter power: ");
                    int power = keyboard.nextInt();
                    System.out.print("Supports pen? (true/false): ");
                    boolean pen = keyboard.nextBoolean();
                    System.out.print("Enter battery life: ");
                    double battery = keyboard.nextDouble();
                    devices[count++] = new Tablet(model, power, pen, battery);
                } 
                System.out.println("Device added succesfully.");           
		
			case 2:
				
			case 3:
				for (int i = 0; i < count; i++) {
                    System.out.println(devices[i]);
                }
                System.out.println();
			case 4:
				break;
				
				
			}
		}
			
		
	}

}
