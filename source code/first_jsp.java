public final class first_jsp extends org.apache.jasper.runtime.HttpJspBase
      implements org.apache.jasper.runtime.JspSourceDependent {
  
   public void _jspInit() { ...... }
  
   public void _jspDestroy() { ......  }

   public void _jspService(HttpServletRequest request, HttpServletResponse response)
         throws java.io.IOException, ServletException {
   
      // JSP pre-defined variables (in service() method)
      PageContext pageContext = null;
      HttpSession session = null;
      ServletContext application = null;
      ServletConfig config = null;
      JspWriter out = null;
      Object page = this;
   
      JspWriter _jspx_out = null;
      PageContext _jspx_page_context = null;
   
      try {
         response.setContentType("text/html");
         pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
         _jspx_page_context = pageContext;
         application = pageContext.getServletContext();
         config = pageContext.getServletConfig();
         session = pageContext.getSession();
         out = pageContext.getOut();
         _jspx_out = out;
   
         out.write("<!DOCTYPE HTML>\r\n");
         out.write("<html>\r\n");
         out.write("<head>\r\n");
         out.write("   <meta http-equiv=\"Content-Type=\" content=\"text/html; charset=UTF-8\">");
         out.write("   <title>First JSP</title>\r\n");
         out.write("</head>\r\n");
         out.write("\r\n");
         out.write("<body>\r\n");
         out.write("   ");
    
         double num = Math.random();
         if (num > 0.95) {
            out.write("\r\n");
            out.write("      <h2>You will have a luck day!</h2><p>(");
            out.print( num );
            out.write(")</p>\r\n");
            out.write("   ");
         } else {
            out.write("\r\n");
            out.write("      <h2>Well, life goes on ... </h2><p>(");
            out.print( num );
            out.write(")</p>\r\n");
            out.write("   ");
         }
         out.write("\r\n");
         out.write("   <a href=\"");
         out.print( request.getRequestURI() );
         out.write("\"><h3>Try Again</h3></a>\r\n");
         out.write("</body>\r\n");
         out.write("</html>\r\n");
      } catch (Throwable t) {
         if (!(t instanceof SkipPageException)) {
            out = _jspx_out;
            if (out != null && out.getBufferSize() != 0)
               try { out.clearBuffer(); } catch (java.io.IOException e) {}
            if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
         }
      } finally {
         _jspxFactory.releasePageContext(_jspx_page_context);
      }
   }
}