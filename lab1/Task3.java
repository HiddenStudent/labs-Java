package lab1;

/**
Объявить две переменные без инициализации: как поле класса и как локальную переменную в методе. 
Вывести их на печать.
**/

public class Task3 {
	
	int i;
	
	private static void printVariable() 
	{
		int i;
		//System.out.println(i);
	}
	
	public static void main(String[]args) {
		Task3 t = new Task3();
		System.out.println(t.i);		
	}
}
