package Nisal;

public class StaticClass
{
	int a;
	static int b=12;
	
	static
	{
		//this.a =12;  can't acess non static
        System.out.println("Static Block");
	}

	StaticClass(int a)
	{
		this.a = a;  // constructor we can acess the this keyword
		System.out.println("Paramerize Contructor " + a);
	}

    StaticClass(int a, int b)
	{
		this.a = a;  // 
		System.out.println("Paramerize Contructor " + a + " " + b);
	}


	{
		System.out.print("Can acess static and non static in Empty block "+ b);
		System.out.println(" Empty Block");
	}

	public static void staticMethod()
	{
		System.out.println("Static method");
	}
}