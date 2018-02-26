class ExceptionTest {

   public static void main(String[] args) {

   		int x = 10;
   		int y = 0;
   		int z = 0;

   		try{
   			z = x/y;	

   		}
   		catch(ArithmeticException e){	//subclass of exception
   			System.out.println("Error:" + e);
   		}

   		System.out.println("z : " + z); //error: exception in main, arithmeticException
 
   		try{
   			z = x/y;	

   		}
   		catch(Exception e){		
   			System.out.println("Error 2:" + e.getMessage());	//to get specific error details
   		}

   		System.out.println("z : " + z);


   }
}