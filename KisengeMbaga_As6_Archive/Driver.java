import java.util.*;
import java.text.NumberFormat;
import java.io.*;
import java.util.InputMismatchException;

public class Driver{
	public static void main(String[] args){
		NumberFormat form = NumberFormat.getCurrencyInstance();
		
		Boolean try1= false;
		String fileName="";
		String outputFile="";
		Vehicle temp;

		
		
		try {
			fileName= args[0];
			outputFile= args[1];
			
			File dataIn= new File(fileName);
			
			Scanner scan = new Scanner(System.in);
			scan = new Scanner(args[0]);			
			try1= true;
			
		
		
		
		String name = scan.nextLine();
		int size = scan.nextInt();
		scan.nextLine();

		Vehicle[] inventory = new Vehicle[size];
		
		for(int i = 0; i < size; i++){
			String line = scan.nextLine();
			Scanner sc = new Scanner(line);

			String code = sc.next();
			int mileage = sc.nextInt();
			
			if(code.charAt(0) == 'C'){
				int doors = sc.nextInt();
				char type = sc.next().charAt(0);
				try{temp = new Car(code, mileage, type, doors);}
				catch(InvalidVehicleException e){
					System.out.println(e);
				}
			}
			else if(code.charAt(0) == 'T'){
				String bed = sc.next();
				try{temp = new Truck(code, mileage, bed);}
				catch(InvalidVehicleException e){
					System.out.println(e);
				}
			}
			else{
				String bool = sc.next();
				boolean isElect = false;
				if(bool.equals("true")){
					isElect = true;
				}
				temp = new Van(code, mileage, isElect);
			}
			inventory[i] = temp;
		}
		
		Dealership dealer = new Dealership(name, inventory);

		System.out.println(dealer);

		System.out.println("\nSorted Data:\n");
		
		Sorter<Vehicle> sort = new Sorter<Vehicle>();
		Vehicle[] copy = dealer.getInventory();

		sort.selectionSort(copy);

		System.out.println(dealer.getName());
		
		for(Vehicle v : copy){
			System.out.println(v.getCode() + "\t" + form.format(v.calculatePrice()) + "\n");
		}

		while(scan.hasNext()){
			String searchCode = scan.nextLine();
			System.out.println("Vehicle " + ((dealer.search(searchCode) == null)?"not":"") + " found");
		}
		try{

			FileOutputStream fileOutStream= new FileOutputStream(outputFile);
			ObjectOutputStream outStream= new ObjectOutputStream(fileOutStream);
			Vehicle[] dealerCopy= dealer.getInventory();
			sort.selectionSort(dealerCopy);

			try{

				for(int i=0; i<dealer.getInventory().length; i++){
					
					Vehicle input= dealerCopy[i];
					outStream.writeObject(input+"\n");
					System.out.println(input);
				}
			
			outStream.close();
			}

			catch(IOException e){
				System.out.println("Problem writing to file.");
			}
		}

		catch(IOException e){
			System.out.println("Problem reading from file.");
		}

		}//1st try

		catch(InputMismatchException e){
			System.out.println("You are missing input.");
			try1= false;
			}
		

	}
}