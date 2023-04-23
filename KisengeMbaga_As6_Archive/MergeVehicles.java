import java.io.*;
public class MergeVehicles{
	
	public static void main(String[] args){

		try {
			String fileScanned1= args[0];
			String fileScanned2= args[1];
			
		
			FileInputStream fileInput1= new FileInputStream(fileScanned1);
			FileInputStream fileInput2= new FileInputStream(fileScanned2);

			ObjectInputStream inStream1= new ObjectInputStream(fileInput1);
			ObjectInputStream inStream2= new ObjectInputStream(fileInput2);

			boolean eof=false;
			while(!eof){
				try{
					Vehicle v1= (Vehicle)inStream1.readObject();
					Vehicle v2= (Vehicle)inStream2.readObject();

					if(v1.compareTo(v2)<1){
					System.out.print(v2.toString());
					System.out.print(v1.toString());
					}

					if(v1.compareTo(v2)>1){
					System.out.print(v1.toString());
					System.out.print(v2.toString());
					}

					if(v1.compareTo(v2)==0){
					System.out.print(v1.toString());
					System.out.print(v2.toString());
					}


				}
				catch(EOFException e){
					System.out.print("Reached end of file.");
				}
			}
			inStream1.close();
			inStream2.close();

		}
		catch(FileNotFoundException e){
			System.out.println("File not found.");
		}
		catch(ClassNotFoundException e){
			System.out.println("Class not found.");
		}
		catch(IOException e){
			System.out.println("Problem reading from file.");
		}
		

	}

}