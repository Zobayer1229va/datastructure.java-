package sorting;

public class ApplySorting {

	public static void main(String[] args) { 
		 		/* 
		 		 * Use the available sorting methods in SortingALgo() class to sort the below array of numbers. 
		 		 */ 
				 
		 		int [] array = new int[]{34,45,23,12,67,89,34,56,78,90,3,8,35,2,61,4,9,1,20,7}; 
		 		 
		 		System.out.println("Output of Selection Sorting..\n"); 
		 		 
		 		SortingAlgorithem sobj=new SortingAlgorithem(); 
		 		int[] selection_sortarray =sobj.selectionSort(array); 
		 		for(int i=0;i<selection_sortarray.length;i++) 
		 		{ 
		 			System.out.print(" "+selection_sortarray[i]); 
		 		} 
		 		 
		 		System.out.println("\nOutput of Bubble Sorting..\n"); 
		 		 
		 		SortingAlgorithem bobj=new SortingAlgorithem(); 
		 				int[] bubble_sortarray =bobj.bubbleSort(array); 
		 				for(int i=0;i<bubble_sortarray.length;i++) 
		 				{ 
		 					System.out.print(" "+bubble_sortarray[i]); 
		 				} 
		 				 
		 				System.out.println("\nOutput of Merge Sorting..\n"); 
		 				 
		 				SortingAlgorithem mobj=new SortingAlgorithem(); 
		 				int[] merge_sortarray = mobj.mergeSort(array); 
		 				for(int i=0;i<merge_sortarray.length;i++) 
		 				{ 
		 					System.out.print(" "+merge_sortarray[i]); 
		 				} 
		 				 
		 				System.out.println("\nOutput of Insertion Sorting..\n"); 
		 				 
		 				SortingAlgorithem iobj=new SortingAlgorithem(); 
		 				int[] insert_sortarray = iobj.insertionSort(array); 
		 				for(int i=0;i<insert_sortarray.length;i++) 
		 				{ 
		 					System.out.print(" "+insert_sortarray[i]); 
		 				} 

	}

}
