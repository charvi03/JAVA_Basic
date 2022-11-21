package oops.ClasseObjectsFunctions;

import java.util.Scanner;

class A
{
	Scanner sc = new Scanner(System.in);
	int a, b;
	public void setValue()
	{
		System.out.println("enter first value");
		a=sc.nextInt();
		System.out.println("enter Second value");
		b=sc.nextInt();
	}

	public int sum()
	{
		int c=a+b;
		return c;
	}
	
	public int greater()
	{
		if(a>b)
	        {
		return a;
	        }
        	else
            	{
		return b;
        	}
		
	}

}
class main
{
	public static void main(String[] args)
	{
	A o=new A();
	o.setValue();
	int x=o.sum();
	int s=o.greater();
	System.out.println("SUM OF A and B is " + x);
	System.out.println("GREATER NUMBERS IS " + s);
	}
}