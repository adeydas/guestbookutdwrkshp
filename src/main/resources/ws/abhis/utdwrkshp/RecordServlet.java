package main.webapp;

import javax.servlet.http.HttpServlet;

public class RecordServlet extends HttpServlet{
	protected void doPost(HttpRequest request, HttpResponse response) throws IOException {
		response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String comment = request.getParameter("comment");
	}
}
