package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ApplyMap {
	public static void main(String[] args) { 
 		
		 //map() can be utilize here. 

		 
	UseMap useMap = new UseMap(); 
		useMap.addElementByMap("Bangladesh", "Dhaka"); 
		useMap.addElementByMap("USA", "Washington"); 
		useMap.addElementByMap("England", "London"); 
		 
		Map<String, String> myMap = new HashMap<String, String>(); 
		myMap = useMap.getCompleteMap(); 
		 
		for ( Entry<String, String> entry : myMap.entrySet() ) { 
			System.out.println("Key: " + entry.getKey() + ",     Value: " + entry.getValue()); 
		} 
		System.out.println(); 
		 
		Map<String, String> myNewMap = new HashMap<String, String>(); 
		myNewMap.put("AA", "AAAA"); 
		myNewMap.put("BB", "BBBB"); 
		myNewMap.put("CC", "CCCC"); 
		 
		myMap = useMap.getDataByMap(myNewMap); 
		for ( Entry<String, String> entry : myMap.entrySet() ) { 
			System.out.println("Key: " + entry.getKey() + ",     Value: " + entry.getValue()); 
		} 
		System.out.println(); 
		 
		List<String> listOfFruits = new ArrayList<String>(); 
		listOfFruits.add("Mango"); 
		listOfFruits.add("Apple"); 
		listOfFruits.add("Orange"); 
		 
		List<String> listOfAnimal = new ArrayList<String>(); 
		listOfAnimal.add("Panda"); 
		listOfAnimal.add("Bear"); 
		listOfAnimal.add("Rhinoceros"); 
		listOfAnimal.add("Zebra"); 
		 
		List<String> listOfBird = new ArrayList<String>(); 
		listOfBird.add("Flamingo"); 
		listOfBird.add("Parrot"); 
		listOfBird.add("Doves"); 
		listOfBird.add("Herons"); 
		 
		Map<String, List<String>> listMap = new LinkedHashMap<String,List<String>>(); 
		listMap.put("Fruits", listOfFruits); 
		listMap.put("Animals", listOfAnimal); 
		listMap.put("Bird", listOfBird); 
		 
		Map<String, List<String>> retMap = new LinkedHashMap<String,List<String>>(); 
		retMap = useMap.getDataByMapList(listMap); 
		for(Entry<String, List<String>> entry: retMap.entrySet()){ 
		System.out.println(entry.getKey()+" : "+ entry.getValue()); 


}
}

}
