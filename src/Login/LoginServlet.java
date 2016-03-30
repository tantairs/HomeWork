package Login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import User.UserBean;
import User.UserDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try { 
			UserBean user = new UserBean(); 
			user.setUserName(request.getParameter("un")); 
			user.setPassword(request.getParameter("pw")); 
			user = UserDAO.login(user); 
			if (user.isValid() && user.getStatus().equals("ACTIVE")) { 
				//HttpSession is an interface that provides a way to identify a user across more than one page request or visit to a Web site and to store information about that user. It allows servlets to view and manipulate information about a session, such as the session identifier, creation time, last accessed time AND Bind objects to sessions, allowing user information to persist across multiple user connections 
				HttpSession session = request.getSession(true); //Returns the current HttpSession associated with this request or, if there is no current session and create is true, returns a new session.
				session.setAttribute("currentSessionUser",user); //Binds an object (user) to this session, using the name specified (currentSessionUser)
				response.sendRedirect("dashboard.jsp"); //Sends a temporary redirect response to the client using the specified redirect location URL (userLogged.jsp)
				//logged-in page 
			} 
			else if (user.getStatus().equals("BLOCKED"))
				response.sendRedirect("accountBlocked.jsp"); 
			else
				response.sendRedirect("invalidLogin.jsp"); 
				//error page 
		} 
		catch (Throwable theException) { 
			System.out.println(theException); 
		}
		
	}

}
