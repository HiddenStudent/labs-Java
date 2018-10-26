package lab1;

/** 
¬ыполнить приведение целочисленных типов с допустимым расширением диапазона. 
¬ыполнить приведение double к float, float к int с некорректным преобразованием(переполнением).
**/

public class Task2 
{
	
	private static void castIncorrect()
	{
		int a = 1;
		float b = 3.4e+38f;
		double c = 2147483648.1;
		
		float newFloat = (float)c;
		int newInt = (int)b;
		
		System.out.printf("double to float : %1.1f --> %1.1f %n",c,newFloat);
		System.out.printf("float to int : %1.1f --> %d",b,newInt);
	}
	
	private static void cast() 
	{
		byte a = 8;
		short b = 24;
		int c = 128;
		long d = 1024;
		char e = '1';
		float f = 2.5f;
		double j = 2.5;
		
		b = (short)a;
		c = (int)b;
		d = (long)c;
		
		c = (int)e;
		
		f = (float)c;
		j = (double)c;
		f = (float)d;
		j = (float)d;
	}
	
	public static void main(String[]args) {
		Task2.cast();
		Task2.castIncorrect();
	}
}
