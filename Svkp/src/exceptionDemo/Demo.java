package exceptionDemo;

public class Demo {

	public static void main(String[] args) {
		int a=20;
		int b=60;
		int sum=add(a,b);
		
		System.out.println(sum);
	}
	public static int add(int a,int b)
	{
		return a-b;
	}

}