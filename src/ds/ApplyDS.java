package ds;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ApplyDS {
	public static void main(String[] args) { 
 		/* 
 		 * UseStructure can be applied here to demonstrate how to add and retrieve. 
 		 *  
 		 */ 
 		 
 		UseStructure structure = new UseStructure(); 
 		structure.arrayList = new ArrayList<String>(); 
 		 
 		structure.addByArrayList("Array element Bangladesh"); 
 		structure.addByArrayList("Array element USA"); 
 		structure.addByArrayList("Array element Canada"); 
 
 
 		String element = "Array element England"; 
 		ArrayList<String> array = new ArrayList<String>(); 
 		array = structure.returnByArrayList(element); 
 		for (String str : array) { 
 			System.out.println("Next element: " + str); 
 		} 
 		System.out.println(); 
 		 
 		structure.list = new LinkedList<String>(); 
 		 
 		structure.addByLinkedList("Array element Dhaka"); 
 		structure.addByLinkedList("Array element Wasington"); 
 		structure.addByLinkedList("Array element Ottawa"); 
 
 
 		element = "Array element London"; 
 		LinkedList<String> list = new LinkedList<String>(); 
 		list = structure.returnByLinkedList(element); 
 		for (String str : list) { 
 			System.out.println("Next element: " + str); 
 		} 
 		System.out.println(); 
 		 
 		structure.stack = new Stack<String>(); 
 		 
 		structure.addByStack("Array element Zara"); 
 		structure.addByStack("Array element Zarif"); 
 		structure.addByStack("Array element Popy"); 
 
 
 		element = "Array element Pony"; 
 		Stack<String> stack = new Stack<String>(); 
 		stack = structure.returnByStack(element); 
 		while ( !stack.isEmpty() ) { 
 			System.out.println("Next popped: " + stack.pop()); 
 		} 
 		System.out.println(); 
 		 
 		structure.queue = new LinkedList<String>(); 
 		 
 		structure.addByQueue("Array element Apple"); 
 		structure.addByQueue("Array element Mango"); 
 		structure.addByQueue("Array element Banana"); 
 
 
 		element = "Array element Orange"; 
 		Queue<String> queue = new LinkedList<String>(); 
 		queue = structure.returnByQueue(element); 
 		while ( !queue.isEmpty() ) { 
 			System.out.println("Next polled: " + queue.poll()); 
 		} 
 		 
 	} 
 


}
