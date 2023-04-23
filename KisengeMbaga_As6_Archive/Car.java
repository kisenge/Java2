/**
Represents a car.
@author Leah Bidlake
*/
public class Car extends Vehicle{
	
	/**
	The type of trunk.
	*/
	private char type;

	/**
	The number of doors the car has.
	*/
	private int doors;

	/**
	Constructs a Car object.
	@param code the code for the car.
	@param mileage the initial mileage on the car.
	@param type the type of car trunk.
	@param doors the number of doors the car has.
	*/
	public Car(String code, int mileage, char type, int doors) throws InvalidVehicleException {
		super(code, mileage);
		this.doors = doors;
		this.type = type;
		

		if(type!='T' && type!='H'){
			this.type = 0;
			throw new InvalidVehicleException(
				"Vehicle "+ code + "had an input problem.");
		};

		if( doors!=2 && doors!=4){
			this.doors = Integer.valueOf(null);
			throw new InvalidVehicleException(
				"Vehicle "+ code + "had an input problem.");
				
				

		};

	}

	/**
	Calculates the cost of the vehicle.
	@return the calcuated cost of the vehicle.
	*/
	public double calculatePrice(){
		double cost = 10000;
		if(doors == 4){
			cost += cost * 1.05;
		}
		if(type == 'H'){
			cost += 1000;
		}
		return cost;
	}

}