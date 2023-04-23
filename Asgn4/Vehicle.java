/**
This class represents a Vehicle.

@author Kisenge Mbaga
*/

import java.util.Scanner;
import java.text.NumberFormat;
abstract class Vehicle{

	/**
	The vehicle code.
	*/
	private String code;
	/**
	The mileage of the vehicle
	*/
	private int mileage;
	NumberFormat costFormat = NumberFormat.getCurrencyInstance();



	/**
	Constructs a Vehicle object with a vehicle code and mileage.
	@param codeIn The vehicle code
	@param mileageIn The vehicles mileage.
	*/
	public Vehicle( String codeIn, int mileageIn){
		code=codeIn;
		mileage=mileageIn;
	}

	public abstract double calculateCost();

	/*public int compareTo(Vehicle other){
		if(this.code.compareTo(other.getCode())==0){

		}

	}*/




	/**
	 Returns the vehicle code
	@return The vehicle code.
	*/
	public String getCode(){
		return code;
	}

	/**
	 Returns the vehicle mileage
	@return The vehicle mileage.
	*/
	public int getMileage(){
		return mileage;
	}


	/**
	 Returns whether the car was found.
	@param distance The distance the vehicle has driven.
	*/
	public void testDrive(int distance){
		mileage+=distance;
	}


	/**
	 Returns the vehicle code, mileage and cost in a string
	@return A string of the vehicle code, mileage and cost.
	*/
	public String toString(){
		String output="";
		output+=("\n"+code+"\tMileage: "+mileage+"km\n");
		output+=("\t\tCost: "+costFormat.format(this.calculateCost()));
		

		return output;
	}

	}




