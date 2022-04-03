package ipaddress;

public class IPAdress implements Comparable<IPAdress>{

	long ipFrom;
	long ipTo;
	String countryCode;
	String countryName;
	String regionName;
	String cityName;
	

	
	public IPAdress(long ipFrom, long ipTo, 
		String countryCode, 
		String countryName, 
		String regionName,
		String cityName) {
		
		this.ipFrom = ipFrom;
		this.ipTo = ipTo;
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.regionName = regionName;
		this.cityName = cityName;
	}




	@Override
	public int compareTo(IPAdress that) {
		
		if (this.ipFrom>that.ipFrom) {
			return 1;
		}
		else if (this.ipFrom<that.ipFrom) {
			return -1;
		}
		else {
			return 0;
		}
		
		
	}




	@Override
	public String toString() {
		return "\""+ipFrom+"\"," + "\""+ipTo +"\"," + "\""+countryCode+"\"," 
				+ "\""+countryName+"\"," +  "\""+regionName+"\"," +   "\""+cityName+"\"";
	}




	public long getIpFrom() {
		return ipFrom;
	}





	public long getIpTo() {
		return ipTo;
	}




	public String getCountryName() {
		return countryName;
	}




	public String getCountryCode() {
		return countryCode;
	}




	public String getRegionName() {
		return regionName;
	}




	public String getCityName() {
		return cityName;
	}





}
