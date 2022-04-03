package ipaddress;

public class BubbleSort {
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void sort(Comparable [] array) {
		
		for (int i=0;i<array.length;i++) {
			for (int j=1;j<array.length-i;j++) {
				if (array[j-1].compareTo(array[j])>0) {
					swap(array,j-1,j);
					
				}
			}
		}
		
		
	}
	@SuppressWarnings("rawtypes")
	public static void swap(Comparable [] array, long a , long b) {
		Comparable temp=array[(int) a];
		array[(int) a]=array[(int) b];
		array[(int) b]=temp;
	}

}
