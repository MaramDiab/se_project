package acceptance_tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.font.NumericShaper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.junit.runner.RunWith;


import fall2020Project.FinderApp;
import fall2020Project.Home;
import fall2020Project.HomeAmenities;
import fall2020Project.HomeMaterial;
import fall2020Project.HomePets;
import fall2020Project.HomePlacement;
import fall2020Project.HomeType;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

public class  SearchHomeSteps {

	private FinderApp finder;
	private List<Home> byPlacementList; 
	private List<Home> byTypeList;
	private List<Home> byMaterialList;
	private List<Home> byAmenityList;
	private List<Home> byPriceList;
	private List<Home> byAreaList;
	private List<Home> byBedList;
	private List<Home> byBathList;
	private List<Home> byLeaseList;
	private List<Home> byPetsList;
	
	private String spec;
	private String pet;

	private int price;
	private int lease;
	private int area; 
	private int bed;

	private int bath;



/*







	
 
}



*/
	
	
	
	@Given("these homes are contained in the system")
	public void theseHomesAreContainedInTheSystem(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		this.finder = new FinderApp(dataTable);
	 
	}



	@When("I search about home by Type {string}")
	public void iSearchAboutHomeByType(String spec) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		this.spec = spec;
		if(HomeType.isHomeType(spec)) {
		byTypeList= finder.byType(spec);
		}
		
		if(HomeMaterial.isHomeMaterial(spec)) {
			byMaterialList= finder.byMaterial(spec);
			}

		if(HomePlacement.isHomePlacement(spec)) {
			byPlacementList= finder.byPlacement(spec);
			}
		
		if(HomeAmenities.isHomeAmenity(spec)) {
			byAmenityList= finder.byAmenities(spec);
			}
		
		
		
		
	}
	@Then("A list of homes that matches the  type specification should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheTypeSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		if(spec.equals("HOUSE")) {
			Iterator<Home>itr=byTypeList.iterator();
			assertEquals("found 2 homes of type HOUSE ", 1, byTypeList.size());
			
			while(itr.hasNext()){
				assertTrue(itr.next().getType().toString().equals(spec));
			}finder.printHomes();
		}
		
		else if(spec.equals("APARTMENT")) {
			Iterator<Home>itr=byTypeList.iterator();
			assertEquals("found 2 homes of type APARTMENT ", 1, byTypeList.size());
			
			while(itr.hasNext()){
				assertTrue(itr.next().getType().toString().equals(spec));
			}finder.printHomes();
		}
		
		
		
		
		
		
	}
	

@When("I search about home by lease {int}")
public void iSearchAboutHomeByLease(Integer lease) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	
	this.lease=lease.intValue();
	byLeaseList=finder.ByLease(lease);
}



@Then("A list of homes that matches the lease length specification should be returned and printed on the console")
public void aListOfHomesThatMatchesTheLeaseLengthSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	
	assertEquals("found 2 homes ", 2, byLeaseList.size());
	Iterator<Home>itr=byLeaseList.iterator();
	while(itr.hasNext()){
		Home h= itr.next();
		assertTrue(h.getLease_length() <= lease);}finder.printHomes();
	
	
	
}
	@When("I search about home with price less than {int}")
	public void iSearchAboutHomeWithPriceLessThan(Integer price) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		price = price.intValue();
		//System.out.println(price);
		byPriceList=finder.byPrice(price);
		
	}


	

	@Then("A list of homes that matches the price specification should be returned and printed on the console")
	public void aListOfHomesThatMatchesThePriceSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		assertEquals("found 2 homes ", 1, byPriceList.size());
		Iterator<Home>itr=byPriceList.iterator();
		while(itr.hasNext()){
			Home h= itr.next();
			assertTrue(price <h.getPrice());
		}finder.printHomes();

		
		
	}


@When("I search about home by material {string}")
public void iSearchAboutHomeByMaterial(String spec) {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingExceptio);
	
	this.spec=spec;
	byMaterialList=finder.byMaterial(spec);
}




@Then("A list of homes that matches the material specification should be returned and printed on the console")
public void aListOfHomesThatMatchesTheMaterialSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	
	if(spec.equals("WOOD")) {
		Iterator<Home>itr=byMaterialList.iterator();
		assertEquals("found 2 homes of Material WOOD ", 1, byMaterialList.size());
		
		while(itr.hasNext()) {
			assertTrue(itr.next().getMaterial().toString().equals(spec));
		}finder.printHomes();
	}
	
	else if(spec.equals("BRICK")) {
		Iterator<Home>itr=byMaterialList.iterator();
		assertEquals("found 2 homes of Material BRICK", 1, byMaterialList.size());
		
		while(itr.hasNext()){
			assertTrue(itr.next().getMaterial().toString().equals(spec));
		}finder.printHomes();
	}
				 
	else if(spec.equals("STONE")) {
		Iterator<Home>itr=byMaterialList.iterator();
		assertEquals("found 2 homes of Material STONE", 1, byMaterialList.size());
		
		while(itr.hasNext()){
			assertTrue(itr.next().getMaterial().toString().equals(spec));
		}finder.printHomes();
	}	
	
	
	
	
}
	

