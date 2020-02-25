package TryCatchThrowException;

public class TryExitSystemFinally {
	 public static void main(String[] args) {
		  
		 try
		 {
			lemparkanException();
		 }
		 catch (Exception ex)
		 {
	     System.err.println("Exception yang terlempar " + "dari blok catch ditangani di method main");
			  }
			  
			 }
			 
			 public static void lemparkanException() throws Exception{
			  try{
			   System.out.println("Pernyataan try dieksekusi");
			   
			   System.exit(0);//Method ini akan menghentikan thread
			   throw new Exception();
			   
			  }
			  catch (Exception ex){
			   System.err.println("Exception terjadi");
			   throw ex;//exception ini ditangani di method main
			  }
			  finally{
			   
			   System.err.println("Pernyataan finally dieksekusi");
			  }
			 }
}
