package com.Test.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Test.Bean.PlanBean;
import com.Test.DaoImpl.PlanDaoImpl;
import com.Test.dbConnectivity.JSONConvertion;
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
	
	@RequestMapping(value = "/memberList", method = RequestMethod.POST, headers = "Accept=application/json")
	public List<String> getMemberList(@RequestBody String selectedDate) {
		List<String> listOfMembers = new ArrayList<String>();
		System.out.println("selectedDate==>"+selectedDate);
		listOfMembers = planDaoImpl.getMemberList(selectedDate);
		return listOfMembers;
	}

	@RequestMapping(value = "/benefitPeriod", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<String> getbenefitPeriods() {
		List<String> listOfMembers = new ArrayList<String>();
		listOfMembers = planDaoImpl.getBenefitPeriods();
		return listOfMembers;
	}

	
	@RequestMapping(value = "/serviceLimits", method = RequestMethod.POST, produces = "application/json")
	public List<JSONObject> getServiceDetails(@RequestBody String body) throws ParseException {
		List<JSONObject> listjObject = new ArrayList<JSONObject>();		
		JSONObject json = (JSONObject) new JSONParser().parse(body);
		String benefitDate=(String) json.get("BenefitPeriod");
		String member=(String) json.get("Member");
		 List<PlanBean> ListPlanBean =planDaoImpl.getPlanDetails(benefitDate,member);
		 if(ListPlanBean.size()>0)
		 {
			 for(int i=0;i<ListPlanBean.size();i++)
			 {
			if(ListPlanBean.get(i).getId()>0){
				  JSONObject jObject = new JSONObject();
					jObject.put("item", ListPlanBean.get(i).getItem());
					jObject.put("limit", ListPlanBean.get(i).getLimit());
					jObject.put("used", ListPlanBean.get(i).getUsedAmount());
					jObject.put("remaining",ListPlanBean.get(i).getRemainingAmount());
					listjObject.add(jObject);	
					}
			 }
		 }
		return listjObject;
}
}
