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






}