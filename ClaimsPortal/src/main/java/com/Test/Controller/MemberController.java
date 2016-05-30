package com.Test.Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.util.JSONPObject;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Test.Bean.MemberBean;
import com.Test.Bean.User;
import com.Test.DaoImpl.MemberDaoImpl;
import com.Test.dbConnectivity.JdbcTest;

/*@CrossOrigin(origins = "http://localhost:9000")*/
@RestController
public class MemberController {
	
	MemberDaoImpl memberDaoImpl = new MemberDaoImpl();

	@Autowired
	MemberBean memberBean;

	@RequestMapping(value = "/member", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<MemberBean> getCountries() {
		List<MemberBean> listOfClaims = new ArrayList<MemberBean>();
		listOfClaims = memberDaoImpl.getMembersDetails();
		return listOfClaims;
	}

	
	@RequestMapping(value = "/validateMember", method = RequestMethod.POST, produces = "application/json")
	public int mycustomAction(@RequestBody String body) {
		ObjectMapper mapper = new ObjectMapper();
		int returnVal = 0;
		try {
			MemberBean member = mapper.readValue(body, MemberBean.class);
			boolean testVal = memberDaoImpl.checkMemberDetails(member.getUserName(), member.getEmailAddress());
			if (testVal) {
				returnVal = memberDaoImpl.saveMembersDetails(member);
			} else {
				returnVal = 5;
			}
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// body is always empty

		return returnVal;
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json")
	public JSONPObject saveProfileJson(@RequestBody JSONPObject member) {
		JSONPObject jsonObj = null;
		jsonObj = member;
		// MemberBean mm = new MemberBean();
		return jsonObj;
	}

	

	
	
	@RequestMapping(value = "/validateLoginUser", method = RequestMethod.POST, produces = "application/json")
	public JSONObject checkAction(@RequestBody String body) {
		ObjectMapper mapper = new ObjectMapper();
		int returnVal = 0;
		JSONObject jObject = new JSONObject();
		try {
			User user = mapper.readValue(body, User.class);
				MemberBean member =memberDaoImpl.checkLoginDetails(user.getUserName(), user.getPassword());
				if(member.getId()>0){
				
				jObject.put("firstName", member.getFirstName());
				jObject.put("lastName", member.getLastName());
				jObject.put("emailAddress", member.getEmailAddress());
				jObject.put("userName", member.getUserName());
				jObject.put("memberId", member.getMemberId());
				jObject.put("planName", member.getPlanName());
				jObject.put("lastLogin", member.getLastLogin());
						
				}
				
			
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// body is always empty

		return jObject;
		
	}
	
	
	
	
	}
	


