package com.chainsys.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
	public void calc() {
		Pattern p=Pattern.compile("...com.");
		Matcher m=p.matcher("abccoms");
		
		boolean res=m.matches();
		System.out.println(res);
		
	}

}
