package com.slkj.autocode.util;

public class StringUtils {

	public static boolean isNotBlank(String token) {
		if(token==null||"".equals(token.trim())){
			return false;
		}else if(token==null){
			return false;
		}else{
			return true;
		}
	}
	
	public static boolean isBlank(String token) {
		if("".equals(token.trim())){
			return true;
		}else if(token==null){
			return true;
		}else{
			return false;
		}
	}

}
