


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/UserRequest.do")
public class UserRequest extends HttpServlet {
	public String getParsedJSONString() {
		return parsedJSONString;
	}

	public void setParsedJSONString(String parsedJSONString) {
		
		this.parsedJSONString = parsedJSONString;
		
	}
	public String parsedJSONString;

	private static final long serialVersionUID = 1L;
       
    public UserRequest() {
        super();        
    }

    
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
		 		 
		String button_param = request.getParameter("Data1");
		
		parsedJSONString = br.readLine();

		setParsedJSONString(parsedJSONString);
		
//		JSONklass jk = new JSONklass();
//		jk.fillArrayList();
		
		
//		out.print(jk.getList());
		
//		try {
//			
//			
//		System.out.println(jk.getList());
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		

		
		System.out.println(getParsedJSONString());
		
		 if(button_param.equals("Save"));
		 {
			 response.sendRedirect("OutputUser");
		 }

//		
//		
//		while ((!= null)
//				 {	
//					
//					 
//				 }			
		
		
								 
}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		
	}
	
	
}