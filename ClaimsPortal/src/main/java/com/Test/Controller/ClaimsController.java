package com.Test.Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Test.Bean.ClaimsBean;
import com.Test.DaoImpl.ClaimsDaoImpl;

@RestController
public class ClaimsController {
	
	ClaimsDaoImpl claims=new ClaimsDaoImpl();
	
	@RequestMapping(value = "/claims", method = RequestMethod.GET,headers="Accept=application/json")
	public List<ClaimsBean> getCountries() throws SQLException, IOException
	{
		List<ClaimsBean> listOfClaims = new ArrayList<ClaimsBean>();
		listOfClaims = claims.getClaimsList();
		return listOfClaims;
	}

	@RequestMapping(value = "/claim/{id}", method = RequestMethod.GET,headers="Accept=application/json")
	public ClaimsBean getClaimsById(@PathVariable String id) throws SQLException, IOException
	{
		 ClaimsBean claim= new ClaimsBean();
		 claim = claims.getClaimDetails(id);
		return claim;
	}

	
}
