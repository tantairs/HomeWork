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
 * Servlet implementation class EditBenefitiaryServlet
 */
@WebServlet("/EditBenefitiaryServlet")
public class EditBeneficiaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditBeneficiaryServlet() {
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
		System.out.println("EditBenefitiaryServlet DOPOST");
		
		HttpSession session=request.getSession();
		UserBean currentUser = (UserBean) (session.getAttribute("currentSessionUser"));
		System.out.println("USERNAME IN BENEFITIARY: " + currentUser.getUsername());
		
		//We go to the Bean and we add the beneficiary
		Integer b_id = Integer.parseInt(request.getParameter("b_id"));
		Float maxAmount = Float.parseFloat(request.getParameter("m_am"));
		String name = request.getParameter("na");
		
		
		Connection conn = ConnectionManager.getConnection();
		DBProcedures.editBeneficiary(b_id, maxAmount, name);
	}

}
