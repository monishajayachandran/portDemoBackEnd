package com.Test.dbConnectivity;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.Test.Bean.FamilyMemberBean;
import com.Test.Bean.MemberBean;




public class SampleTest {

	/*public void saveMembersDetails(MemberBean member) {*/
	public static void main(String args[]){
			 Connection conctn = null;
			  Statement statmnt=null;
			 
	        try
	        {
	        	 Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
	             String url = "jdbc:ucanaccess://C:/software/Member_Portal.accdb";
	             conctn=DriverManager.getConnection(url);
	              statmnt = conctn.createStatement();
	       /*String sql = "SELECT * FROM serviceLimits where MemberId='3'";*/
	              /*String sql = "SELECT planInfo.Member FROM"
	              		+ " planInfo FULL OUTER service ON planInfo.MemberId=service.MemberId "
	              		+ "ORDER BY planInfo.Member";*/
	              
	             /* String sql="select planInfo.Member from service,planInfo where service.MemberId=planInfo.MemberId";*/
	             /* String sql = "SELECT DISTINCT BenefitPeriod FROM planInfo";*/
	            /*  String sql = "SELECT DISTINCT Member FROM planInfo where BenefitPeriod='Feb 01, 2016 to Present'";*/
	              String newTExt= "SELECT DISTINCT MemberId FROM planInfo where BenefitPeriod='Feb 01, 2016 to Present' and Member='Claire (1/1/1942)'";
	            /*  String sql = "select * from serviceLimits where memberId='"+newTExt+"'";*/
	              ResultSet rsltSet = statmnt.executeQuery(newTExt);
	              System.out.println("rsltSet=>"+rsltSet);
	              String memberId=null;
	  			while (rsltSet.next()) {
	  				System.out.println("data=>"+rsltSet.getString("MemberId"));
	  				memberId=rsltSet.getString("MemberId");
	  				/*member.setImageURL(rsltSet.getString("ImageURl"));*/
	  			}
	  			String sql = "select * from serviceLimits where memberId='"+memberId+"'";
	              rsltSet = statmnt.executeQuery(sql);
	              System.out.println("rsltSet=>"+rsltSet);
	  			while (rsltSet.next()) {
	  				System.out.println("data=>"+rsltSet.getString("Item"));
	  				System.out.println("data=>"+rsltSet.getString("Limit"));
	  				System.out.println("data=>"+rsltSet.getString("Used"));
	  				System.out.println("data=>"+rsltSet.getString("Remaining"));
	  				/*member.setImageURL(rsltSet.getString("ImageURl"));*/
	  			}
	  			
		         conctn.close(); 
	        }
	        catch(Exception sqlExcptn)
	        {
	            System.out.println(sqlExcptn);
	        }
	}
		
		  
	              
	              
	              
	              
	              
	         /* statmnt.executeUpdate("INSERT INTO members(FirstName,LastName,EmailAddress,UserName,Password,MemberId,PlanName,LastLogin) VALUES('Kavitha','Ram','Kavitha.Ram@accenture.com','kavitha.Ram','kavitha@123','2','plan','2016-05-06 00:00:00.000000')");*/   
	              /*statmnt.executeUpdate("INSERT INTO members(ID,FirstName,LastName,EmailAddress,UserName,Password,MemberId,PlanName,LastLogin) VALUES('"+member.getId()+"','"+member.getFirstName()+"','"+member.getLastName()+"','"+member.getEmailAddress()+"','"+member.getUserName()+"','"+member.getPassword()+"','"+member.getMemberId()+"','"+member.getPlanName()+"','2016-05-06 00:00:00.000000')");*/     
	  			
	              /*statmnt.executeUpdate("INSERT INTO Claims(ID,FirstName,LastName,EmailAddress,UserName,Password) VALUES('3','Kavitha','Ram','Kavitha.Ram@accenture.com','kavitha.Ram','kavitha@123'");*/     
	          /*   statmnt.executeUpdate("INSERT INTO Claims(ID,Service Date,Patient,Provider,Total Billed,Status,Pharmacy Claim Number,Network,Medication Name,Type,You Pay,Quantity) VALUES('2','2016-05-06 00:00:00.000000','Joe smith','Generic Hospital','80.0000','Processed','LgClmAmt01','In Network','Yes','N/A','50.0000','N/A')");*/
	           /* ResultSet rsltSet=statmnt.executeQuery(sql);*/
	 		/*	String sql = "SELECT * FROM members where ID='1'";*/
	            /*  String sql = "SELECT * FROM Claims where ID='100'";
		         ResultSet rsltSet = statmnt.executeQuery(sql);
		         System.out.println("length=>"+rsltSet.getRow());*/
	              /*String sql = "SELECT * FROM members where UserName='dataNew' and Password='asdasdasd'";
	              
	              ResultSet rsltSet = statmnt.executeQuery(sql);
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
	  			System.out.println("memeber--->"+member);*/
	             
