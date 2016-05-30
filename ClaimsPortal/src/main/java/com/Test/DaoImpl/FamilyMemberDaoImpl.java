package com.Test.DaoImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Test.Bean.FamilyMemberBean;
import com.Test.Bean.MemberBean;
import com.Test.dbConnectivity.JdbcTest;

public class FamilyMemberDaoImpl {


	public List<FamilyMemberBean> getFamilyMembersDetails(String memberId) {
		List<FamilyMemberBean> familyMembers = new ArrayList<FamilyMemberBean>();
		Connection conn = null;
		JdbcTest jdbc = new JdbcTest();

		Statement statmnt = null;
		try {
			conn = jdbc.getConnection();
			statmnt = conn.createStatement();
			String sql = "SELECT * FROM family_member where MemberId='"+memberId+"'";
			ResultSet rsltSet = statmnt.executeQuery(sql);
			while (rsltSet.next()) {
				FamilyMemberBean member = new FamilyMemberBean();
				member.setId(Long.parseLong(rsltSet.getString("ID"))); 		
  				member.setUserName(rsltSet.getString("MemberName"));
  				member.setMemberId(rsltSet.getString("MemberId"));
  				member.setAge(rsltSet.getString("MemberAge"));
  				member.setImage1URL(rsltSet.getString("CardImageFrontURl"));
  				member.setImage2URL(rsltSet.getString("CardImageBackURl"));

  				familyMembers.add(member);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return familyMembers;
	}
	
}
