package History;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import User.UserBean;

/**
 * Servlet implementation class HistoryServlet
 */
@WebServlet("/HistoryServlet")
public class HistoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HistoryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session=request.getSession();
		
		try {
			HistoryBean history = new HistoryBean();
			
			//Get current username
			UserBean currentUser = (UserBean) (session.getAttribute("currentSessionUser")); 
			
			//We go to the Bean and get the history of this specific UserName
			HistoryDAO.getHistory(history, currentUser.getUsername()); 
			
			if (history.isValid()) { 
				System.out.println("HISTORY OK");	
			} 
			else 
				System.out.println("EMPTY HISTORY");			
				//response.sendRedirect("invalidLogin.jsp"); 
				//error page 
		} 
		catch (Throwable theException) { 
			System.out.println(theException); 
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
