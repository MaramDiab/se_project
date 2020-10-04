package fall2020Project;

import java.util.List;

import java.util.List;

public class Home {
	private int id;
	private HomeType type;
	private HomeMaterial material;
	private HomePlacement placement;
	private HomePets pets;
	private HomeAmenities amenities;
	private int price;
	private int area;
	private int number_of_bedrooms;
	private int number_of_bathrooms;
	private int lease_length;
	
	public Home(int id, HomeType type, HomeMaterial material, HomePlacement placement, HomePets pets, 
			HomeAmenities amenities,int price, int area, int number_of_bedrooms, int number_of_bathrooms, int lease_length) {
		this.id = id;
		this.type = type;
		this.material = material;
		this.placement = placement;
		this.pets = pets;
		this.amenities = amenities;
		this.price = price;
		this.area = area;
		this.number_of_bedrooms = number_of_bedrooms;
		this.number_of_bathrooms = number_of_bathrooms;
		this.lease_length = lease_length;
	}
	
	@Override
	public String toString() {
		return "Home [id= " + id + ", type= " + type.toString() + ", material = " + material.toString() + ", placement= " + placement.toString() + 
				", pets= " + pets.toString() + ", amenities= " + amenities.toString() + ", price= " + price +", area= " + area + 
				", number_of_bedrooms= " + number_of_bedrooms + ", number_of_bathrooms= " + number_of_bathrooms + 
				", lease_length= " + lease_length + "]";
	}

	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public HomePlacement getPlacement() {
		return placement;
	}

	public void setPlacement(HomePlacement placement) {
		this.placement = placement;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getNumber_of_bedrooms() {
		return number_of_bedrooms;
	}

	public void setNumber_of_bedrooms(int number_of_bedrooms) {
		this.number_of_bedrooms = number_of_bedrooms;
	}

	public int getNumber_of_bathrooms() {
		return number_of_bathrooms;
	}

	public void setNumber_of_bathrooms(int number_of_bathrooms) {
		this.number_of_bathrooms = number_of_bathrooms;
	}

	public int getLease_length() {
		return lease_length;
	}

	public void setLease_length(int lease_length) {
		this.lease_length = lease_length;
	}
	
	public HomeType getType() {
		return type;
	}

	public void setType(HomeType type) {
		this.type = type;
	}

	public HomeMaterial getMaterial() {
		return material;
	}

	public void setMaterial(HomeMaterial material) {
		this.material = material;
	}

	public HomePets getPets() {
		return pets;
	}

	public void setPets(HomePets pets) {
		this.pets = pets;
	}

	public HomeAmenities getAmenities() {
		return amenities;
	}

	public void setAmenities(HomeAmenities amenities) {
		this.amenities = amenities;
	}


}

