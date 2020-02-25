package TryCatchThrowException;

public class TryCatch {
	public static void main(String[] args) {
		try
		{
			int[] myNumbers = {1,2,3};
			System.out.println(myNumbers[10]);//ini pasti error kan, karena array myNumber cuma ada 3 gak sampek 10
		}
		catch (Exception e)
		{
			System.out.println("sesuatu ada yang salah");
		}
		
	}

		
}
