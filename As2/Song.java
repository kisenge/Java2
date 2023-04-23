/**
 Represents a song in a playlist.
 @author Leah Bidlake
*/
public class Song
{
	/**
	Unique ID assigned to each song (sorted by ID).
	*/
	private long id;
	
	/**
	Title of the song.
	*/
	private String songTitle;
	
	/**
	Rating assigned to the song by the user (1-5) where
	5 is highest rating (user enjoys the most), 
	1 is lowest rating (user enjoys the least)
	*/
	private int rating;
	
	/**
	Constructs a specific Song with a given title, ID and rating.
	@param titleIn The song title.
	@param ratingIn The song rating.
	@param songNumIn The song ID.
	*/
	public Song(String titleIn, int ratingIn, long idIn)
	{
		id = idIn;
		songTitle = titleIn;
		rating = ratingIn;
	}
	
	
	/**
	Retrieves the song's ID.
	@return Returns the song ID.
	*/
	public long getId()
	{
		return id;
	}
	
	/**
	Retrieves the song's title.
	@return Returns the song title.
	*/
	public String getTitle()
	{
		return songTitle;
	}
	
	/**
	Retrieves the song's rating.
	@return Returns the song rating.
	*/
	public int getRating()
	{
		return rating;
	}
	
	/**
	Changes the Songs rating to the specified value, 
	provided that it is within the acceptable range.
	@param ratingIn The updated rating for the song.
	@return If the rating was updated successfully.
	*/
	public boolean setRating(int ratingIn)
	{
		boolean success = false;
		if(ratingIn >=1 && ratingIn <= 5){
			rating = ratingIn;
			success = true;
		}
		return success;
	}
}