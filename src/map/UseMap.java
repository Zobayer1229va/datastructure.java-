package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class UseMap {

	Map<String, String> thisMap = new HashMap<String, String>(); 
	 
 	//Implement a method which can add data into a Map 
 	public void addElementByMap(String key, String data) { 
 		thisMap.put(key, data); 
 	} 
 	 
 	//get the map 
 	public Map<String, String> getCompleteMap() { 
 		return this.thisMap; 
 	} 
 	 
 	/*Implement a method that can retrieve data from a Map and it will return data containing in a Map 
 	 * Use while loop to iterate through 
	 */ 
 	 
 	public Map<String, String> getDataByMap(Map<String,String> map){ 
 		Map<String, String> mapData = new HashMap<String,String>(); 
 		for ( Entry<String, String> entry : map.entrySet() ) { 
 			mapData.put(entry.getKey(),entry.getValue()); 
 		} 
 		return mapData; 
 	} 
	 
//Implement a method that can retrieve data from a Map contains List and it will return data containing in a Map 
// Use for loop to iterate through 
 
 		 
 	public Map<String, List<String>> getDataByMapList(Map<String,List<String>> list){ 
 		Map<String, List<String>> listData = new LinkedHashMap<String,List<String>>(); 
 		for ( Entry<String, List<String>> entry : list.entrySet() ) { 
 			listData.put(entry.getKey(),entry.getValue()); 
 		} 
 		return listData; 


}
}
