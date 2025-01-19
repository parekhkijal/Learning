Feature: Datacom - Contact Us Page Tests
  As a user, I want to navigate and perform actions on the Datacom Contact Us page to ensure it functions as expected.

  Background:
    Given the browser is successfully initialized


  @FullRegression
  Scenario: Validate Navigation to the Contact Us Page
    When the user navigates to the Contact Us page
    Then the page title should be "Contact Us — Get In Touch"
    And the browser is closed


  @FullRegression
  Scenario: Validate Main Menu Headers on the Contact Us Page
    When the user navigates to the Contact Us page
    And the AcceptAllCookies button is clicked
    Then the main menu headers should be displayed as:
      | Solutions  |
      | Products   |
      | Industries |
      | Discover   |
      | About Us   |
      | Careers    |
    And the browser is closed


  @FullRegression
  Scenario: Validate Sub Menu Headers on the Contact Us Page
    When the user navigates to the Contact Us page
    And the AcceptAllCookies button is clicked
    Then the contactus menu headers should be displayed as:
      | Our locations |
      | Get in touch  |
      | Media pack    |
    And the browser is closed

  @FullRegression
  Scenario: Validate clicking on Discover
    When the user navigates to the Contact Us page
    And clicks on the Discover link
    Then new page is opened
    And the browser is closed