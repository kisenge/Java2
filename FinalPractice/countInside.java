public class paintClass{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		int r= scan.nextInt();
		int c= scan.nextInt();
		scan.nextLine();

		char[][] map= new char[r][c];

		for(int row=0; row<r; row++){
			String line= scan.nextLine();
			for(int col=0; col<c; col++){
				map[row][col]= line.charAt(col);
			}
		}

		for(int row=0; row<r; row++){
			for(int col=0; col<c; col++){
				System.out.print(map[row][col]);
			}

			System.out.println();
		}
		paint(map);

		System.out.println("Painted:");
		for(int row= 0; row<r; row++){
			for(int col=0; col<c; col++){
				System.out.print(map[row][col]);
			}
			System.out.println();
		}

	}



public static void paint(char[][] rooms){
	for(int i=0; i<rooms.length; i++){
		for(int j=0; j<rooms.length; j++){
			if(room[i][j]!='0' && rooms[i][j] !='1'){
				paintRec(rooms,i,j);
			}
		}
	}
}


public static int countInside(int[][]map, int row, int col){
	int counter=0;

	map[row][col]=3;
	counter++;

	for(int rows=0; i< map.length;i++){
		for(int cols=0; i< map[0].length;i++){
			
			if(map[rows][cols]==0){
				
				//checkdown except bottom
				if(map[rows-1][cols]==3  && rows<map.length-1){
					map[rows][cols]==3
					counter++
				}

				//checkup except top
				if(map[rows-1][cols]==3  && rows>0){
					map[rows][cols]==3
					counter++
				}

				//check left except at left
				if(map[rows][cols-1]==3  && cols>0){
					map[rows][cols]==3
					counter++
				}

				//check left except at left
				if(map[row][cols+1]==3  && cols<map[0].length-1){
					map[row][cols]==3
					counter++
				}

			}
		}
	

	}

	return counter;

}