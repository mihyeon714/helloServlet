package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/DoLogin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/** 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//사용자의 리퀘스트가 올때마다 객체(request,response)가 만들어지지요
		//위에있는 멤버변수는 공유되는 것이기에 접근을 조심해야함 


		// read form data( form은 html 파일에 있음 )
		String username = request.getParameter("username");  //사용자가 입력한 값을 읽어들이자//index.html의 name과 일치해야함
		String password = request.getParameter("password");

		//perform business logic
		//우리가 리스펀스를 보낼때는 ..출력을할때는 리스펀스 객체를 사용함

		PrintWriter out = response.getWriter(); //객체를 얻어오는거예여
		//라이브러리 임포트 필요하다 //ctrl + shift + o
		//그 객체에 스트링을 출력해주자

		//Build HTML code
		String htmlResponse="<html>";

		htmlResponse += "<h2> Your name is : " + username + "<br/>";
		htmlResponse += "Your password is : " + password + "<h2>";
		htmlResponse += "</html>";
		//ctrl + space는 자동완성

		out.println(htmlResponse);

	}

}
