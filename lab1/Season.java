package lab1;

public enum Season 
{
	AUTUMN("осень") , WINTER("зима") , SPRING("весна") , SUMMER("лето");
	
	private String translation;
	
	private Season () { }
	
	private Season (String translation) 
	{
		this.translation = translation;
	}
	
	public String toString() 
	{
		return "текущее время года : " + translation;
	}
}
