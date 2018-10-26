package lab1;
/**
Объявить массивы целых значений и строк. 
Вывести их на печать минимум двумя разными способами.
**/
public class Task4 
{
	
	static int[] arrI = {1,2,3};
	static String [] arrS = {"one","two","three","four","five"};
	
	private static void printArr1() 
	{
		for (int i : arrI) 
		{
			System.out.print(i + " ");
		}	
		
		System.out.println();
		
		for (String s : arrS)
		{
			System.out.print(s + " ");
		}
	}
	private static void printArr2() 
	{
		for(int i = 0; i < arrI.length; i++)
		{
			System.out.print(arrI[i] + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < arrS.length; i++)
		{
			System.out.print(arrS[i] + " ");
		}
	}
	
	
	public static void main(String[]args) {
		Task4.printArr1();
		System.out.println();
		Task4.printArr2();
	}

}
