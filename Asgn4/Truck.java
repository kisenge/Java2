/**
This class represents a Truck.

@author Kisenge Mbaga
*/
public class Truck extends Vehicle{

	/**
	The type indiciating whether hatchback or trunk.
	*/
	private String bedLength;

	/**
	The base cost of a truck.
	*/
	private double cost= 50000;


 	/**
	Constructs a Vehicle object with a vehicle code and mileage.
	@param codeIn The vehicle code
	@param mileageIn The vehicles mileage.
	@param bedLenthIn The type of truck length
	*/
	public Truck( String codeIn, int mileageIn, String bedLengthIn){
		super(codeIn, mileageIn);
		bedLength= bedLengthIn;
	}

	/**
	 Returns the cost of the vehicle based on type of truck bed.
	@return The cost of the vehicle.
	*/
	public double calculateCost(){

	if (bedLength.equals("short")){
		cost-= 0.1*(cost);
	}

	if (bedLength.equals("long")){
		cost+= 0.1*(cost);
	}

	return cost;

	}



}