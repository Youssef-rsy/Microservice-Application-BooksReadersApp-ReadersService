package com.local.ysf.ReaderService.exposition.swagger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReaderServiceSwaggerController {
	
	@RequestMapping(value="/")
	public String swaggerHomePage() {
		return "redirect:/swagger-ui.html";
	}
}
