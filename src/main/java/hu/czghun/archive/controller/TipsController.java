package hu.czghun.archive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import hu.czghun.archive.tips.TipUtility;

@Controller
public class TipsController {

	
	
	
	@RequestMapping("/tip")
	public String index(Model model) {
		
		TipUtility tipu=new TipUtility();
		String tip=tipu.getRandomTip();
		model.addAttribute("tip", tip);
		
		return "index";
	}
	
}
