package quicksort;

public abstract class CommonMethods {
	
	@SuppressWarnings("rawtypes")
	public static void swap(Comparable [] array,long i, long r) {
		Comparable temp=array[(int) i];
		array[(int) i]=array[(int) r];
		array[(int) r]=temp;
	}

}
