package com.slkj.autocode.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtils {
	public static final String FORMAT_YMD_HMS="yyyy-MM-dd hh:mm:ss";

	public static String formateDateToStr(Date date, String formatYmdHms) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatYmdHms);
		String dateStr = simpleDateFormat.format(date);
		return dateStr;
	}
	public static String formateDateToStr(Date date) {
		String formatYmdHms = FORMAT_YMD_HMS;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatYmdHms);
		String dateStr = simpleDateFormat.format(date);
		return dateStr;
	}
}
