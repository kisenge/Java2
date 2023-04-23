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

		int listLength = this.length;
		int refLength = other.length;
		if (listLength>refLength){
			listLength = refLength;
			refLength = listLength;
		}

		int numDuplicates=0;
		for (i=0; i<listLength-1; i++){
			Song base= list[i];
			for (j=0; i<refLength-1; j++){
				Song ref = other[j]
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
		int highestCounter;
		int highestRating=0;
		PlayList

		for (i=0; i<list.length-1; i++){ // find highest score
			Song highest = list[i]; 
			if (highestRating<=highest.getRating()){
				highestRating =highest.getRating();
			}
		}

		for (i=0; i<list.length;-1; i++){//see how many songs have highest score
			Song highest = list[i];
			if (highest.getRating()==highestRating){
				highestCounter++
			}
		}

		PlayList []highestPlayList = new PlayList [highestCounter];

		for (i=0; i<highestCounter; i++){  //create an array with number of songs with highest rating and add the highest songs
				Song highest = list[i];
				if (highest.getRating()==highestRating){
					highestPlayList[i] = highest;
				}
		}




		return highestPlayList;
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
		PlayList []newPlaylist = PlayList[newLength];
		int newSong = songIn.getId();
		boolean found = true;
		int locationCounter;


		while (found= false)
			for (i=0; i<list.length-1; i++) {//find placement-see where it fits
				Song refSong = list[i];

					if (newSong < refSong.getId()){
						found =true;
					}
				locationCounter++
			}
		}


		for (i=0; i < newLength-1; i++){
			
		}

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
			s += list[i].getSongNum() + "\t" + list[i].getTitle() + "\t" + list[i].getRating() + "\n";
		}
		return s;
	}


	
}