package com.apps.na.handson;

import java.util.HashMap;
import java.util.Map;

public class CountOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "malayalam";
	      Map<Character,Integer> ch = new HashMap();
	      for(int i=0;i<str.length();i++)
	      {
	    	  if(ch.containsKey(str.charAt(i)))
	    	  {
	    		  int count = ch.get(str.charAt(i));
	    		  ch.put(str.charAt(i),++count);
	    		  
	    	  }
	    	  else {
	    		  ch.put(str.charAt(i),1);
	    	  }
	      }
	      System.out.println(ch);
	}

}