@When("I search about home by placement {string}")
public void iSearchAboutHomeByPlacement(String Placement) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	byPlacementList=finder.byPlacement(Placement);
	this.spec=Placement;
	
	
}




@Then("A list of homes that matches the placement specification should be returned and printed on the console")
public void aListOfHomesThatMatchesThePlacementSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();

	if(spec.equals("CITY")) {
		Iterator<Home>itr=byPlacementList.iterator();
		assertEquals("found 2 homes of Placement CITY ", 1, byPlacementList.size());
		
		while(itr.hasNext()) {
			assertTrue(itr.next().getPlacement().toString().equals(spec));
		}finder.printHomes();
	}
	
	else if(spec.equals("VILLAGE")) {
		Iterator<Home>itr=byPlacementList.iterator();
		assertEquals("found 2 homes of Placement VILLAGE", 1, byPlacementList.size());
		
		while(itr.hasNext()){
			assertTrue(itr.next().getPlacement().toString().equals(spec));
		}finder.printHomes();
	}
	
	
	
	
}

@When("I search about home by Amenities {string}")
public void iSearchAboutHomeByAmenities(String spec) {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	this.spec=spec;
	byAmenityList=finder.byAmenities(spec);
	
	
	
	
}


@Then("A list of homes that matches the Amenities specification should be returned and printed on the console")
public void aListOfHomesThatMatchesTheAmenitiesSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
    // Write code here that turns the phrase above into concrete actions
    //
	//throw new io.cucumber.java.PendingException();
	
	if(spec.equals("AIRCONDITIONING")) {
		Iterator<Home>itr=byAmenityList.iterator();
		assertEquals("found 2 homes of Amenity AIRCONDITIONING ", 1, byAmenityList.size());
		
		while(itr.hasNext()) {
			assertTrue(itr.next().getAmenities().toString().equals(spec));
		}finder.printHomes();
	}
	
	else if(spec.equals("BALCONY")) {
		Iterator<Home>itr=byAmenityList.iterator();
		assertEquals("found 2 homes of Amenity BALCONY ", 1, byAmenityList.size());
		
		while(itr.hasNext()){
			assertTrue(itr.next().getAmenities().toString().equals(spec));
		}finder.printHomes();
	}
	
	else if(spec.equals("GARAGEPARKING")) {
		Iterator<Home>itr=byAmenityList.iterator();
		assertEquals("found 2 homes of Amenity GARAGEPARKING ", 1, byAmenityList.size());
		
		while(itr.hasNext()){
			assertTrue(itr.next().getAmenities().toString().equals(spec));
		}finder.printHomes();
	}

	else if(spec.equals("FIREPLACE")) {
		Iterator<Home>itr=byAmenityList.iterator();
		assertEquals("found 2 homes of Amenity FIREPLACE", 1, byAmenityList.size());
		
		while(itr.hasNext()){
			assertTrue(itr.next().getAmenities().toString().equals(spec));
		}finder.printHomes();
	}
	
	else if(spec.equals("ELEVATOR")) {
		Iterator<Home>itr=byAmenityList.iterator();
		assertEquals("found 2 homes of Amenity ELEVATOR", 1, byAmenityList.size());
		
		while(itr.hasNext()){
			assertTrue(itr.next().getAmenities().toString().equals(spec));
		}finder.printHomes();
	}




else if(spec.equals("SWIMMINGPOOL")) {
	Iterator<Home>itr=byAmenityList.iterator();
	assertEquals("found 2 homes of Amenity SWIMMINGPOOL", 1, byAmenityList.size());
	
	while(itr.hasNext()){
		assertTrue(itr.next().getAmenities().toString().equals(spec));
	}
	
	
}finder.printHomes();
	}

@When("I search about home with range of price {int}")
public void iSearchAboutHomeWithRangeOfPrice(Integer price) {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	
	this.price = price.intValue();
	byPriceList=finder.byPrice(price);
}




@Then("A list of homes that matches the range of prices specification should be returned and printed on the console")
public void aListOfHomesThatMatchesTheRangeOfPricesSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	
	//assertEquals("found 2 homes ", 2, ((List<Home>) byPriceList).size());
	assertEquals("found 2 homes ", 1, byPriceList.size());
	Iterator<Home>itr=byPriceList.iterator();
	while(itr.hasNext()){
		Home h= itr.next();
		assertTrue(h.getPrice() < price||h.getPrice() == price);
	}
	
	
	finder.printHomes();
	
	
}

	
@When("I search about home with area less than {int}")
public void iSearchAboutHomeWithAreaLessThan(Integer area) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	
	this.area=area.intValue();
	byAreaList=finder.byArea(area);
	
}




@Then("A list of homes that matches the area specification should be returned and printed on the console")
public void aListOfHomesThatMatchesTheAreaSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	
	
	assertEquals("found 2 homes ", 2, byAreaList.size());
	Iterator<Home>itr=byAreaList.iterator();
	while(itr.hasNext()){
		Home h= itr.next();
		assertTrue(h.getArea() < area);
	}finder.printHomes();
	
}

