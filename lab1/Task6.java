package lab1;

import java.util.Scanner;

/**
�������� ���������.
������� ���������� ����-�����������.
**/
public class Task6 
{
	private static final double cm = 1;
	private static final double m = 100;
	private static final int g = 10;
	private static Scanner sc = new Scanner(System.in);
	
	private static void MetrToSm()
	{
		System.out.print("������� ����� � ������: ");
		double x = sc.nextDouble();
		System.out.println(x + " ������  =  " + (x*m) + " �����������");
	}
	
	private static void SmToMetr()
	{
		System.out.print("������� ����� � �����������: ");
		double x = sc.nextDouble();
		System.out.println(x + " �����������  =  " + (x/m) + " ������");
	}
	
	private static void VfallDown()
	{
		System.out.print("������� ����� ������� �������: ");
		int t = sc.nextInt();
		System.out.println("�������� ���������� ������� � ������ ������ ������� = " + (g*t) + " �/�");
	}
	
	private static void SfallDown()
	{
		System.out.print("������� ����� ������� �������: ");
		int t = sc.nextInt();
		System.out.println("�������� ����������� ���� �� ������ ���������� ������� = " + ((g*Math.pow(t, 2))/2) + " ������");
	}	
	
	private static void go() 
	{
		System.out.println("Me��:");
		System.out.println("1 - ������� �� (�) � (��)");
		System.out.println("2 - ������� �� (��) � (�)");
		System.out.println("3 - ������ �������� ���������� �������");
		System.out.println("4 - ������ ����������� ���� ��� ��������� ������");
		System.out.println("5 - �����");

		
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
					System.out.println("������������ ��������");
					break;
			}
		}
		
	}
	
	public static void main(String[]args) {
		Task6.go();
	}

}
