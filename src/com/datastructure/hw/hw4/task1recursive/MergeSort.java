package task1recursive;

public class MergeSort extends CommonMethods{

	@SuppressWarnings("rawtypes")
	public static void sort(Comparable [] array) {
		Comparable[] aux= new Comparable [array.length];
		sort(array,aux,0,array.length-1);
	}
	@SuppressWarnings("rawtypes")
	private static void sort(Comparable [] array, Comparable [] aux, int low, int high) {
		if (high<=low) {
			return;
		}
		int mid=low+(high-low) /2;
		sort(array,aux,low,mid);
		sort(array,aux,mid+1,high);
		merge(array,aux,low,mid,high);
	}
	@SuppressWarnings({ "rawtypes", "unchecked"})
	private static void merge(Comparable [] array,Comparable [] aux,int low,int mid,int high) {
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
