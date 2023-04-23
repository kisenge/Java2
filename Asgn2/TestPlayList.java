import java.util.Scanner;

/**
 Driver to test PlayList class 
@author Leah Bidlake
*/
public class TestPlayList{

	public static void main(String[] args){

		//Scan in and create playlists
		Scanner sc = new Scanner(System.in);
		PlayList myList = new PlayList(sc);
		PlayList yourList = new PlayList(sc);
			
		//scan in additional song to add to playlist
		String sl = sc.nextLine();	
		Scanner scline = new Scanner(sl);	
		scline.useDelimiter(",");
		long songNum = scline.nextLong();
		String songTitle = scline.next();2
		int rating = scline.nextInt();
		
		//song that will be added to a playlist
		Song songToAdd = new Song(songTitle, rating, songNum);
		
		System.out.println(myList);
		
		//Test finding the highest rated song(s) in PlayList
		PlayList highList = myList.highestRated();
		String p = "";
		p = (highList.length() == 1)? "song is:": "songs are:";
		System.out.println("The highest rated " + p);
		System.out.println(highList);
		
		//Test adding the new song to a playlist
		myList = myList.addSong(songToAdd);
		System.out.println("Updated playlist: \n" + myList);
		
		System.out.println(yourList);
		
		//Test finding the number of duplicates in two playlists
		String s = "";
		String r = "";
		int dup = myList.findDuplicates(yourList);
		s = (dup==1)? " is ":" are ";	
		r = (dup==1)? " song ":" songs ";	
		System.out.println("There" + s + dup + r + "found in both play lists\n");
	}
}