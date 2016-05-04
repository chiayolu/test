/**
 * Project Name:test
 * File Name:Isbirthday.java
 * Package Name:
 * Date:2016年5月4日上午10:15:01
 *
*/
package 生日;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.time.DateUtils;


/**
 * ClassName:Isbirthday 
 * Function: TODO ADD FUNCTION. 
 * Reason:	 TODO ADD REASON. 
 * Date:     2016年5月4日 上午10:15:01 
 * @author   "jia"
 * @version  
 * @see 	 
 */
public class Isbirthday {

	private boolean isBirthdayInvest(Date gDate) {
		Calendar nowCal = Calendar.getInstance();
		nowCal.setTime(gDate);
		nowCal.set(Calendar.HOUR_OF_DAY, 0);
		nowCal.set(Calendar.MINUTE, 0);
		nowCal.set(Calendar.SECOND, 0);

		Calendar birthdayCal = Calendar.getInstance();
		
		String pattern = "yyy-MM-dd HH:mm:ss"; //首先定义时间格式
		SimpleDateFormat format = new SimpleDateFormat(pattern);//然后创建一个日期格式化类
		String toConvertString = "1980-05-08 12:10:20";
		Date birthdayTime = null;
		try {
			birthdayTime = format.parse(toConvertString);
		} catch (ParseException e) {
		e.printStackTrace();
		}
		birthdayCal.setTime(birthdayTime);
		birthdayCal.set(Calendar.YEAR, nowCal.get(Calendar.YEAR));
		birthdayTime = birthdayCal.getTime();

		// 是否是生日当前投资
		if (DateUtils.isSameDay(nowCal, birthdayCal)) {
			return true;
		}
		// 判断是否在生日所在周
		else {
			String birthday_status = "1";
			if (birthday_status.equals("1")) {

				int dayWeek = nowCal.get(Calendar.DAY_OF_WEEK);
				if (1 == dayWeek) {
					nowCal.add(Calendar.DAY_OF_MONTH, -1);
				}
				nowCal.setFirstDayOfWeek(Calendar.MONDAY);
				int day = nowCal.get(Calendar.DAY_OF_WEEK);
				nowCal.add(Calendar.DATE, nowCal.getFirstDayOfWeek() - day);
				Date beginTime = nowCal.getTime();
				nowCal.add(Calendar.DATE, 7);
				Date endTime = nowCal.getTime();
				if (DateUtils.isSameDay(birthdayTime, beginTime)) {
					return true;
				} else {
					if (birthdayTime.after(beginTime) && birthdayTime.before(endTime)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Isbirthday ib = new Isbirthday();
		String pattern = "yyy-MM-dd HH:mm:ss"; //首先定义时间格式
		SimpleDateFormat format = new SimpleDateFormat(pattern);//然后创建一个日期格式化类
		String toConvertString = "2016-05-03 12:10:20";
		Date convertResult = null;
		try {
		convertResult = format.parse(toConvertString);
		} catch (ParseException e) {
		e.printStackTrace();
		}
		System.out.println(ib.isBirthdayInvest(convertResult));
	}
}

