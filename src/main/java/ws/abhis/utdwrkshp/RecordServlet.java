package main.webapp;

import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.servlet.http.HttpServlet;

public class RecordServlet extends HttpServlet{
	protected void doPost(HttpRequest request, HttpResponse response) throws IOException {
		response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String comment = request.getParameter("comment");
        
        BufferedWriter writer = new BufferedWriter(new FileWriter(File("comments.txt")));
        bufferedWriter.append(name + " " + email + " " + comment);
	}
}
