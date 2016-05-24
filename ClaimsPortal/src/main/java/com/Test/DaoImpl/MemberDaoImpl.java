package com.Test.DaoImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Test.Bean.MemberBean;
import com.Test.dbConnectivity.JdbcTest;

public class MemberDaoImpl {

	public List<MemberBean> getMembersDetails() {
		List<MemberBean> members = new ArrayList<MemberBean>();
		Connection conn = null;
		JdbcTest jdbc = new JdbcTest();

		Statement statmnt = null;
		try {
			conn = jdbc.getConnection();
			statmnt = conn.createStatement();
			String sql = "SELECT * FROM members";
			ResultSet rsltSet = statmnt.executeQuery(sql);
			while (rsltSet.next()) {
				MemberBean member = new MemberBean();
				member.setId(Long.parseLong(rsltSet.getString("ID")));
				member.setFirstName(rsltSet.getString("FirstName"));
				member.setLastName(rsltSet.getString("LastName"));
				member.setEmailAddress(rsltSet.getString("EmailAddress"));
				member.setUserName(rsltSet.getString("UserName"));
				member.setPassword(rsltSet.getString("Password"));
				member.setMemberId(rsltSet.getString("MemberId"));
				member.setPlanName(rsltSet.getString("PlanName"));
				member.setLastLogin(rsltSet.getString("LastLogin"));

				members.add(member);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return members;
	}
	
	public int saveMembersDetails(MemberBean member) {
		Connection conn = null;
		JdbcTest jdbc = new JdbcTest();
		Statement statmnt = null;
		int test = 0;
		try {
			conn = jdbc.getConnection();
			statmnt = conn.createStatement();

			test = statmnt.executeUpdate(
					"INSERT INTO members(ID,FirstName,LastName,EmailAddress,UserName,Password,MemberId,PlanName,LastLogin) VALUES('"
							+ member.getId() + "','" + member.getFirstName() + "','" + member.getLastName() + "','"
							+ member.getEmailAddress() + "','" + member.getUserName() + "','" + member.getPassword()
							+ "','" + member.getMemberId() + "','" + member.getPlanName() + "','"
							+ member.getLastLogin() + "')");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return test;

	}
	
	public MemberBean checkLoginDetails(String name, String password) {
		Connection conn = null;
		JdbcTest jdbc = new JdbcTest();
		Statement statmnt = null;
		boolean check = false;
		MemberBean member = new MemberBean();
		try {
			conn = jdbc.getConnection();
			statmnt = conn.createStatement();
			/*String sql = "SELECT * FROM members where UserName='"+name+"' and Password='"+password+"'";*/
			 String sql = "SELECT * FROM members where UserName='"+name+"' and Password='"+password+"'";
			ResultSet rsltSet = statmnt.executeQuery(sql);
			 // if rs.next() returns false
				// then there are no rows.
				while (rsltSet.next()) {
					
					member.setId(Long.parseLong(rsltSet.getString("ID")));
					member.setFirstName(rsltSet.getString("FirstName"));
					member.setLastName(rsltSet.getString("LastName"));
					member.setEmailAddress(rsltSet.getString("EmailAddress"));
					member.setUserName(rsltSet.getString("UserName"));
					member.setPassword(rsltSet.getString("Password"));
					member.setMemberId(rsltSet.getString("MemberId"));
					member.setPlanName(rsltSet.getString("PlanName"));
					member.setLastLogin(rsltSet.getString("LastLogin"));

					
				}
				
					} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return member;
	} 
	
	public boolean checkMemberDetails(String name, String email) {
		Connection conn = null;
		JdbcTest jdbc = new JdbcTest();
		Statement statmnt = null;
		boolean check = false;
		try {
			conn = jdbc.getConnection();
			statmnt = conn.createStatement();
			String sql = "SELECT * FROM members where UserName='" + name + "' or EmailAddress='" + email + "'";
			ResultSet rsltSet = statmnt.executeQuery(sql);
			if (!rsltSet.next()) { // if rs.next() returns false
				// then there are no rows.
				check = true;
			} else {
				check = false;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	} 
	

}
