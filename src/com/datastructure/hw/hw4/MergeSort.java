package task1bottomup;

import task1recursive.CommonMethods;

public class MergeSort extends CommonMethods {
	
	@SuppressWarnings("rawtypes")
	public static void sort(Comparable [] array) {
		Comparable[] aux=new Comparable[array.length];
		for (int size=1;size<array.length;size*=2) {
			for (int low=0;low<array.length-size;low+=2*size) {
				int mid=low+size-1;
				int high=Math.min(low+2*size-1,array.length-1);
				merge(array,aux,low,mid,high);
			}
		}
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static void merge(Comparable [] array,Comparable [] aux,int low, int mid, int high) {
		for (int k=low;k<=high;k++) {
			aux[k]=array[k];
		}
		long i= low;
		long j= mid+1;
		
		for(int k= low;k<=high;k++) {
			
			if (i>mid) {
				array[k]=aux[(int) j++];
			}
			else if (j>high) {
				 array[k]=aux[(int) i++];
			} 
			else if (aux[(int) j].compareTo(aux[(int) i])<0) {
				array[k]=aux[(int) j++];
			}
			else {
				array[k]=aux[(int) i++];
			}
			
		}  
		
	} 
	
	
}
