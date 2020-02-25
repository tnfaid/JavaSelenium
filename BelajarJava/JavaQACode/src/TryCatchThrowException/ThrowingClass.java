package TryCatchThrowException;

class ThrowingClassThrows {
	
	//Throws
	static void test() throws IllegalAccessException
	{
		System.out.println("ini dari method test()");
		throw new IllegalAccessException("test");
	}
	
	public static void main(String arg[]) 
	{
		try
		{
			test();
		}
			catch(IllegalAccessException e)
		{
			System.out.println("ini dari si main()");
		}
	}
}

	/**
//	Throw
	static void test()
	{
		try
		{
			throw new ArithmeticException("Division by zero");
		}
		catch(ArithmeticException e)
		{
			System.out.println("dapat dari method test");
			throw e; //rethowing si exceptionya
		}
	}
	
	public static void main(String[] args) {
		try
		{
			test();
		}
		catch (ArithmeticException e)
		{
			System.out.println("dapat dari si main");
		}
	}
	
	
}
*/




