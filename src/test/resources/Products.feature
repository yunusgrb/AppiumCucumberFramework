Feature: Products scenarios

  Scenario Outline: Validate product info on Product page
    Given I'm logged in
    Then The product is listed with title "<title>" and price "<price>"
    Examples:
      | title                   | price  |
      | Sauce Labs Bolt T-Shirt | $15.99 |
     # | Sauce Labs Onesie       | $7.99  |
     # | Test.allTheThings() T-shirt (Red) | 15.99  |
     # | Sauce Labs Backpack       | $29.99  |

  Scenario Outline: Validate product info on Product page
    Given I'm logged in
    When I click product title "<title>"
    Then The product is listed with title "<title>" and price "<price>" and description "<description>"
    Examples:
      | title                   | price  | description |
      | Sauce Labs Bolt T-Shirt | $15.99 | Get your testing superhero on with the Sauce Labs Bolt |
      | Sauce Labs Backpack       | $29.99  | carry.allTheThings() with the sleek,                |
