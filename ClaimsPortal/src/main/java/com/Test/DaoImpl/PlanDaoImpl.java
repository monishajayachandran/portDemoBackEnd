package com.Test.DaoImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
	
	
	public List<String> getMemberList(String benefitDate){
		Connection conn = null;
		JdbcTest jdbc = new JdbcTest();
		Statement statmnt = null;
		List<String> memberList=  new ArrayList<String>();
		try {
			conn = jdbc.getConnection();
			statmnt = conn.createStatement();
			
		String sql = "SELECT DISTINCT Member FROM planInfo where BenefitPeriod='"+benefitDate+"'";
        ResultSet rsltSet = statmnt.executeQuery(sql);
		while (rsltSet.next()) {
			String member =null;
			member=rsltSet.getString("Member");
			memberList.add(member);
		}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return memberList;
		
	}
	
	public List<String> getBenefitPeriods()
	{
		Connection conn = null;
		JdbcTest jdbc = new JdbcTest();
		Statement statmnt = null;
		List<String> BenefitPeriods=  new ArrayList<String>();
		try {
			conn = jdbc.getConnection();
			statmnt = conn.createStatement();
			
		String sql = "SELECT DISTINCT BenefitPeriod FROM planInfo ";
        ResultSet rsltSet = statmnt.executeQuery(sql);
		while (rsltSet.next()) {
			String Benefitdate =null;
			Benefitdate=rsltSet.getString("BenefitPeriod");
			BenefitPeriods.add(Benefitdate);
		}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return BenefitPeriods;	
		
	}
	
	public List<PlanBean> getPlanDetails(String selectedDate,String Member) {
		Connection conn = null;
		JdbcTest jdbc = new JdbcTest();
		Statement statmnt = null;
		boolean check = false;
		List<PlanBean> listPlanDetails = new ArrayList<PlanBean>();
		
		try {
			System.out.println("selectedDate=>"+selectedDate);
			System.out.println("Member=>"+Member);
			conn = jdbc.getConnection();
			statmnt = conn.createStatement();
			String firstSql= "SELECT DISTINCT MemberId FROM planInfo where BenefitPeriod='"+selectedDate+"' and Member='"+Member+"'";
			ResultSet rsltSet = statmnt.executeQuery(firstSql);
			String memberId=null;
  			while (rsltSet.next()) {
  				memberId=rsltSet.getString("MemberId");
  				/*member.setImageURL(rsltSet.getString("ImageURl"));*/
  			}
  			if(memberId!=null)
  			{
  				String sql = "select * from serviceLimits where memberId='"+memberId+"'";
	              rsltSet = statmnt.executeQuery(sql);
	  			while (rsltSet.next()) {
	  				   PlanBean planBean = new PlanBean();
	  					// then there are no rows.
	  					planBean.setId(Long.parseLong(rsltSet.getString("ID")));
	  					planBean.setMemberId(rsltSet.getString("MemberId"));
	  					planBean.setItem(rsltSet.getString("Item"));
	  					planBean.setLimit(rsltSet.getString("Limit"));
	  					planBean.setUsedAmount(rsltSet.getString("Used"));
	  					planBean.setRemainingAmount(rsltSet.getString("Remaining"));
	  					listPlanDetails.add(planBean);
	  				/*member.setImageURL(rsltSet.getString("ImageURl"));*/
	  			}
  			}
  			
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listPlanDetails;
	} 
}
