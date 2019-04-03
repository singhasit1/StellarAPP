$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Area.feature");
formatter.feature({
  "line": 1,
  "name": "Verify Area Screen Functionality",
  "description": "",
  "id": "verify-area-screen-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Create an area",
  "description": "",
  "id": "verify-area-screen-functionality;create-an-area",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Launch Browser And Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Area List  Opens",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Clicks on Add Area button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Area Details  Open",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User Provide Area Name As \"North England\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User Provide Area Code As \"NE\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Provide Audience Set As \"BARB\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User Provide Descriptions AS \"North England Of BARB Audience\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Click on Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Verify That Area Name Created As \"North England\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Close The Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TestAreaScreen.launch_Browser_And_Application()"
});
formatter.result({
  "duration": 5822616122,
  "status": "passed"
});
formatter.match({
  "location": "TestAreaScreen.area_List_Opens()"
});
formatter.result({
  "duration": 25538,
  "status": "passed"
});
formatter.match({
  "location": "TestAreaScreen.user_Clicks_on_Add_Area_button()"
});
formatter.result({
  "duration": 608758524,
  "status": "passed"
});
formatter.match({
  "location": "TestAreaScreen.area_Details_Open()"
});
formatter.result({
  "duration": 18020238,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "North England",
      "offset": 27
    }
  ],
  "location": "TestAreaScreen.User_Provide_Area_Name_As(String)"
});
formatter.result({
  "duration": 585313408,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NE",
      "offset": 27
    }
  ],
  "location": "TestAreaScreen.User_Provide_Area_Code_As(String)"
});
formatter.result({
  "duration": 61222179,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BARB",
      "offset": 30
    }
  ],
  "location": "TestAreaScreen.User_Provide_Audience_Set_As(String)"
});
formatter.result({
  "duration": 603515115,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "North England Of BARB Audience",
      "offset": 30
    }
  ],
  "location": "TestAreaScreen.User_Provide_Descriptions_AS(String)"
});
formatter.result({
  "duration": 134960997,
  "status": "passed"
});
formatter.match({
  "location": "TestAreaScreen.click_on_Submit_button()"
});
formatter.result({
  "duration": 2061785818,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "North England",
      "offset": 34
    }
  ],
  "location": "TestAreaScreen.verify_That_Area_Name_Created_As(String)"
});
formatter.result({
  "duration": 25108694,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[North Eng]land\u003e but was:\u003c[Mid]land\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.mapsynq.TestAreaScreen.verify_That_Area_Name_Created_As(TestAreaScreen.java:66)\r\n\tat ✽.Then Verify That Area Name Created As \"North England\"(Area.feature:14)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestAreaScreen.close_The_Browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 18,
  "name": "Amend  an Area",
  "description": "",
  "id": "verify-area-screen-functionality;amend--an-area",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "Launch Browser And Application",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "Area List  Opens",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User Select Area Name As \"North England\"",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User Clicks on Amend Area button",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "User Change Area Name From North England To \"South England\"",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Click on Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Verify That Area Name Changed to \"South England\"",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Close The Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TestAreaScreen.launch_Browser_And_Application()"
});
formatter.result({
  "duration": 5321431908,
  "status": "passed"
});
formatter.match({
  "location": "TestAreaScreen.area_List_Opens()"
});
formatter.result({
  "duration": 24036,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "North England",
      "offset": 26
    }
  ],
  "location": "TestAreaScreen.user_Select_Area_Name_As(String)"
});
formatter.result({
  "duration": 156233,
  "status": "passed"
});
formatter.match({
  "location": "TestAreaScreen.user_Clicks_on_Amend_Area_button()"
});
formatter.result({
  "duration": 75370549,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "South England",
      "offset": 45
    }
  ],
  "location": "TestAreaScreen.User_Change_Area_Name_From_North_England_To(String)"
});
formatter.result({
  "duration": 678371599,
  "status": "passed"
});
formatter.match({
  "location": "TestAreaScreen.click_on_Submit_button()"
});
formatter.result({
  "duration": 2081835277,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "South England",
      "offset": 34
    }
  ],
  "location": "TestAreaScreen.verify_That_Area_Name_Changed_to(String)"
});
formatter.result({
  "duration": 44767,
  "status": "passed"
});
formatter.match({
  "location": "TestAreaScreen.close_The_Browser()"
});
formatter.result({
  "duration": 683377654,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Delete an Area",
  "description": "",
  "id": "verify-area-screen-functionality;delete-an-area",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "Launch Browser And Application",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "Area List  Opens",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "User Select Area Name As \"South England\"",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "User Clicks On  Delete Area Button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "System Warn A Message That \"Are you sure to delete \"",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "User Click On Ok Button",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "Verify That Area Name \"South England\" Deleted From The Area List",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "Close The Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TestAreaScreen.launch_Browser_And_Application()"
});
formatter.result({
  "duration": 4466079932,
  "status": "passed"
});
formatter.match({
  "location": "TestAreaScreen.area_List_Opens()"
});
formatter.result({
  "duration": 9013,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "South England",
      "offset": 26
    }
  ],
  "location": "TestAreaScreen.user_Select_Area_Name_As(String)"
});
formatter.result({
  "duration": 70606,
  "status": "passed"
});
formatter.match({
  "location": "TestAreaScreen.user_Clicks_On_Delete_Area_Button()"
});
formatter.result({
  "duration": 1538006153,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Are you sure to delete ",
      "offset": 28
    }
  ],
  "location": "TestAreaScreen.system_Warn_A_Message_That(String)"
});
formatter.result({
  "duration": 23287683,
  "status": "passed"
});
formatter.match({
  "location": "TestAreaScreen.user_Click_On_Ok_Button()"
});
formatter.result({
  "duration": 7236577,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "South England",
      "offset": 23
    }
  ],
  "location": "TestAreaScreen.verify_That_Area_Name_Deleted_From_The_Area_List(String)"
});
formatter.result({
  "duration": 19788671,
  "status": "passed"
});
formatter.match({
  "location": "TestAreaScreen.close_The_Browser()"
});
formatter.result({
  "duration": 684097827,
  "status": "passed"
});
});