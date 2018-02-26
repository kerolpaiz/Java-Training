import java.io.*;

class ExceptionTest2 {

   public static void main(String[] args) {

      try{
          FileInputStream f = new FileInputStream("input.txt");
          f.read();

      }

      catch (FileNotFoundException ex){ //compiler check error  //this is why java is secure(Robust)

         System.out.println(ex);
      }

      catch (IOException e){     //runtime check error

         System.out.println(e);
      }
     
   	


   }
}