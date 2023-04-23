/**
This class represents a Dealership.

@author Kisenge Mbaga
*/
import java.util.Scanner;

public class Dealership{

	/**
	Name of dealership.
	*/
	private String name;
	/**
	Array of vehicles
	*/
	private Vehicle [] vehicleInventory;
	/**
	Number of vehicles dealership.
	*/
	private int vehicleNum;
	Scanner sc= new Scanner(System.in);
	
	
	
	private String extraInfo;
	private String vCode;
	private String in;
	

	/**
	Constructs a Dealership object by reading the name of the dealership, and 
	reading in a String array of vehicle information. It creates vehicles and puts them 
	into its Vehicle array.
	@param nameIn The dealership name
	@param vehicleInventoryIn An array with all vehicle information.
	*/
	public Dealership(String nameIn, String[] vehicleInventoryIn){
		name= nameIn;
		

		for(int i=0; i<vehicleNum; i++){ //convert String Array to Vehicle Array
			String in= vehicleInventoryIn[i];
			Scanner sc2= new Scanner(in);
			String vCode= sc2.next();
			int mileage= Integer.parseInt(sc2.next());
			

			Scanner sc3= new Scanner(vCode);
			char vType= vCode.charAt(0);
			

			if(vType=='C'){
				String extraInfo= sc2.next() + sc2.next();
				Scanner sc4= new Scanner(extraInfo);
				int doorNum= sc4.nextInt();
				char build= sc4.next().charAt(0);
				Car car1= new Car(vCode, mileage, doorNum, build);
				vehicleInventory[i] = car1;
			}

			if(vType=='T'){
				String extraInfo= sc2.next();
				String bedLength= extraInfo;
				Truck truck1= new Truck(vCode, mileage, bedLength);
				vehicleInventory[i] = truck1;
			}

			if(vType=='V'){
				String extraInfo= sc2.next();
				boolean doorType= Boolean.parseBoolean(extraInfo);
				Van van1= new Van(vCode, mileage, doorType);
				vehicleInventory[i] = van1;
			}

		}

	
		}


	

	/**
	 Returns whether the car was found.
	@param codeIn The code being searched for
	@return A string indicating whether the vehicle was found or not.
	*/
	public String searchFor(String codeIn){
		String result="";
		for(int i=0; i<vehicleInventory.length; i++){
			Vehicle ref= vehicleInventory[i];
			if(ref.getCode().equals(codeIn)){
				result="Vehicle found at dealership.";
			}
			else{
				result="Vehicle not found at dealership.";
			}
		}

		return result;
	}


	/**
	 Returns a copy of the array of vehicles.
	@return A vehicle Array with the dealership vehicles
	*/
	public Vehicle[] inventoryCopy(){
		return vehicleInventory;

	}

	/**
	 Returns a string with the dealership name and vehicle information.
	@return A string 
	*/
	public String toString(){
		String output="";
		output+=(name+"\n");
		for(int i=0; i>vehicleInventory.length; i++){
			Vehicle vehicleIn= vehicleInventory[i];
			output+= vehicleIn.toString();
		}

		return output;
	}
		


}