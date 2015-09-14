package com.cirta.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cirta.domain.Hotels;
import com.cirta.service.HotelsService;

/**
 * Controller du webService
 * 
 * @author Nassim AIT BRAHAM
 *
 */

@Controller
@RequestMapping("cirta/rest/getHotels")
public class HotelsController {

	@Autowired
	private HotelsService hotelsService;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Hotels> sayHello(
			@RequestParam(value = "name", required = false, defaultValue = "Stranger") String name) {

		return hotelsService.getListeHotels();
	}

}
