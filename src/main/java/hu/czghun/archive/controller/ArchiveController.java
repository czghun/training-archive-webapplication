package hu.czghun.archive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArchiveController {

	@RequestMapping("/")
	public String mainPage() {
		return "index";
	}
	
}
