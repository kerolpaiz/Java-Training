public class Throws {  
   int division(int a, int b) throws ArithmeticException{  //whoever call me, they need to care of the arithmetic error
	int t = a/b;
	return t;
   }  
   public static void main(String args[]){  
	Throws obj = new Throws();
	try{
	   System.out.println(obj.division(15,0));  //main method (caller) need to take care, it use try-catch to handle it
	}
	catch(ArithmeticException e){
	   System.out.println("You shouldn't divide number by zero");
	}
   }  
}			//Throws = Caller need to handle,
			//Throw = Calli will handle it 