package task2;

import ipaddress.IPAdress;

public class BinarySearch {

	public static String search(IPAdress [] array, long key) {
		
		int low=0;
		int high=array.length-1;
		
		while (low<=high) {
			int mid=low + (high-low)/2;
			
			if (key < array[mid].getIpFrom() ) {
				high=mid-1;
				
			}
			else if ( key > array[mid].getIpTo()) {
				low=low+1;
			}
		 else if (key > array[mid].getIpFrom() && key < array[mid].getIpTo()){
			return array[mid].getCountryCode()+","+array[mid].getCountryName()+","+array[mid].getRegionName()+","+array[mid].getCityName();
		}
		 else {
			 return array[mid].getCountryCode()+","+array[mid].getCountryName()+","+array[mid].getRegionName()+","+array[mid].getCityName();
		 }
		
	
	
}
		return "not found";
	}
}
