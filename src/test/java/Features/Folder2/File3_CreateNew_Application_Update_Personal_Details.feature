Feature: Applicant Create and edit the New application
  User Create the New application form and edit their personal details

  @CoursePreference_Test
  Scenario Outline: User Create the New application form and edit their personal details

    Given I entered username and password
    And I click login button
    And I navigate to the home <home> page
    And I click Create New Application button then Navigates to the initial Declaration Page
    And Click Next to go the Personal Details Page
    And I select <location> from where do you want to study dropdown
    And Click Next to go to the Course Preference Page

#    And I Enter Course Preference code <Code> into Search Field
#    When I click Search button
##    Then I select attendance Type <Attendance>
##    Then I select location <Location>
##    Then I select commencementPeriod <Period>
##    Then I click on apply filters
#    Then I select list of courses and Add them to the application
#    Then I click AddCourse
#    Then I click CloseSearch
#    Then I should see the list of courses added <CoursePre> to the application
##    Then Logout <Logout> of the Application

    Examples:
      |   username                          |   password    |   home    |  location       |   Attendance    |   Location    |   Period                 |  CoursePre   |
      |   rupa17@mailinator.com             |   monash@2017 |   HOME    |   Australia     |   Full Time     |    CITY       |   2021 Summer Semester   |    1         |