/**
 * Project Name:test
 * File Name:TestTime.java
 * Package Name:时间格式
 * Date:2016年5月12日上午9:35:35
 *
*/

package 时间格式;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ClassName:TestTime 
 * Function: TODO ADD FUNCTION. 
 * Reason:	 TODO ADD REASON. 
 * Date:     2016年5月12日 上午9:35:35 
 * @author   "jia"
 * @version  
 * @see 	 
 */
public class TestTime {
	public static void main(String[] args) throws ParseException {
		// 字符串转换成时间
		String strT = "2015-04-02 12:10:05";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		date = sdf.parse(strT);
		System.out.println(sdf.format(date));
	}
}

