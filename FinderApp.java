package fall2020Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.cucumber.datatable.DataTable;

public class FinderApp {
private List<Home> homes;

	
	public FinderApp(DataTable dataTable) {
		this.homes = new ArrayList<Home>();
		List<String> list = dataTable.asList();
		
		for (int i = 0; i < list.size(); i+=2) {
			List<String> specs = Arrays.asList(list.get(i).split("_"));
			HomeType type = new HomeType(specs.get(0));
			HomeMaterial material = new HomeMaterial(specs.get(1));
			HomePlacement placemnt = new HomePlacement(specs.get(2));
			HomePets pets = new HomePets(specs.get(3));
			HomeAmenities amenities = new HomeAmenities(Arrays.asList(specs.get(4).split(",")));
			List<String> numericData = Arrays.asList(list.get(i+1).split("_"));
			int price = Integer.parseInt(numericData.get(0));
			int area = Integer.parseInt(numericData.get(1));
			int number_of_bedrooms = Integer.parseInt(numericData.get(2));
			int number_of_bathrooms = Integer.parseInt(numericData.get(3));
			int lease_length = Integer.parseInt(numericData.get(4));
			
			
			Home home = new Home(i, type, material, placemnt, pets, amenities, price, area, number_of_bedrooms, number_of_bathrooms, lease_length);
			homes.add(home);
		}
	}
	
	public void printHomes() {
		for (int i = 0; i < homes.size(); i++) {
			System.out.println(homes.get(i).toString());
		}
	}
	
	public List<Home> byType(String type){
		List<Home> result = new ArrayList<Home>();
		for (int i = 0; i < homes.size(); i++) {
			if(type.equals(homes.get(i).getType().toString())) {
				result.add(homes.get(i));
			}
		}
		return result;
	}
	
	public List<Home> byMaterial(String material){
		List<Home> result = new ArrayList<Home>();
		for (int i = 0; i < homes.size(); i++) {
			if(material.equals(homes.get(i).getMaterial().toString())) {
				result.add(homes.get(i));
			}
		}
		return result;
	}
	
	public List<Home> byPlacement(String placement){
		List<Home> result = new ArrayList<Home>();
		for (int i = 0; i < homes.size(); i++) {
			if(placement.equals(homes.get(i).getPlacement().toString())) {
				result.add(homes.get(i));
			}
		}
		return result;
	}
	
	public List<Home> byAmenities(String amenity){
		List<Home> result = new ArrayList<Home>();
		for (int i = 0; i < homes.size(); i++) {
			if(homes.get(i).getAmenities().getAmenities().contains(amenity)) {
				result.add(homes.get(i));
			}
		}
		return result;
	}

	public List<Home> byPets(String pets){
		List<Home> result = new ArrayList<Home>();
		for (int i = 0; i < homes.size(); i++) {
			if(pets.equals(homes.get(i).getPets().toString())) {
				result.add(homes.get(i));
			}
		}
		return result;
	}
	
	
	

	public List<Home> byPrice(Integer price){
		List<Home> result = new ArrayList<Home>();
		for (int i = 0; i < homes.size(); i++) {
			if(homes.get(i).getPrice() < 400|| homes.get(i).getPrice() <= 500){
				result.add(homes.get(i));
			}
		}
		return result;
	}

	public List<Home> byArea(Integer Area) {
		List<Home> result = new ArrayList<Home>();
		for (int i = 0; i < homes.size(); i++) {
			if(homes.get(i).getArea() < 200|| homes.get(i).getArea() <= 300) {
				result.add(homes.get(i));
			}
		}
		return result;
	}

	public List<Home> byBedRoom(Integer bed) {
		List<Home> result = new ArrayList<Home>();
		for (int i = 0; i < homes.size(); i++) {
			if(homes.get(i).getNumber_of_bedrooms() <= 5) {
				result.add(homes.get(i));
			}
		}
		return result;
	}

	public List<Home> byBathRoom(Integer bath) {
		List<Home> result = new ArrayList<Home>();
		for (int i = 0; i < homes.size(); i++) {
			if(homes.get(i).getNumber_of_bathrooms() <= 3) {
				result.add(homes.get(i));
			}
		}
		return result;
	}
	//getLease_length
	public List<Home> ByLease(Integer lease) {
		List<Home> result = new ArrayList<Home>();
		for (int i = 0; i < homes.size(); i++) {
			if(homes.get(i).getLease_length() <= 6|| homes.get(i).getLease_length() <= 12) {
				result.add(homes.get(i));
			}
		}
		return result;
	
}


}