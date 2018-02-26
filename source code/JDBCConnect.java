//STEP 1. Import required packages
import java.sql.*;

public class JDBCConnect {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:3306/emp?useSSL=false"; //SSL = secure socket layer

   //  Database credentials
   static final String USER = "myuser";
   static final String PASS = "123qwe";
   
   public static void main(String[] args) {

   Connection conn = null;	//interfaces as good as abstract classes

   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");	//class called class java. It load the driver

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");

   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();

   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();

   }finally{	//it's job to do the house keeping
      //finally block used to close resources
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
}//end main
}//end JDBCExample