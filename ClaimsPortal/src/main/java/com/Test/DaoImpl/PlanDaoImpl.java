package com.Test.DaoImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.Test.Bean.PlanBean;
import com.Test.dbConnectivity.JdbcTest;

public class PlanDaoImpl {

	
	public PlanBean getPlanDetails(String selectedDate) {
		Connection conn = null;
		JdbcTest jdbc = new JdbcTest();
		Statement statmnt = null;
		boolean check = false;
		PlanBean planBean = new PlanBean();
		try {
			conn = jdbc.getConnection();
			statmnt = conn.createStatement();
			String sql = "SELECT * FROM planInfo where BenefitPeriod='" + selectedDate + "'";
			ResultSet rsltSet = statmnt.executeQuery(sql);
			if (rsltSet.next()) { // if rs.next() returns false
				// then there are no rows.
				planBean.setId(Long.parseLong(rsltSet.getString("ID")));
				planBean.setMemberId(rsltSet.getString("MemberId"));
				planBean.setMember(rsltSet.getString("Member"));
				planBean.setBenefits(rsltSet.getString("Benefits"));
				planBean.setStatus(rsltSet.getString("Status"));
				planBean.setItem(rsltSet.getString("Item"));
				planBean.setBenefitPeriod(rsltSet.getString("BenefitPeriod"));
				planBean.setLimit(rsltSet.getString("Limit"));
				planBean.setUsedAmount(rsltSet.getString("Used"));
				planBean.setRemainingAmount(rsltSet.getString("Remaining"));
			} 

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return planBean;
	} 
}
