package sorting;

public class SortingAlgorithem {
	// Selection Sort 
	 	public int[] selectionSort(int[] list) { 
	 		for (int i = 0; i < list.length; i++) { 
	 			for (int j = i + 1; j < list.length; j++) { 
					if (list[i] > list[j]) { 
	 					int temp = list[i]; 
	 					list[i] = list[j]; 
	 					list[j] = temp; 
	 				} 
	 			} 
	 		} 
	 		return list; 
	 	} 
	 
	 
	 	// Insertion Sort 
	 	public int[] insertionSort(int[] array) { 
	 		int i,j; 
	 		for(i=1;i<array.length;i++) 
	 		{ 
	 			int temp = array[i]; 
	 			for( j = i-1;temp<array[j]&&j>=0;j--) 
	 			{ 
	 				array[j+1]=array[j]; 
	 				 
	 			} 
	 			array[j+1]=temp; 
	 			 
	 		} 
	 		return array; 
	 	} 
	 
	 
	 	// Bubble Sort 
	 	public int[] bubbleSort(int[] array) { 
	 
	 
	 		for (int i = 0; i < array.length - 1; i++) { 
	 			for (int j = 0; j < array.length - i - 1; j++) { 
	 				if (array[i] > array[i + 1]) { 
	 					int tmp = array[i]; 
	 					array[i] = array[i + 1]; 
	 					array[i + 1] = tmp; 
	 				} 
	 			} 
	 		} 
	 
	 
	 		return array; 
	 	} 
	 
	 
	 	// Merge Sort 
	 	public int[] mergeSort(int[] array) { 
	 		int[] aux = new int[array.length]; 
	 		for (int i = 1; i < array.length; i *= 2) 
	 			for (int j = 0; j < array.length; j += 2 * i) 
	 				merge(array, aux, j, j + i, j + 2 * i); 
	 
	 
	 		return array; 
	 	} 
	 
	 
	 	// Merge Method for merge sorting 
	 	void merge(int[] a, int[] aux, int lo, int mid, int hi) { 
	 
	 
	 		if (mid >= a.length) 
	 			return; 
	 		if (hi > a.length) 
	 			hi = a.length; 
	 		int i = lo, j = mid; 
	 		for (int k = lo; k < hi; k++) { 
	 			if (i == mid) 
	 				aux[k] = a[j++]; 
	 			else if (j == hi) 
	 				aux[k] = a[i++]; 
	 			else if (a[j] < a[i]) 
	 				aux[k] = a[j++]; 
	 			else 
	 				aux[k] = a[i++]; 
	 		} 
			// copy back 
	 		for (int k = lo; k < hi; k++) 
	 			a[k] = aux[k]; 
	 	} 


}
