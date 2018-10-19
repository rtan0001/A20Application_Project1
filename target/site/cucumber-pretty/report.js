$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("File3_CreateNew_Application_Update_Personal_Details.feature");
formatter.feature({
  "line": 1,
  "name": "Applicant Create and edit the New application",
  "description": "User Create the New application form and edit their personal details",
  "id": "applicant-create-and-edit-the-new-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "User Create the New application form and edit their personal details",
  "description": "",
  "id": "applicant-create-and-edit-the-new-application;user-create-the-new-application-form-and-edit-their-personal-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@CoursePreference_Test"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I entered username and password",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I navigate to the home \u003chome\u003e page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click Create New Application button then Navigates to the initial Declaration Page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click Next to go the Personal Details Page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I select \u003clocation\u003e from where do you want to study dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Click Next to go to the Course Preference Page",
  "keyword": "And "
});
formatter.examples({
  "comments": [
    {
      "line": 15,
      "value": "#    And I Enter Course Preference code \u003cCode\u003e into Search Field"
    },
    {
      "line": 16,
      "value": "#    When I click Search button"
    },
    {
      "line": 17,
      "value": "##    Then I select attendance Type \u003cAttendance\u003e"
    },
    {
      "line": 18,
      "value": "##    Then I select location \u003cLocation\u003e"
    },
    {
      "line": 19,
      "value": "##    Then I select commencementPeriod \u003cPeriod\u003e"
    },
    {
      "line": 20,
      "value": "##    Then I click on apply filters"
    },
    {
      "line": 21,
      "value": "#    Then I select list of courses and Add them to the application"
    },
    {
      "line": 22,
      "value": "#    Then I click AddCourse"
    },
    {
      "line": 23,
      "value": "#    Then I click CloseSearch"
    },
    {
      "line": 24,
      "value": "#    Then I should see the list of courses added \u003cCoursePre\u003e to the application"
    },
    {
      "line": 25,
      "value": "##    Then Logout \u003cLogout\u003e of the Application"
    }
  ],
  "line": 27,
  "name": "",
  "description": "",
  "id": "applicant-create-and-edit-the-new-application;user-create-the-new-application-form-and-edit-their-personal-details;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "home",
        "location",
        "Attendance",
        "Location",
        "Period",
        "CoursePre"
      ],
      "line": 28,
      "id": "applicant-create-and-edit-the-new-application;user-create-the-new-application-form-and-edit-their-personal-details;;1"
    },
    {
      "cells": [
        "rupa17@mailinator.com",
        "monash@2017",
        "HOME",
        "Australia",
        "Full Time",
        "CITY",
        "2021 Summer Semester",
        "1"
      ],
      "line": 29,
      "id": "applicant-create-and-edit-the-new-application;user-create-the-new-application-form-and-edit-their-personal-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 29,
  "name": "User Create the New application form and edit their personal details",
  "description": "",
  "id": "applicant-create-and-edit-the-new-application;user-create-the-new-application-form-and-edit-their-personal-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@CoursePreference_Test"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I entered username and password",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I navigate to the home HOME page",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click Create New Application button then Navigates to the initial Declaration Page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click Next to go the Personal Details Page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I select Australia from where do you want to study dropdown",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Click Next to go to the Course Preference Page",
  "keyword": "And "
});
formatter.match({
  "location": "Applicant_MyDetails_Steps.iEnteredUsernameAndPassword()"
});
formatter.result({
  "duration": 12550044466,
  "status": "passed"
});
formatter.match({
  "location": "Applicant_MyDetails_Steps.iClickLoginButton()"
});
formatter.result({
  "duration": 12062304606,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HOME",
      "offset": 23
    }
  ],
  "location": "CreateNew_Application_Update_Personal_Details_Steps.i_navigate_to_the_home_Home_page(String)"
});
formatter.result({
  "duration": 5169820708,
  "status": "passed"
});
formatter.match({
  "location": "CreateNew_Application_Update_Personal_Details_Steps.iClickCreateNewApplicationButtonThenNavigatesToTheInitialDeclarationPage()"
});
formatter.result({
  "duration": 6057274172,
  "status": "passed"
});
formatter.match({
  "location": "CreateNew_Application_Update_Personal_Details_Steps.clickNextToGoThePersonalDetailsPage()"
});
formatter.result({
  "duration": 2055429985,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Australia",
      "offset": 9
    }
  ],
  "location": "Add_And_Update_Personal_Details_Steps.iSelectLocationFromWhereDoYouWantToStudyDropdown(String)"
});
formatter.result({
  "duration": 3088298827,
  "status": "passed"
});
formatter.match({
  "location": "CreateNew_Application_Update_Personal_Details_Steps.clickNextToGoToTheCoursePreferencePage()"
});
formatter.result({
  "duration": 3077977727,
  "status": "passed"
});
formatter.uri("File4_Add_Course_Preference_Details.feature");
formatter.feature({
  "line": 1,
  "name": "Applicant Add and Update Course Preference Details with the Selection",
  "description": "User Create the New application adding Course Preference details",
  "id": "applicant-add-and-update-course-preference-details-with-the-selection",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "User Add and Update Course Preference Details",
  "description": "",
  "id": "applicant-add-and-update-course-preference-details-with-the-selection;user-add-and-update-course-preference-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Personal_Details_Test"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I entered Course Code or name then click search should give full list of courses",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I select and Added courses from the given list",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I Close Search function",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I can be able to Delete the Course Preference then preference should be changed",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click NextPage it will Navigate to the Education History page",
  "keyword": "When "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "applicant-add-and-update-course-preference-details-with-the-selection;user-add-and-update-course-preference-details;",
  "rows": [
    {
      "cells": [
        "location"
      ],
      "line": 15,
      "id": "applicant-add-and-update-course-preference-details-with-the-selection;user-add-and-update-course-preference-details;;1"
    },
    {
      "cells": [
        "Australia"
      ],
      "line": 16,
      "id": "applicant-add-and-update-course-preference-details-with-the-selection;user-add-and-update-course-preference-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "User Add and Update Course Preference Details",
  "description": "",
  "id": "applicant-add-and-update-course-preference-details-with-the-selection;user-add-and-update-course-preference-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Personal_Details_Test"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I entered Course Code or name then click search should give full list of courses",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I select and Added courses from the given list",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I Close Search function",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I can be able to Delete the Course Preference then preference should be changed",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click NextPage it will Navigate to the Education History page",
  "keyword": "When "
});
formatter.match({
  "location": "Add_Course_Preference_Details_Steps.iEnteredCourseCodeOrNameThenClickSearchShouldGiveFullListOfCourses()"
});
formatter.result({
  "duration": 6235133490,
  "status": "passed"
});
formatter.match({
  "location": "Add_Course_Preference_Details_Steps.iSelectAndAddedCoursesFromTheGivenList()"
});
formatter.result({
  "duration": 7366887428,
  "status": "passed"
});
formatter.match({
  "location": "Add_Course_Preference_Details_Steps.iCloseSearchFunction()"
});
formatter.result({
  "duration": 4081343457,
  "status": "passed"
});
formatter.match({
  "location": "Add_Course_Preference_Details_Steps.iCanBeAbleToDeleteTheCoursePreferenceThenPreferenceShouldBeChanged()"
});
formatter.result({
  "duration": 5067237718,
  "status": "passed"
});
formatter.match({
  "location": "Add_Course_Preference_Details_Steps.iClickNextPageItWillNavigateToTheEducationHistoryPage()"
});
formatter.result({
  "duration": 57611626,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003cbutton class\u003d\"slds-button slds-button_neutral\" name\u003d\"previousButton\" type\u003d\"button\" data-aura-rendered-by\u003d\"328:593;a\"\u003e...\u003c/button\u003e is not clickable at point (703, 681). Other element would receive the click: \u003cdiv class\u003d\"slds-modal__container\" data-aura-rendered-by\u003d\"1473:0\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d69.0.3497.100)\n  (Driver info: chromedriver\u003d2.35.528161 (5b82f2d2aae0ca24b877009200ced9065a772e73),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.8.1\u0027, revision: \u00276e95a6684b\u0027, time: \u00272017-12-01T18:33:54.468Z\u0027\nSystem info: host: \u0027MU00142059\u0027, ip: \u002749.127.78.10\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.35.528161 (5b82f2d2aae0ca..., userDataDir: C:\\Users\\rtan0001\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 69.0.3497.100, webStorageEnabled: true}\nSession ID: dd088c519d43b7d70a07c1ccb5111d88\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat Pages.Add_Course_Preference_Details_Page.Click_NextPage_CoursePreference(Add_Course_Preference_Details_Page.java:71)\r\n\tat Steps.Add_Course_Preference_Details_Steps.iClickNextPageItWillNavigateToTheEducationHistoryPage(Add_Course_Preference_Details_Steps.java:55)\r\n\tat ✽.When I click NextPage it will Navigate to the Education History page(File4_Add_Course_Preference_Details.feature:11)\r\n",
  "status": "failed"
});
});