	             /* statmnt.executeUpdate(
							"UPDATE members SET FirstName = '"+ member.getFirstName() +"',LastName = '"+ member.getLastName() +"',"
									+ "EmailAddress = '"+ member.getEmailAddress()+"',UserName = 'dataNew',"
									+ "Password = '"+ member.getPassword() +"',MemberId = '"+ member.getMemberId() +"',"
											+ "PlanName = '"+ member.getPlanName() +"',LastLogin = '"+ member.getLastLogin() +"' WHERE UserName='"+ member.getUserName()+"' ")	;
		     */   /* if (!rsltSet.next()) {                            //if rs.next() returns false
                     //then there are no rows.
System.out.println("No records found");

}
		         Claim claims= new Claim();
		       
		         while(rsltSet.next())
		         {*/
		        	/* claims.setId(rsltSet.getString("ID"));
		        	 claims.setServiceDate(rsltSet.getString("ServiceDate"));
		        	 claims.setPatient(rsltSet.getString("Patient"));
		        	 claims.setProvider(rsltSet.getString("Provider"));
		        	 claims.setTotalBilled(rsltSet.getString("Total Billed"));
		        	 claims.setStatus(rsltSet.getString("Status"));
		        	 claims.setPharmacyClaimNo(rsltSet.getString("Pharmacy Claim Number"));
		        	 claims.setNetwork(rsltSet.getString("Network"));
		        	 claims.setMedication(rsltSet.getString("Medication Name"));
		        	 claims.setType(rsltSet.getString("Type"));
		        	 claims.setPay(rsltSet.getString("You Pay"));
		        	 claims.setQuantity(rsltSet.getString("Quantity"));*/
		        	/* member.setFirstName(rsltSet.getString("FirstName"));
		        	 member.setLastName(rsltSet.getString("LastName"));
		        	 member.setEmailAddress(rsltSet.getString("EmailAddress"));
		        	 member.setUserName(rsltSet.getString("UserName"));
		        	 member.setPassword(rsltSet.getString("Password"));
		        	 member.setMemberId(rsltSet.getString("MemberId"));
		        	 member.setPlanName(rsltSet.getString("PlanName"));
		        	 member.setLastLogin(rsltSet.getString("LastLogin"));*/
		        	
		       /*  }*/
	          /*    statmnt.executeUpdate("DELETE FROM members WHERE ID between 4 and 21");
		       System.out.println("delete---->"+statmnt.executeUpdate("DELETE FROM members WHERE ID IN (3, 20)"));*/
		        /* Claim claim = mapper.writeValue(claims, Claim.class);*/
           
		
		
		
		/*MemberBean members=new MemberBean();
		MemberDaoImpl dao=new MemberDaoImpl();
		members=dao.getMemberDetails();
		System.out.println("Members===>"+members);*/
		
		
		
		
		
		/*ArrayList<MemberBean> members = new ArrayList<MemberBean>();
	
		 Connection conn=null;
		 JdbcTest jdbc=new JdbcTest();
		
		 Statement statmnt=null;
		try {
			 conn = jdbc.getConnection();
			statmnt = conn.createStatement();
			 String sql = "SELECT * FROM members where ID='2'";
	         ResultSet rsltSet = statmnt.executeQuery(sql);
	         System.out.println("ResultSet===>"+rsltSet);
	         while(rsltSet.next())
	         {	     
	        		MemberBean member= new MemberBean();
	        	 member.setId(rsltSet.getString("ID"));
	        	 member.setFirstName(rsltSet.getString("FirstName"));
	        	 member.setLastName(rsltSet.getString("LastName"));
	        	 member.setEmailAddress(rsltSet.getString("EmailAddress"));
	        	 member.setUserName(rsltSet.getString("UserName"));
	        	 member.setPassword(rsltSet.getString("Password"));
	        	 
	        	 members.add(member);
	         }
	         System.out.println("Members==>"+members);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
	}       */
	    
}
	