@When("I search about home with range of area {int}")
public void iSearchAboutHomeWithRangeOfArea(Integer area) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	this.area=area.intValue();
	byAreaList=finder.byArea(area);
	
	
}



@Then("A list of homes that matches the range of areas specification should be returned and printed on the console")
public void aListOfHomesThatMatchesTheRangeOfAreasSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	

	//assertEquals("found 2 homes ", 2, ((List<Home>) byPriceList).size());
	assertEquals("found 2 homes ", 2, byAreaList.size());
	Iterator<Home>itr=byAreaList.iterator();
	while(itr.hasNext()){
		Home h= itr.next();
		assertTrue( h.getArea() <area|| h.getArea() ==area);
		
		
		
	}
	finder.printHomes();
}


@When("I search about home with number of bedrooms less than {int}")
public void iSearchAboutHomeWithNumberOfBedroomsLessThan(Integer bed) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	this.bed=bed.intValue();
	byBedList=finder.byBedRoom(bed);
	
	
}



@Then("A list of homes that matches the  number of bedrooms specification should be returned and printed on the console")
public void aListOfHomesThatMatchesTheNumberOfBedroomsSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	
	//assertEquals("found 2 homes ", 2, ((List<Home>) byBedList).size());
		assertEquals("found 2 homes ", 2, byBedList.size());
		Iterator<Home>itr=byBedList.iterator();
		while(itr.hasNext()){
			Home h= itr.next();
			assertTrue(h.getNumber_of_bedrooms() < bed||h.getNumber_of_bedrooms() == bed);
		}
		finder.printHomes();
	
	
	
}



	
	
	

@When("I search about home by Pets {string}")
public void iSearchAboutHomeByPets(String spec) {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	this.pet= spec;
	this.spec=spec;
	byPetsList=finder.byPets(pet);
}




@Then("A list of homes that matches the allow pets specification should be returned and printed on the console")
public void aListOfHomesThatMatchesTheAllowPetsSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	
	
	HomePets a=new HomePets(pet);
	if(pet.equals("Yes")) {
		Iterator<Home>itr=byPetsList.iterator();
		assertEquals("found 2 homes with Pets ", 1, byPetsList.size());
		a.setAllowed("isAllowed");
		pet="Yes";
		while(itr.hasNext()) {
			assertTrue(itr.next().getPets().toString().equals(pet));
		}finder.printHomes();
	}
	
	else if(spec.equals("NO")) {
		a.setAllowed("No");
		pet="No";
		Iterator<Home>itr=byPetsList.iterator();
		assertEquals("found 2 homes with no Pets", 1, byPetsList.size());
		
		while(itr.hasNext()){
			assertTrue(itr.next().getPets().toString().equals(pet));
		}
		finder.printHomes();
	}
}




@When("I search about home by Typecomp {string}")
public void iSearchAboutHomeByTypecomp(String spec) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	
	this.spec = spec;
	if(HomeType.isHomeType(spec)) {
	byTypeList= finder.byType(spec);
	}
}




@When("I search about home by Materialcomp {string}")
public void iSearchAboutHomeByMaterialcomp(String Material) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	byMaterialList=finder.byMaterial(Material);
}

@Then("A list of homes that matches the type and material specification should be returned and printed on the console")
public void aListOfHomesThatMatchesTheTypeAndMaterialSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	if(spec.equals("HOUSE")) {
		Iterator<Home>itr=byTypeList.iterator();
		assertEquals("found 2 homes of type HOUSE ", 1, byTypeList.size());
		
		while(itr.hasNext()){
			assertTrue(itr.next().getType().toString().equals(spec));
		}
		finder.printHomes();
	}
	
	else if(spec.equals("WOOD")) {
		Iterator<Home>itr=byMaterialList.iterator();
		assertEquals("found 2 homes of Material WOOD ", 1, byMaterialList.size());
		
		while(itr.hasNext()) {
			assertTrue(itr.next().getMaterial().toString().equals(spec));
		}
	}
	//finder.printHomes();
}
@When("I search about home with number of bathrooms less than {int}")
public void iSearchAboutHomeWithNumberOfBathroomsLessThan(Integer bath) {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	
	this.bath=bath.intValue();
	byBathList=finder.byBathRoom(bath);
}



@Then("A list of homes that matches the  number of bathrooms specification should be returned and printed on the console")
public void aListOfHomesThatMatchesTheNumberOfBathroomsSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	//assertEquals("found 2 homes ", 2, ((List<Home>) byPriceList).size());
	assertEquals("found 2 homes ", 2, byBathList.size());
	Iterator<Home>itr=byBathList.iterator();
	while(itr.hasNext()){
		Home h= itr.next();
		assertTrue(h.getNumber_of_bathrooms() < bath||h.getNumber_of_bathrooms() ==bath);
		
	}
	finder.printHomes();
}


	
	
	
}





