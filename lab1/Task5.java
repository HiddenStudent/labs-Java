package lab1;

import java.util.Scanner;
/**
Создать собственное перечисление (enum). 
Ввести с клавиатуры целое число, сопоставить введенное целое 
со значением перечисления, значение перечисления распечатать на экран.
**/

public class Task5 
{
	private static void go() 
	{
		System.out.println("Введите число от 1 до 4");
		var scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		switch(x)
		{
		case 1: 
			System.out.print(Season.AUTUMN);
			break;
		case 2:
			System.out.print(Season.WINTER);
			break;
		case 3:
			System.out.print(Season.SPRING);
			break;
		case 4:
			System.out.print(Season.SUMMER);
			break;
		default:
			System.out.println("Некорректное значение переменной");
		}
	}
	
	public static void main(String[]args) {
		Task5.go();
	}
}
