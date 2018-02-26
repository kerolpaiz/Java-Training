public class MyServlet extends HttpServlet {
   // Instance variables or methods, e.g., database Connection, Statement, helper methods
   ......
   ......
   
   // init() runs only once when the servlet is loaded into the server
   public void init() { ...... }
   
   // doGet() runs once per HTTP GET request
   // It takes two arguments, representing the request and response messages
   public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
   
      // Set the MIME type for the response message
      response.setContentType("text/html");
      // Create a Writer to write the response message to the client over the network
      PrintWriter out = response.getWriter();
  
      // The programming logic to produce a HTML page
      out.println("<html>");
      out.println( ...... );
      out.println("</html>");
   }
   
   // doPost() runs once per HTTP Post request
   public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
      ......
   }
   
   // destroy() runs only once when the servlet is unloaded from the server.
   public void destroy() { ...... }
}