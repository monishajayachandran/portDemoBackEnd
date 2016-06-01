package com.Test.DaoImpl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Test.Bean.ClaimsBean;

import com.Test.dbConnectivity.JdbcTest;

public class ClaimsDaoImpl{

	public List<ClaimsBean> getClaimsList() throws SQLException, IOException {
		// TODO Auto-generated method stub
		
		Connection conn=null;
		 JdbcTest jdbc=new JdbcTest();
		 List<ClaimsBean> listOfClaims = new ArrayList<ClaimsBean>();
		 Statement statmnt=null;
		try {
			 conn = jdbc.getConnection();
			statmnt = conn.createStatement();
			 String sql = "SELECT * FROM Claims";
	         ResultSet rsltSet = statmnt.executeQuery(sql);
	          while(rsltSet.next())
	         {	     
	        	 ClaimsBean claims= new ClaimsBean();
	        	 claims.setId(rsltSet.getString("ID"));
	        	 claims.setServiceDate(rsltSet.getString("Service Date"));
	        	 claims.setPatient(rsltSet.getString("Patient"));
	        	 claims.setProvider(rsltSet.getString("Provider"));
	        	 claims.setTotalBilled(rsltSet.getString("Total Billed"));
	        	 claims.setStatus(rsltSet.getString("Status"));
	        	 claims.setPharmacyClaimNo(rsltSet.getString("Pharmacy Claim Number"));
	        	 claims.setNetwork(rsltSet.getString("Network"));
	        	 claims.setMedication(rsltSet.getString("Medication Name"));
	        	 claims.setType(rsltSet.getString("Type"));
	        	 claims.setPay(rsltSet.getString("You Pay"));
	        	 claims.setQuantity(rsltSet.getString("Quantity"));
	        	 
	         listOfClaims.add(claims);
	         }
	       
	        
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listOfClaims;
	}

	public ClaimsBean getClaimDetails(String id) throws SQLException, IOException {
		// TODO Auto-generated method stub
		Connection conn=null;
		 JdbcTest jdbc=new JdbcTest();
		 Statement statmnt=null;
		 ClaimsBean claims= new ClaimsBean();
		try {
			 conn = jdbc.getConnection();
			statmnt = conn.createStatement();
			 String sql = "SELECT * FROM Claims where ID='"+id+"'";
	         ResultSet rsltSet = statmnt.executeQuery(sql);
	         while(rsltSet.next())
	         {	     
	        	
	        	 claims.setId(rsltSet.getString("ID"));
	             claims.setServiceDate(rsltSet.getString("Service Date"));
	        	 claims.setPatient(rsltSet.getString("Patient"));
	        	 claims.setProvider(rsltSet.getString("Provider"));
	        	 claims.setTotalBilled(rsltSet.getString("Total Billed"));
	        	 claims.setStatus(rsltSet.getString("Status"));
	        	 claims.setPharmacyClaimNo(rsltSet.getString("Pharmacy Claim Number"));
	        	 claims.setNetwork(rsltSet.getString("Network"));
	        	 claims.setMedication(rsltSet.getString("Medication Name"));
	        	 claims.setType(rsltSet.getString("Type"));
	        	 claims.setPay(rsltSet.getString("You Pay"));
	        	 claims.setQuantity(rsltSet.getString("Quantity"));
	        	 
	         }
	        
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return claims;
	}

}
