package activity12;

public class City extends KeyedItem<String>{

	String country;
	
	public City(String key, String cityCountry) {
		super(key);
		country = cityCountry;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String toString() {
		return this.getKey() + ", " + this.getCountry();
	}
}
