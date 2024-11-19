package oops;


class Human
{
	 int age;
	String name;
}


public class BeforeEncapsulation {

	public static void main(String[] args) {
		Human obj=new Human();
		obj.age=25;
		obj.name="Siva";
		obj.age=22;
		obj.name="prasanna";
		System.out.println("Age is "  +obj.age);
		System.out.println("Name is " +obj.name);

	}

}