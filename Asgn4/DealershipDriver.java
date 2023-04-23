import java.util.Scanner;

public class DealershipDriver{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	

	String name= sc.nextLine();
	int vehicleNum= sc.nextInt();
	int counter=0;


	//scan each vehicle record into a String array
	String [] vehicleInventory= new String[vehicleNum];
	for (int i=0; i<vehicleInventory.length; i++){
		vehicleInventory[i]=sc.nextLine();
	} 


	//scan the Vcodes to search for into an array
	boolean check= true;
	while(check=true){
		if (sc.hasNextLine()){
			counter++;
		}
		else{
			check=false;
		}
	}
	String [] testVCode= new String[counter];
	for(int i=0; i<testVCode.length; i++){
		testVCode[i]=sc.nextLine();
	} 



	//create a dealership object
	Dealership honda= new Dealership(name,vehicleInventory);
	System.out.print(honda.toString());
	// System.out.print(selectionSort((honda.inventoryCopy())));


	//search for the vehicle
	for(int i=0; i<vehicleInventory.length; i++){
		String vCode;
		vCode=vehicleInventory[i];
		honda.searchFor(vCode);
	}



	}
}