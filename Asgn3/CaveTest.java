import java.util.Scanner;

/**
 Driver to test PlayList class 
@author Leah Bidlake
*/
public class CaveTest{

	public static void main(String[] args){

		//Scan in and create playlists
		Scanner scan = new Scanner(System.in);
		
		int rows= scan.nextInt();
		int columns = scan.nextInt();
		


		Cave testCave = new Cave(rows, columns);

	if (rows!=0 && cols!=0){
			for(int i=0; i<rows; i++) {
		      for(int j=0; j<cols; j++) {
		         cave[i][j] = scan.nextInt();
		      }
		    }


		}

			else{
			System.out.print("Cave cannot be made. Too small.");
		}

		

	

		
		System.out.print("The area of the cave is " + testCave);






		
	}
}