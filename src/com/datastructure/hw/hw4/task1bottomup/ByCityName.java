package task1bottomup;

import java.util.Comparator;

public class ByCityName implements Comparator<IPADDRESS>{

	@Override
	public int compare(IPADDRESS a, IPADDRESS b) {
		
		return a.cityName.compareTo(b.cityName);
	}

}
