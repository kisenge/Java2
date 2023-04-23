/**
Song class describes a song object.
@author Bidlake
*/

public class Song implements Comparable<Song>{

	/**
    The frequency the song has been played.
    */
	private int freq;
	
	/**
    The name of the band or artist.
    */
	private String band;
	
	/**
    The song title.
    */
	private String title;
	
	/**
    Creates a song with the specified frequency, band name and song title.
	@param freq Frequency the song has been played.
	@param band The name of the band or artist.
	@param title The song title.
    */	
	public Song(int freq, String band, String title){
		this.freq = freq;
		this.band = band;
		this.title = title;
	}
	
		
	/**
    Prints the information about the song.
	@return The formatted information about the song.
    */	
	public String toString(){
		String result = "Freq: "+freq + ", " + " Band: "+ band + ", " +" Title: " +title;
		return result+"\n";
	}


	/**
    Compares songs for ordering.
	@param other Other song.
	@return The int indicating order.
    */	
	public int compareTo(Song other){
		int x=0;

		if(freq> other.freq){
			x= 1;
		}

		if(freq< other.freq){
			x= -1;
		}

		if(freq == other.freq){
			
			if(this.band.compareTo(other.band)>0){
				x= 1;
			}
			if(this.band.compareTo(other.band)==0){
				x= this.title.compareTo(other.title);
			}
			if(this.band.compareTo(other.band)<0){
				x= -1;
			}		
		}

		return x;
		
	}



	
}
