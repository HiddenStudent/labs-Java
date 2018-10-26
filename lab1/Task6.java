package lab1;

import java.util.Scanner;

/**
Объявить константы.
Сделать консольный мини-калькулятор.
**/
public class Task6 
{
	private static final double cm = 1;
	private static final double m = 100;
	private static final int g = 10;
	private static Scanner sc = new Scanner(System.in);
	
	private static void MetrToSm()
	{
		System.out.print("Введите число в метрах: ");
		double x = sc.nextDouble();
		System.out.println(x + " метров  =  " + (x*m) + " сантиметров");
	}
	
	private static void SmToMetr()
	{
		System.out.print("Введите число в сантиметрах: ");
		double x = sc.nextDouble();
		System.out.println(x + " сантиметров  =  " + (x/m) + " метров");
	}
	
	private static void VfallDown()
	{
		System.out.print("Введите время падения объекта: ");
		int t = sc.nextInt();
		System.out.println("Скорость свободного падения в данный момент времени = " + (g*t) + " м/с");
	}
	
	private static void SfallDown()
	{
		System.out.print("Введите время падения объекта: ");
		int t = sc.nextInt();
		System.out.println("Величина перемещения тела за данный промежуток времени = " + ((g*Math.pow(t, 2))/2) + " метров");
	}	
	
	private static void go() 
	{
		System.out.println("Meню:");
		System.out.println("1 - перевод из (м) в (см)");
		System.out.println("2 - перевод из (см) в (м)");
		System.out.println("3 - расчет скорости свободного падения");
		System.out.println("4 - расчет перемещения тела при свободном падени");
		System.out.println("5 - Выход");

		
		while(true)
		{
			
			switch (sc.nextInt())
			{
				case 1:
					MetrToSm();
					break;
				case 2: 
					SmToMetr();
					break;
				case 3:
					VfallDown();
					break;
				case 4:
					SfallDown();
					break;
				case 5:
					System.exit(0);
				default: 
					System.out.println("Некорректное значение");
					break;
			}
		}
		
	}
	
	public static void main(String[]args) {
		Task6.go();
	}

}
