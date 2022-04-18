package quicksort;

import java.util.Random;

public class QuickSort extends CommonMethods{
	
	@SuppressWarnings("rawtypes")
	public static void sort(Comparable [] array) {
		shuffle(array);
		sort(array,0,array.length-1);
	}
	@SuppressWarnings({ "rawtypes"})
	private static void shuffle (Comparable [] array) {
		Random random=new Random();
		for (int i=0;i<array.length;i++) {
			long r=i+random.nextInt(array.length-i);
			swap(array,i,r);
		}
	}
	@SuppressWarnings("rawtypes")
	private static void sort(Comparable [] array, long low,long high) {
		if (high<=low) {
			return;
		}
		long j=partition(array,low,high);
		sort(array,low,j-1);
		sort(array,j+1,high);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static int partition(Comparable [] array,long low, long high) {
		long i=low;
		long j=high+1;
		while (true) {
			
			while (array[(int) ++i].compareTo(array[(int) low])<0) {
				if (i==high) {
					break;
				}
			}
			
			while (array[(int) low].compareTo(array[(int) --j])<0) {
				if (j==low) {
					break;
				}
			}
			
			if (i>=j) {
				break;
			}
			swap(array,i,j);
			
		}
		swap(array,low,j);
		
		return (int) j;
		
	}
	
}
