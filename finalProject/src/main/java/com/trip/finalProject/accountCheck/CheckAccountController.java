package com.trip.finalProject.accountCheck;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CheckAccountController {
	
	@Autowired
	CheckAccountService checkAccountService;
	
	
	
	@PostMapping("/check1")
	@ResponseBody
	public Map<Object, Object> CheckAccount(@RequestParam("bank_code") String bank_code, @RequestParam("bank_num") String bank_num) {
		HashMap<Object, Object> map = new HashMap<>();
		map = checkAccountService.getAccessToken1(bank_code, bank_num);
	
		String bankHolderInfo = (String) map.get("bankHolderInfo");
		
		Object errorObj = map.get("error");
		if (errorObj instanceof String) {
		    String errorStr = (String) errorObj;
		    int error1 = Integer.parseInt(errorStr);
		    map.put("errormsg", String.valueOf(error1));
		} 

		
		map.put("bankHolderInfo", bankHolderInfo);
		System.out.println("예금주:"+bankHolderInfo);
		return map;
		
		
	}

}
