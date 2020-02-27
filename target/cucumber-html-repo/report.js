$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Test JPetStore Login",
  "description": "",
  "id": "test-jpetstore-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Test JPetStore Login with valid user name and password",
  "description": "",
  "id": "test-jpetstore-login;test-jpetstore-login-with-valid-user-name-and-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@loginTestCase1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User open Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User go to JPetStore page and click to enter the store and to sign in",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enter valid \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" combination and User will click on login bottum",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User should be able to login successfully and should see the sign out buttom",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "test-jpetstore-login;test-jpetstore-login-with-valid-user-name-and-password;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "test-jpetstore-login;test-jpetstore-login-with-valid-user-name-and-password;;1"
    },
    {
      "cells": [
        "quality1",
        "12345678"
      ],
      "line": 12,
      "id": "test-jpetstore-login;test-jpetstore-login-with-valid-user-name-and-password;;2"
    }
  ],
  "keyword": "Examples",
  "tags": [
    {
      "line": 9,
      "name": "@ExampleTestCase1"
    }
  ]
});
formatter.scenario({
  "line": 12,
  "name": "Test JPetStore Login with valid user name and password",
  "description": "",
  "id": "test-jpetstore-login;test-jpetstore-login-with-valid-user-name-and-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@loginTestCase1"
    },
    {
      "line": 9,
      "name": "@ExampleTestCase1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User open Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User go to JPetStore page and click to enter the store and to sign in",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enter valid \"quality1\" and \"12345678\" combination and User will click on login bottum",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User should be able to login successfully and should see the sign out buttom",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_open_Chrome_browser()"
});
formatter.result({
  "duration": 2344273812,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_go_to_JPetStore_page_and_click_to_enter_the_store_and_to_sign_in()"
});
formatter.result({
  "duration": 1889744909,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "quality1",
      "offset": 18
    },
    {
      "val": "12345678",
      "offset": 33
    }
  ],
  "location": "Login.user_enter_valid_and_combination_and_User_will_click_on_login_bottum(String,String)"
});
formatter.result({
  "duration": 621733998,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_should_be_able_to_login_successfully_and_should_see_the_sign_out_buttom()"
});
formatter.result({
  "duration": 94456036,
  "status": "passed"
});
});