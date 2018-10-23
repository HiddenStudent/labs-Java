package lab1;

public class Task2 {
	
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
	}
}
