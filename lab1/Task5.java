package lab1;

import java.util.Scanner;
/**
������� ����������� ������������ (enum). 
������ � ���������� ����� �����, ����������� ��������� ����� 
�� ��������� ������������, �������� ������������ ����������� �� �����.
**/

public class Task5 
{
	private static void go() 
	{
		System.out.println("������� ����� �� 1 �� 4");
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
			System.out.println("������������ �������� ����������");
		}
	}
	
	public static void main(String[]args) {
		Task5.go();
	}
}
