package com.Test.dbConnectivity;

import java.text.ParseException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class TestJSON {

	public static void main(String[] args) throws org.json.simple.parser.ParseException, ParseException {

		JSONObject jObject = new JSONObject();

		jObject.put("EmployeeId", new Integer(121));
		jObject.put("Name", "Ramesh");
		jObject.put("Salary", new Double(15000.00));
		jObject.put("isPermanent", new Boolean(true));
		jObject.put("Nickname", null);
		
		//convert from JSONObject to JSON string
		String jsonText = jObject.toJSONString();
System.out.println("jObject new file==>"+jObject);
		System.out.println(jsonText);

		JSONParser parser = new JSONParser();
		
		//convert from JSON string to JSONObject
		JSONObject newJObject = null;
		newJObject = (JSONObject) parser.parse(jsonText);

		System.out.println(newJObject.get("EmployeeId"));
		System.out.println(newJObject.get("Name"));
		System.out.println(newJObject.get("Salary"));
		System.out.println(newJObject.get("isPermanent"));
		System.out.println(newJObject.get("Nickname"));
	}
}