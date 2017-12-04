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
	@RequestMapping("/global")
	public String global() {
		return "global";
	}
	@RequestMapping("/honorary")
	public String honorary() {
		return "honorary";
	}
	@RequestMapping("/OWASP")
	public String OWASP() {
		return "OWASP";
	}
	@RequestMapping("/abuse")
	public String abuse() {
		return "abuse";
	}
	@RequestMapping("/injection")
	public String injection() {
		return "injection";
	}
	@RequestMapping("/spoofing")
	public String spoofing() {
		return "spoofing";
	}
	@RequestMapping("/crypthographic")
	public String crypthographic() {
		return "crypthographic";
	}
	@RequestMapping("/enviromental")
	public String enviromental() {
		return "enviromental";
	}
	@RequestMapping("/input")
	public String input() {
		return "input";
	}
	
}
