/**
 This class tests the PlayList.
 @author Kisenge Mbaga
 */
import java.util.NoSuchElementException;
import java.util.InputMismatchException;


public class TestClass{
  public static void main(String[] args){

PlayList playlist= new PlayList();

Song jazz= new Song(27, "John Coltrane" , "Jazz Song");
Song grunge= new Song(14, "Pearl Jam" , "Grunge Song");
Song happy= new Song(13, "Outkast","Happy Song");
Song reggae= new Song(8, "Ziggy","Reggae Song");
Song wutang= new Song(20, "Wutang Clan", "36 Chambers");


Song allstar= new Song(2, "Smashmouth", "AllStar");
Song crazyfrog= new Song(7, "Crazy Frog", "Techno Song");
Song yodel= new Song(3, "Mountaineers", "Yodel Song");



playlist.add(grunge);
playlist.add(happy);
playlist.add(reggae);
playlist.add(wutang);
playlist.add(jazz);

System.out.println(playlist.toString());
System.out.println("Number of songs is: " +playlist.getNumSongs()+"\n");
playlist.remove(happy); 
//playlist.remove(jazz);

System.out.print(playlist.toString());

playlist.add(allstar);
playlist.add(crazyfrog);

System.out.print("\n"+"Print with new additions\n"+playlist.toString());


Song[] reverseList= playlist.getReversedList();
 System.out.println("\n" +"The reversed list:");
for (int i=0; i<playlist.getNumSongs(); i++){
	System.out.print(reverseList[i]);
}

System.out.println("\nTesting removing an object not in list.");
try{playlist.remove(yodel);}
catch(InputMismatchException e){
	System.out.println(e);
}





}
}