package servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;



public class ProcessingRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProcessingRequest() {
    	
        super();
    }

   
	JSONklass jko = new JSONklass();
	 List<JSONklass> comps = new LinkedList<JSONklass>();

	 @Override	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 String[] mb = request.getParameterValues("PcBuilder");

      
      System.out.println(mb);

}
	      
		/*1
		  BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
		  response.setContentType("text/html");
	 
	      String json = "";
	      if(br != null){	
            json = br.readLine();
        }
       
        // 2. initiate jackson mapper
        ObjectMapper mapper = new ObjectMapper();
 
        // 3. Convert received JSON to JSONklass
        JSONklass jsonklass = mapper.readValue(json, JSONklass.class);
 
        // 4. Set response type to JSON
        response.setContentType("application/json");            
 
        // 5. Add compontent to List<JSONklass>
        comps.add(jsonklass);
 
        // 6. Send List<JSONklass> as JSON to client
        PrintWriter out = response.getWriter();
        
        mapper.writeValue(response.getOutputStream(), jsonklass	);
        */
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

	}
		
		
	}


