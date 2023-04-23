import java.util.Scanner;

/**
 Represents a playlist.
 @author Leah Bidlake
*/
public class PlayList
{
	/**
	A list of songs.
	*/
	private Song[] list;
	
	/**
	Constructs a PlayList given a sorted list of songs.
	@param listIn A sorted array of songs.
	*/
	public PlayList(Song[] listIn)
	{
		list = listIn;
	}
	
	/**
	Constructs a PlayList by reading the number of songs
	and then the sorted list of song information using Scanner;
	input format consists of a line with the number of songs, 
	followed by a line for each song containing values separated by commas.
	@param scin The scanner object used to read input.
	*/
	public PlayList(Scanner scin)
	{
		int count = scin.nextInt();
		scin.nextLine(); //read newline following the first int
		list = new Song[count];
		for(int i=0; i < count; i++){
			String s = scin.nextLine();	
			Scanner scline = new Scanner(s);	
			scline.useDelimiter(",");
			long songNum = scline.nextLong();
			String songTitle = scline.next();
			int rating = scline.nextInt();
			list[i] = new Song(songTitle, rating, songNum);
		}
	}
		
	/**
	 Returns the number of songs that occur in both PlayLists 
	 (this one and the other one that is passed in as a parameter)
	 duplicate determined by Song number.
	@param other The other playlist.
	@return The number of songs that occur in both lists.
	*/
	public int findDuplicates(PlayList other){
		//TO DO: Complete this method
		Song ref;
		Song [] box= other.list;

		
		Song base;
		int listLength = list.length;
		int refLength = other.length();
		if (listLength>refLength){
			listLength = refLength;
			refLength = listLength;
		}

		int numDuplicates=0;


		for (int i=0; i<listLength; i++){
			base= list[i];
			for (int j=0; j<refLength; j++){
				ref = box[j];
				if (base.getId() == ref.getId()){
					numDuplicates++;
				}
			}
			
		}

		return numDuplicates;

	}
	
	/**
	 Returns a PlayList of the song or songs with the highest rating from this PlayList.
	@return Returns a PlayList of the highest rated song(s).
	 */
	public PlayList highestRated(){
		//TO DO: Complete this method
		//find highest val
		int highestCounter=0;
		int highestRating=0;
		PlayList finalPlaylist;
		int secCounter=0;
		

		for (int i=0; i<list.length; i++){ // find highest score
			Song highest = list[i]; 
			if (highestRating<=highest.getRating()){
				highestRating =highest.getRating();
			}
		}

		for (int i=0; i<list.length; i++){//see how many songs have highest score
			Song highest = list[i];
			if (highest.getRating()==highestRating){
				highestCounter++;
			}
		}


		Song [] highestPlaylist = new Song [highestCounter];

		for (int i=0; i<list.length; i++){  //create an array with number of songs with highest rating and add the highest songs

				Song highest = list[i];
				int testRating = highest.getRating();
				if ( testRating==highestRating){
					highestPlaylist[i-secCounter] = highest;
					
				}

				else{
			secCounter++;}

				
		}


	
		finalPlaylist = new PlayList(highestPlaylist);
		
		return finalPlaylist;
	}
	
	/**
	Returns a PlayList after adding the given Song to this PlayList 
	in order by song number.
	@param songIn The song to be added in order.
	@return The new PlayList with the added song.
	 */
	public PlayList addSong(Song songIn){
		//TO DO: Complete this method
		int newLength = list.length + 1;
		Song [] newPlaylist = new Song[newLength];
		PlayList finalPlaylist;
		long newSong = songIn.getId();
		int found = 0;
		


		
			for (int i=0; i<list.length; i++) {//find placement-see where it fits
				Song refSong = list[i];

					if (newSong < refSong.getId()){
						found =(i-1);
					}
				
			}
		


		for (int i =0; i < newLength; i++){
			
			
			if (i<=(found)){
				newPlaylist[i]=list[i];
			}
			if (i==found+1){
				newPlaylist[i]= songIn;
			}

			if (i>found+1){

				newPlaylist[i]=list[i-1];
			}

		}

		finalPlaylist = new PlayList(newPlaylist);
		
		return finalPlaylist;

	}
	
	/**
	 Returns the length of this PlayList.
	@return The number of songs in the PlayList.
	*/
	public int length(){
		int size = this.list.length;
		return size;
	}
	
	/**
	 Displays the PlayList in the format described in the lab instructions.
	@return The formatted list of songs.
	*/
	public String toString(){
		String s = "";
		for(int i = 0; i < list.length; i++)
		{
			s += list[i].getId() + "\t" + list[i].getTitle() + "\t" + list[i].getRating() + "\n";
		}
		return s;
	}


	
}