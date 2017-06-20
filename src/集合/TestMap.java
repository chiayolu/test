/**
 * Project Name:test
 * File Name:TestMao.java
 * Package Name:集合
 * Date:2016年5月16日上午9:10:56
 *
*/

package 集合;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * ClassName:TestMao 
 * Function: TODO ADD FUNCTION. 
 * Reason:	 TODO ADD REASON. 
 * Date:     2016年5月16日 上午9:10:56 
 * @author   "jia"
 * @version  
 * @see 	 
 */
public class TestMap {
	public static void main(String[] args) throws FileNotFoundException {
		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < 10; i++) {
			map.put(String.valueOf(i), String.valueOf((char)'a'+i));
		}
		System.out.println(map.toString() + "\n\n\n");
		
		// map遍历的三种方式
		// 方式一	效率高
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>)it.next();
			System.out.println(entry.getKey() + entry.getValue() + "  ");
		}
		System.out.println();
		
		// 方式二 效率低
		Iterator it2 = map.keySet().iterator();
		while (it2.hasNext()) {
			String key = (String)it2.next();
			String value = map.get(key);
			System.out.println(key + value);
		}
		
		System.out.println();
		
		// 方式三 
		Collection c = map.values();
		Iterator it3 = c.iterator();
		while (it3.hasNext()) {
			System.out.println(it3.next());
		}
		

		Reader a = new FileReader("");
		InputStream d = new FileInputStream("");
	}
}

