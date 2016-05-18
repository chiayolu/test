/**
 * Project Name:test
 * File Name:TestJSON.java
 * Package Name:json处理
 * Date:2016年5月16日上午11:59:39
 *
*/

package json处理;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

/**
 * ClassName:TestJSON 
 * Function: TODO ADD FUNCTION. 
 * Reason:	 TODO ADD REASON. 
 * Date:     2016年5月16日 上午11:59:39 
 * @author   "jia"
 * @version  
 * @see 	 
 */
public class TestJSON {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("aa", "11");
		map.put("bb", "22");
		JSONObject jo = new JSONObject(map);
		System.out.println(jo.toString());
	}
	 
}

