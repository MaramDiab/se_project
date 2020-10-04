package fall2020Project;

import java.util.List;
public class HomeAmenities {
	private static List<String> allAmenities = List.of("AIRCONDITIONING", "BALCONY", "GARAGEPARKING", "FIREPLACE" , "ELEVATOR", "SWIMMINGPOOL");
	private List<String> amenities;
	
	public HomeAmenities(List<String> amenities) {
		this.amenities = amenities;
	}
	
	@Override
	public String toString() {
		return this.amenities.toString();
	}
	
	public List<String> getAmenities() {
		return amenities;
	}

	public void setAmenities(List<String> amenities) {
		this.amenities = amenities;
	}
	
	public static boolean isHomeAmenity(String spec) {
		return allAmenities.contains(spec);
	}
	
}
