package lab1;

/**
Объявить переменные всех примитивных типов: без инициализации, инициализацией и с вычислением при инициализации.  
Распечатать их значения. 
Целочисленные значения вывести в десятичном и шестнадцатеричном формате. 
**/

public class Task1 {
	
	private static void nonInit() 
	{
		byte a1;
		short a2;
		int a3;
		long a4;
	
		char b1;
	
		float c1;
		double c2;

		boolean d1;
		
	//	System.out.println("a1 = " + a1 + " a2 = " + a2 + " a3 = " + a3 + " a4 = " + a4);
	//	System.out.println("char b1 = " + b1);
	//	System.out.println("float c1 = " + c1 + " double c2 = " +c2);
	//	System.out.println("boolean d1 = " + d1);
		
	//	System.out.printf("a1 = %d a2 = %d a3 = %d a4 = %d ", a1 , a2 , a3 , a4);
	//	System.out.printf("char b1 = %s%n ", b1);
	//	System.out.printf("float c1 = %f double c2 = %f ", c1 , c2);
	//	System.out.printf("boolean = %b ", d1);
	}
	
	private static void withInit()
	{
		byte a1 = 127;
		short a2 = 512;
		int a3 = 1024;
		long a4 = 2048;
	
		char b1 = '2';
	
		float c1 = 1.25f;
		double c2 = 1.25;

		boolean d1 = true;
		
		System.out.printf("10 --> 16 : 127 = %s %n", Integer.toHexString(a1));
		System.out.printf("10 --> 16 : 512 = %s %n", Integer.toHexString(a2));
		System.out.printf("10 --> 16 : 1024 = %s %n", Integer.toHexString(a3));
		System.out.printf("10 --> 16 : 2048 = %s %n", Long.toHexString(a4));
		System.out.printf("10 --> 16 : char c1(%s) = %s %n",b1, Integer.toHexString((int)b1));
		
		
		System.out.println("a1 = " + a1 + " a2 = " + a2 + " a3 = " + a3 + " a4 = " + a4);
		System.out.println("char b1 = " + b1);
		System.out.println("float c1 = " + c1 + " double c2 = " +c2);
		System.out.println("boolean d1 = " + d1);
		
		System.out.println();
		
		System.out.printf("a1 = %d a2 = %d a3 = %d a4 = %d %n", a1 , a2 , a3 , a4);
		System.out.printf("char b1 = %s %n", b1);
		System.out.printf("float c1 = %f double c2 = %f %n", c1 , c2);
		System.out.printf("boolean = %b %n", d1);
	}
	
	public static void main(String[]args) {
		Task1.withInit();
	}

}

