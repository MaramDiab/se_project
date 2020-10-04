Feature: Search about suitable home
  
Background: The System has a repository of homes with their specifications (type-material-placement-pets-amenties-price-area-bedrooms-bathrooms-leaselength)
Given  these homes are contained in the system
                |HOUSE_WOOD_VILLAGE_NO_GARAGEPARKING_FIREPLACE_ELEVATOR|510_150_3_2_6|
                |APARTMENT_BRICK_CITY_NO_ELEVATOR|230_120_4_2_12|
                
                
                
               
  Scenario: Search home by type
  When I search about home by Type "HOUSE"
  Then A list of homes that matches the  type specification should be returned and printed on the console
  
  
   Scenario: Search about home with less than a specific price
    When I search about home with price less than 400
    Then A list of homes that matches the price specification should be returned and printed on the console
    
    @tag
    Scenario: Search home by material
    When I search about home by material "BRICK"
    Then A list of homes that matches the material specification should be returned and printed on the console
    
    @tag
     Scenario: Search home by placement
    When I search about home by placement "CITY"
    Then A list of homes that matches the placement specification should be returned and printed on the console
    
    

    @tag
     Scenario: Search home by Amenities
     When I search about home by Amenities "BALACONY"
     Then A list of homes that matches the Amenities specification should be returned and printed on the console
     
     
     @tag
     Scenario: Search home by range of prices
     When I search about home with range of price 500
    Then A list of homes that matches the range of prices specification should be returned and printed on the console  
    
    
    Scenario: Search home with less than a specific area
     When I search about home with area less than 200
    Then A list of homes that matches the area specification should be returned and printed on the console  
    
     Scenario: Search home by range of areas
     When I search about home with range of area 300
    Then A list of homes that matches the range of areas specification should be returned and printed on the console  
    
    
      Scenario: Search home by Number of bedrooms
     When I search about home with number of bedrooms less than 5
     Then A list of homes that matches the  number of bedrooms specification should be returned and printed on the console
     
     Scenario: Search home by Number of bathrooms
     When I search about home with number of bathrooms less than 3
     Then A list of homes that matches the  number of bathrooms specification should be returned and printed on the console
     
     
     
        Scenario: Search home by lease length
     When I search about home by lease 12
     Then A list of homes that matches the lease length specification should be returned and printed on the console
     
     
        @tag
    Scenario: Search home by allow pets
    When I search about home by Pets "YES"
    Then A list of homes that matches the allow pets specification should be returned and printed on the console 
      
    Scenario: Search home by combination between type and material
      When I search about home by Typecomp "HOUSE"
      And I search about home by Materialcomp "WOOD"
      Then A list of homes that matches the type and material specification should be returned and printed on the console
    