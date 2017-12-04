package hu.czghun.archive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArchiveController {

	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/")
	public String mainPage() {
		return "index";
	}
	
	@RequestMapping("/vulnerability")
	public String vulnerability() {
		return "vulnerability";
	}
	
	@RequestMapping("/attacks")
	public String attacks() {
		return "attacks";
	}
	
}
