package lab1;

public enum Season 
{
	AUTUMN("�����") , WINTER("����") , SPRING("�����") , SUMMER("����");
	
	private String translation;
	
	private Season () { }
	
	private Season (String translation) 
	{
		this.translation = translation;
	}
	
	public String toString() 
	{
		return "������� ����� ���� : " + translation;
	}
}
