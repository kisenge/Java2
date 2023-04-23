/**
 This class represents a PlayList
 @author Kisenge Mbaga
 */
import java.util.NoSuchElementException;
import java.util.InputMismatchException;



public class PlayList{
	private Node first;
	private Node last;
	private int size;

/**
    Creates an empty playlist.
    */	
	public PlayList(){
		first= last=null;
		size=0;
	}



	/**
    Adds song to playlist.
	@param songIn The song being added to the list.
	
    */	
	public void add(Song songIn){
		boolean added = false;
      	Node nodeToAdd = new Node(songIn);
		Node curr = first;

		while(curr != null && nodeToAdd.song.compareTo(curr.song) <= 0 && !added){
			curr = curr.next;
		} //this goes through lis comparing the values until the data is bigger than the newcard's data

		if(curr == first){ //bigger than the first one
			nodeToAdd.next = first;

				if(first !=null){
					first.prev = nodeToAdd;
				}
				first = nodeToAdd;
				curr = nodeToAdd;
				added = true;

				if(nodeToAdd.next == null){
					last = nodeToAdd;
				}
	}

			if(curr !=null){ //between two nodes in the list
				if(curr.song.compareTo(nodeToAdd.song) >= 0 && !added){
					curr.prev.next = nodeToAdd;
					nodeToAdd.next = curr;
					nodeToAdd.prev = curr.prev;
					curr = nodeToAdd;
					added = true;
				}
			}

			if(!added){ 
				last.next = nodeToAdd;
				nodeToAdd.prev = last;
				last= nodeToAdd;
			}

			size++;
}


	/**
    Compares songs for ordering.
	@return The int indicating order.
    */	
	public int getNumSongs(){
		return size;

	}


	/**
    Reverses the direction of the list
	@return An array of Songs.
    */	
	public Song[] getReversedList(){
		Song[] list= new Song[size];
		Node curr = last;
		for(int i = 0;(i < size) &&(curr.prev != null) ; i++){
			list[i] = curr.song;
			curr = curr.prev;
		}
		return list;

	}


	/**
    Reverses the direction of the list
	@return The String output of the PlayList.
    */
	public String toString(){
		String output= "";
		
		Node curr = first;
		for(int i = 0;i < size; i++){
			output += curr.song+", ";
			curr = curr.next;
		}

		return output;

	}



	/**
    Remove a song from the playlist.
	@param songIn The song being added to the list.
	
    */
	public void remove(Song songIn) throws InputMismatchException {
		boolean found = false;
		Node curr = first;

		
		while(!found && curr != null){
			if(curr.song.compareTo(songIn) == 0){
				found = true;
			}else{
				curr = curr.next;
			}
		}

		if(found){

			if(curr == first){
				first = curr.next;
				first.prev = null;
				size--;
				
			}

			if(curr == last){
				last = curr.prev;
				last.next = null;
				size--;
				
			}
			//betweenthe nodes
			curr.prev.next = curr.next;
			curr.next.prev = curr.prev;
			size--;
			
		}else{
			throw new InputMismatchException("Song is not found in the collection");
		}

	}



	/**
	An inner class that represents a node in the playlist.
    */
	private class Node {
		/**
		The song referenced by this node.
		*/
		public Song song;

		/**
		The next node in the list.
		*/
		public PlayList.Node next;

		/**
		The previous node in the list.
		*/
		public PlayList.Node prev;

		/**
		Creates a node.
		@param songIn The song to be represented by this node.
		*/
		public Node (Song songIn) {
           this.song = songIn;
           this.next = null;
           this.prev = null;
    }



    }

}