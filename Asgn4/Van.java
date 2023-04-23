/**
This class represents a Van.

@author Kisenge Mbaga
*/
public class Van extends Vehicle{

	
	/**
	Base cost of the truck.
	*/
	private double cost= 25000;

	/**
	Boolean indicating whether door is electric or not.
	*/
	private boolean doorType= false;


 	/**
	Constructs a Vehicle object with a vehicle code and mileage.
	@param codeIn The vehicle code
	@param mileageIn The vehicles mileage.
	@param doorTypeIn The type of door. Manual or electric.
	*/
	public Van( String codeIn, int mileageIn, boolean doorTypeIn){
		super(codeIn, mileageIn);
		doorType= doorTypeIn;
	}


	/**
	 Returns the cost of the vehicle based on the door type.
	@return The cost of the vehicle.
	*/
	public double calculateCost(){

	if (doorType==true){
		cost+= 0.15*(cost);
	}

	
	return cost;

	}



}