/**
This class represents a Car.

@author Kisenge Mbaga
*/
public class Car extends Vehicle{

	/**
	Base cost of the car.
	*/
	private double cost= 10000;
	/**
	Number of doors.
	*/
	private int doorNum=2;
	/**
	The type indiciating whether hatchback or trunk.
	*/
	private char build;


 	/**
	Constructs a Vehicle object with a vehicle code and mileage.
	@param codeIn The vehicle code
	@param mileageIn The vehicles mileage.
	@param doorNumIn The number of doors.
	@param buildIn The type of build. Hatchback or trunk.
	*/
	public Car( String codeIn, int mileageIn, int doorNumIn, char buildIn){
		super(codeIn, mileageIn);
		doorNum= doorNumIn;
		build= buildIn;
	}


	/**
	 Returns the cost of the vehicle based on the number of doors
	 and the type.
	@return The cost of the vehicle.
	*/
	public double calculateCost(){

	if (doorNum==4){
		cost+= 0.05*(cost);
	}

	if (build=='H'){
		cost+= 1000;
	}

	return cost;

	}



}