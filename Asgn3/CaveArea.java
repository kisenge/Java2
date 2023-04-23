import java.util.Scanner;
public class CaveArea{
	public static void main(String[] args){
Scanner scan = new Scanner(System.in);


int rows= scan.nextInt();
int columns = scan.nextInt();

int [][] cave= new int[rows][columns];


if (rows!=0 && columns!=0){
	for(int i=0; i<rows; i++) {
      for(int j=0; j<columns; j++) {
         cave[i][j] = scan.nextInt();
      }
    }// cave created


    //find cave opening
    int locationHole=0;
    boolean hasHole= false;
    for(int i=0; i<columns; i++){
    	if (cave[0][i]==0){
    		locationHole=i;
    		hasHole= true;
    	}
    }

	if(hasHole){
	for (int i=1; i<2; i++){
		if (cave[i][locationHole]==0){
			cave[i][locationHole]=7;
		}
		else{
			hasHole=false;
		}
	}


	int counter=0;
	while(counter>10){
		
	for (int j=1; j<rows;j++){//check after
		for (int i=0; i<columns; i++){
			if ( (cave[j][i]==0 && cave[j][i+1]==7))  {
				cave[j][i]=7;
				System.out.print("wtf");
			}
		}
	}

	for (int j=1; j<rows;j++){//check before
		for (int i=locationHole; i<0; i--){
			if ((cave[j][i]==7 &&cave[j][i-1]==0)){
				cave[j][i-1]=7;
				System.out.print("wtf2");
			}
		}
	}

	for (int j=1; j<rows-1;j++){//ontop
		for (int i=0; i<columns; i++){
			if ((cave[j][i]==0 &&cave[j-1][i]==7)){
				cave[j][i]=7;
				System.out.print("wtf3");
			}
		}
	}
	counter++;
}


int sevenCounter = 0;
for (int j=1; j<rows;j++){
		for (int i=0; i<columns; i++){
			if (cave[j][i]==7){
				sevenCounter++;
			}
		}
	}

int area=  1 + sevenCounter;
System.out.print("The area is " + area);

	}//if has hole
}
else{
	System.out.print("This cave is too small.");
}


}
}