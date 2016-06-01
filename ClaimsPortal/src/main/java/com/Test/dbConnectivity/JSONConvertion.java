package com.Test.dbConnectivity;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;



public class JSONConvertion {

	public List<String> getJsonString(String jsonStr) throws ClassNotFoundException {
		List<String> convertedString =null;
		System.out.println("jsonStr===============>"+jsonStr);
		JSONObject jsonObj;
		try {
			jsonObj = new JSONObject(jsonStr);
			 String name = jsonObj.getString("date");
		        System.out.println(name);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       
	        return convertedString;
	}
}
