package lab1;

/**
�������� �����. ���������������� �� ������������������ ����������.
�����������, ��������� ��������, ����������� ������. �������� �������.
**/

public class Task7 
{
	static int a = 0xF;
	
	public static void main (String[]args) {
	
		System.out.println("��������� �������� " + Integer.toBinaryString(Task7.a));
		System.out.println(">> " + Integer.toBinaryString(Task7.a>>1));
		System.out.println(">>> " + Integer.toBinaryString(Task7.a>>>1));
		System.out.println("<< " + Integer.toBinaryString(Task7.a<<1));
	}
}
