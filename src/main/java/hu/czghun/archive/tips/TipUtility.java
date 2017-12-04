package hu.czghun.archive.tips;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TipUtility {

	List<String> list=new ArrayList();
	
	public TipUtility() {
		list.add("Always keep your software up to date!");
		list.add("Be careful with how much information you give away in your error messages.");
		list.add("Validation should always be done both on the browser and server side.");
		list.add("Everyone knows they should use complex passwords, but that doesn’t mean they always do.");
		
	}
	
	public String getRandomTip() {
		Random r=new Random();
		int randInt=r.nextInt(list.size());
		return list.get(randInt);
	}
}
