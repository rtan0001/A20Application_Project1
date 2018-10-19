Feature: Applicant Add and Update Course Preference Details with the Selection
  User Create the New application adding Course Preference details

  @Personal_Details_Test
  Scenario Outline: User Add and Update Course Preference Details

    Given I entered Course Code or name then click search should give full list of courses
    And I select and Added courses from the given list
    And I Close Search function
    And I can be able to Delete the Course Preference then preference should be changed
    When I click NextPage it will Navigate to the Education History page


    Examples:
      |  location   |
      |  Australia  |