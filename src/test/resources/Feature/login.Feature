Feature: verify adactin

  Scenario Outline: verify login details with credentials
    Given User on the Loginpage
    When User should enter "<userName>" and "<passWord>"
    And User should using hotel "<location>","<hotels>","<roomType>","<noofRooms>","<checkIndate>","<checkOutdate>","<adultsPerRoom>","<childperRoom>"
    Then select the hotel
    When Booking hotel hotel using "<firstName>","<lastName>","<billingAddress>","<creditcatdNo>","<cvv>","<year>"
    And Get booking number

    Examples: 
      | userName   | passWord | location | hotels      | roomType | noofRooms | checkIndate | checkOutdate | adultsPerRoom | childperRoom | firstName | lastName | billingAddress | creditcatdNo       | cardType         | cvv | month   | year |
      | SUDHAGAR97 | ZHRKHADG | Sydney   | Hotel creek | STANDRED | 2-TWO     | 21/10/2020  | 22/10/2020   | 2-TWO         | 2-TWO        | SUDHAGAR  | DANT     | KAMBAR STREET  | 785537755758987656 | American Express | 987 | january | 2022 |
