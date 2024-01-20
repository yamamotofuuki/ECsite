package com.diworksdev.ecsite.util;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日付関連の操作を扱うユーティリティクラス
 */
public class DateUtil {
	
	/**
	 * フォーマットされた現在の日付と時刻を取得
	 */
	public String getDate() {
		
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	
		
		return simpleDateFormat.format(date);
		
	}
	
}