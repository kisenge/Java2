import java.util.Scanner;
public class Cave{
	
Scanner scan = new Scanner(System.in);

	int rows=0;
	int cols=0;
	int [][] cave;



public Cave(int rowsIn, int colsIn){
	rows= rowsIn;
	cols= colsIn;
	int [][] cave= new int[rows][cols];

}



public  int totalArea(){
	
	int checkRight=0;
	int checkLeft=0;
	int areaCounter=0;
	//findHole();

	for(int i=0; i<rows; i++){
		for(int n=0; n<cols; n++){
			checkRight=i;
			checkLeft=i;

			if(cave[n][i]==7){
				while(checkRight+1<cols && cave[n][checkRight+1]==0){
					cave[n][checkRight+1]=7;
					areaCounter++;

					if(n+1<rows &&  cave[n+1][checkRight+1]==0){
						cave[n+1][checkRight+1]=7;
						areaCounter++;
					}

					checkRight++;
				}

				while(checkLeft-1>=0 && cave[n][checkLeft-1]==0){
					cave[n+1][checkLeft-1]=7;
					areaCounter++;

					if(n+1<rows && cave[n+1][checkLeft-1]==0){
						cave[n+1][checkLeft-1]=7;
						areaCounter++;
					}
					checkLeft--;
				}

				if(n+1<rows && cave[n+1][i]==0){
					cave[n+1][i]=7;
					areaCounter++;
				}
			}
		}

	}
	return areaCounter;
}


}
