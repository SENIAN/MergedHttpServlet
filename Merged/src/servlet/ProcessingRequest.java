package servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.util.JSON;




public class ProcessingRequest extends HttpServlet {
	public String getS() {
		return s;
	}



	public void setS(String s) {
		this.s = s;
	}


	String s;

	private static final long serialVersionUID = 1L;
       
    public ProcessingRequest() {
    	
        super();
        
    }

   
Test tst = new Test();

	 @Override	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

		 BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
		 
		 
				 while ((s=br.readLine())!=null)
				 {
					 
					
					 setS(s);
					 System.out.println(getS());
				 }			
				 
}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

	}
	
	
}