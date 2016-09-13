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
		//������� ������Ʈ�� �ö����� ��ü(request,response)�� �����������
		//�����ִ� ��������� �����Ǵ� ���̱⿡ ������ �����ؾ��� 


		// read form data( form�� html ���Ͽ� ���� )
		String username = request.getParameter("username");  //����ڰ� �Է��� ���� �о������//index.html�� name�� ��ġ�ؾ���
		String password = request.getParameter("password");

		//perform business logic
		//�츮�� �����ݽ��� �������� ..������Ҷ��� �����ݽ� ��ü�� �����

		PrintWriter out = response.getWriter(); //��ü�� �����°ſ���
		//���̺귯�� ����Ʈ �ʿ��ϴ� //ctrl + shift + o
		//�� ��ü�� ��Ʈ���� ���������

		//Build HTML code
		String htmlResponse="<html>";

		htmlResponse += "<h2> Your name is : " + username + "<br/>";
		htmlResponse += "Your password is : " + password + "<h2>";
		htmlResponse += "</html>";
		//ctrl + space�� �ڵ��ϼ�

		out.println(htmlResponse);

	}

}
