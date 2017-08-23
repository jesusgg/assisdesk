package com.assistdesk.api.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jgarcia on 23.08.17.
 */
@RestController
public class AssistDeskRestController {

	@RequestMapping("/")
	public String welcome() {//Welcome page, non-rest
		return "Hello.";
	}

}
