package com.Test.Controller;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Test.Bean.PlanBean;
import com.Test.DaoImpl.PlanDaoImpl;
@RestController
public class PlanController {

	PlanDaoImpl planDaoImpl =new PlanDaoImpl();

	@RequestMapping(value = "/planInfo", method = RequestMethod.POST, produces = "application/json")
	public JSONObject checkAction(@RequestBody String selectedDate) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		JSONObject jObject = new JSONObject();
		PlanBean planInfo =planDaoImpl.getPlanDetails(selectedDate);
		if(planInfo.getId()>0){
		
		jObject.put("member", planInfo.getMember());
		jObject.put("benefits", planInfo.getBenefits());
		jObject.put("status", planInfo.getStatus());
		jObject.put("benefitPeriod", planInfo.getBenefitPeriod());
					
		}

		return jObject;
		
	}
	
	
	
}
