Feature: Applicant A2O Registration Feature
  International or domestic applicant registered through my.app portal in order to logon into the portal

  @Registration_Page
  Scenario: Applicant registered through my.app portal in order to logon into the portal
    Given I navigate to the mailinator public website
    And I Set a new email and Click Go
    Then I should login into mailinator inbox
    Given I navigate to the my.app Application Registration page and Click Register link
    Then I Set GivenName FamilyName and Email and Click Singup
    And Close the browser
    Given I navigate back to mailinator inbox to refresh and see Reg Email is in inbox
    And I click welcome email link
    Then I click Complete Registration button from Email and reset password
    Then I Logout from the Application