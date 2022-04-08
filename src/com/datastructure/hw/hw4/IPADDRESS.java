package task1bottomup;



public class IPADDRESS implements Comparable<IPADDRESS>{
	long ipFrom;
	long ipTo;
	String countryCode;
	String countryName;
	String regionName;
	String cityName;
	
	
	public IPADDRESS(long ipFrom, long ipTo, String countryCode, String countryName, String regionName,
			String cityName) {
		super();
		this.ipFrom = ipFrom;
		this.ipTo = ipTo;
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.regionName = regionName;
		this.cityName = cityName;
	}


	@Override
	public String toString() {
		return "\""+ipFrom+"\"," + "\""+ipTo +"\"," + "\""+countryCode+"\"," 
				+ "\""+countryName+"\"," +  "\""+regionName+"\"," +   "\""+cityName+"\"";
	}
	
	public long getIpFrom() {
		return ipFrom;
	}


	@Override
	public int compareTo(IPADDRESS that) {
		
		if (this.ipFrom>that.ipFrom) {
			return 1;
		}
		else if (this.ipFrom<that.ipFrom) {
			return -1;
		}
		else  {
			return 0;
		}
} 
}
