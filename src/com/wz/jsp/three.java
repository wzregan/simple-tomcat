package com.wz.jsp;

import java.io.IOException;

import com.wz.http.HttpPrinter;

public class three extends JspServletAbs{
	
		int count = 0;
	
	public void service(com.wz.myservlet.ServletRequest request, com.wz.myservlet.ServletResponse response) {
		HttpPrinter out;
		try {
			out = response.getPrintWriter();
					out.print("<!DOCTYPE html>");







		this.count+=1;
		String a = request.getParameter("passwd");
		if(count>5){
			out.print("<h1>�������!</h1>");

		}else{
			out.print("<h1>��½�ɹ�!</h1>");

		}
			out.print("</body>");


			out.flush();

						System.out.println("model����"+count);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	};
}