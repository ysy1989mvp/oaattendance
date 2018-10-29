package com.slkj.autocode.util;

public class AutoCodeStringUtil {
	/**
	 * 首字母变成大写
	 * @param s
	 * @return
	 */
	public static String strUpp(String s){  
		char[] ca = s.toCharArray();
		String string = "";
		if(ca[0]>='a' && ca[0]<='z'){
			ca[0] = (char)((int)ca[0]-32);
		}
		for(int i=0;i<ca.length;i++){
			string += ca[i];
		}
		return string;
 
	}  
	/**
	 * 首字母变成小写
	 * @param s
	 * @return
	 */
	public static String strDown(String s){  
		char[] ca = s.toCharArray();
		String string = "";
		if(ca[0]>='A' && ca[0]<='Z'){
			ca[0] = (char)((int)ca[0]+32);
		}
		for(int i=0;i<ca.length;i++){
			string += ca[i];
		}
		return string;
 
	}  
}
