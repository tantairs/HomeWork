package Beneficiary;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ConnectionManager.ConnectionManager;
import DBProcedures.DBProcedures;
import User.UserBean;

/**
 * Servlet implementation class AddBenefitiaryServlet
 */
@WebServlet("/AddBenefitiaryServlet")
public class AddBeneficiaryServlet extends HttpServlet {
	
	static Connection currentCon = null; 
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBeneficiaryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("AddBenefitiaryServlet DOGET");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//TODO Auto-generated method stub
		System.out.println("AddBenefitiaryServlet DOPOST");
		
		HttpSession session=request.getSession();
		UserBean currentUser = (UserBean) (session.getAttribute("currentSessionUser"));
		System.out.println("USERNAME IN BENEFITIARY: " + currentUser.getUsername());
		
		//We go to the Bean and we add the beneficiary
		String accountNumber = request.getParameter("an");
		String beneficiaryAccountNumber = request.getParameter("ban");
		String bankName = request.getParameter("bn");
		float limit = Float.parseFloat(request.getParameter("li"));
		String name = request.getParameter("na");
		
		Connection conn = ConnectionManager.getConnection();
		DBProcedures.addBeneficiary(accountNumber, beneficiaryAccountNumber, bankName, limit, name);
		
	}

}
