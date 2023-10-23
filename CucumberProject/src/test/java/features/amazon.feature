Feature: Automation script with cucmber for Amazon page

  Scenario: Test amazon page for mobiles
    Given I am on amazon page
    Then I click on Mobiles
    When I hover over Mobiles & Accessories
    Then I click on Apple
    When I select one of the products of Apple say Pencil
    Then Product opens on a new Window
    And I click on Add to Cart
