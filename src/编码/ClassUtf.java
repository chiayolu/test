/**
 * Project Name:test
 * File Name:ClassUtf.java
 * Package Name:编码
 * Date:2016年3月28日下午2:30:19
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/

package 编码;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * ClassName:ClassUtf 
 * Function: TODO ADD FUNCTION. 
 * Reason:	 TODO ADD REASON. 
 * Date:     2016年3月28日 下午2:30:19 
 * @author   "jia"
 * @version  
 * @see 	 
 */
public class ClassUtf {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "%E5%95%8A%E5%95%8A";
//		try {
////			System.out.println(URLDecoder.decode(StringUtils.trimToEmpty(str), "utf-8"));
//		} catch (UnsupportedEncodingException e) {
//			
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			
//		}
		try {
			System.out.println(URLEncoder.encode("火狐", "utf-8"));
		} catch (UnsupportedEncodingException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss.SSS");
		System.out.println(sdf.format(new Date()));
		
		byte[] UTF_BOM = new byte[]{(byte) 0xEF,(byte) 0xBB,(byte) 0xBF};
		System.out.println(URLDecoder.decode("0xEF", "utf-8"));
		
		System.out.println("输出到github");
	}
}

