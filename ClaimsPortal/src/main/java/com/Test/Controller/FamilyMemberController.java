package com.Test.Controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.Test.Bean.FamilyMemberBean;
import com.Test.DaoImpl.FamilyMemberDaoImpl;

@RestController
public class FamilyMemberController {
	
	FamilyMemberDaoImpl familyDaoImpl =new FamilyMemberDaoImpl();

	@RequestMapping(value = "/memberIdcard", method = RequestMethod.POST)
	public List<FamilyMemberBean> getCountries(@RequestBody String MemberId) {
		List<FamilyMemberBean> listOfmembers = new ArrayList<FamilyMemberBean>();
		listOfmembers = familyDaoImpl.getFamilyMembersDetails(MemberId);
		return listOfmembers;
	}
}
