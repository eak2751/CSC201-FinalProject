
public class GameList 
{
	private String genre;
	private String name;
	private int score;
	private boolean favorite;
	//private String favorite;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public int getScore()
	{
		return score;
	}
	
	public void setScore(int newScore)
	{
		score= newScore;
	}
	public String getGenre()
	{
		return genre;
	}
	public void setGenre(String newGenre)
	{
		genre= newGenre;
	}
	public boolean getFavorite()
	{
		return favorite;
	}
	public void setFavorite(boolean newFav)
	{
		favorite= newFav;
	}
	
	
	public void display()
	{
		System.out.println("Name: "+ name);
		System.out.println("Genre: "+ genre);
		System.out.println("Scored "+score+"/100");
	}
	
	
	

}
