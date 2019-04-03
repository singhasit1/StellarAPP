Feature: Verify Area Screen Functionality

  @Sanity
  Scenario: Create an area
    Given Launch Browser And Application
    When  Area List  Opens
    And   User Clicks on Add Area button
    Then  Area Details  Open
    When  User Provide Area Name As "North England"
    And   User Provide Area Code As "NE"
    And   User Provide Audience Set As "BARB"
    And   User Provide Descriptions AS "North England Of BARB Audience"
    And   Click on Submit button
    Then  Verify That Area Name Created As "North England"
    Then  Close The Browser

  @Sanity
  Scenario: Amend  an Area
    Given Launch Browser And Application
    When Area List  Opens
    When User Select Area Name As "North England"
    Then User Clicks on Amend Area button
    Then User Change Area Name From North England To "South England"
    And  Click on Submit button
    Then Verify That Area Name Changed to "South England"
    Then  Close The Browser

  @Sanity
  Scenario: Delete an Area
    Given Launch Browser And Application
    When  Area List  Opens
    Then  User Select Area Name As "South England"
    And   User Clicks On  Delete Area Button
    Then  System Warn A Message That "Are you sure to delete "
    When  User Click On Ok Button
    Then  Verify That Area Name "South England" Deleted From The Area List
    Then  Close The Browser




