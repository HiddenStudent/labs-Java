package lab1;

/**
Объявить целые. Инициальзировать их шестнадцатиричными значениями.
Распечатать, выполнить знаковые, беззнаковые сдвиги. Пояснить разницу.
**/

public class Task7 
{
	static int a = 0xF;
	
	public static void main (String[]args) {
	
		System.out.println("Начальное значение " + Integer.toBinaryString(Task7.a));
		System.out.println(">> " + Integer.toBinaryString(Task7.a>>1));
		System.out.println(">>> " + Integer.toBinaryString(Task7.a>>>1));
		System.out.println("<< " + Integer.toBinaryString(Task7.a<<1));
	}
}
