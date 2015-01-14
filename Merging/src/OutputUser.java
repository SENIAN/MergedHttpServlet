

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OutputUser
 */


@WebServlet("/OutputUser.do")
public class OutputUser extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OutputUser() {
        super();
    }

    
    JSONklass jsonClassPublic = new JSONklass();
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		
		PrintWriter out = response.getWriter();
		
		out.print(jsonClassPublic.JSONStringsArrayList);
		
		
//		try {
//			jsonClassPublic.Start();
//			
//			out.println("<!DOCTYPE html>");
//			out.println("<html>");  
//	        out.println("<head>");  
//	        out.println("<title> A very simple servlet example</title>");  
//	        out.println("</head>");  
//	         out.println("<body>"); 
//	         out.println("Here are your parts: " + jsonClassPublic.getList());
//	           out.println("</body>"); 
//	           out.println("</html>");
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
