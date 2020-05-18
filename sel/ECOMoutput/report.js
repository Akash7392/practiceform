$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Akash/git/practiceform/sel/src/main/java/allbasesset/ecomtest.feature");
formatter.feature({
  "line": 2,
  "name": "crate new account functionality for ecom site",
  "description": "",
  "id": "crate-new-account-functionality-for-ecom-site",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 4,
      "value": "#klhkjklj"
    }
  ],
  "line": 5,
  "name": "to test entire create an account form",
  "description": "",
  "id": "crate-new-account-functionality-for-ecom-site;to-test-entire-create-an-account-form",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "navigate to website and click on sign in button",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter e-mail Address \"\u003cemailid\u003e\"and click on create an account button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "display successfully open the form message",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click on title radio button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Enter first name \"\u003cfirst_name\u003e\"last name \"\u003clast_name\u003e\"and password  \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Enter DOB day \"\u003cday\u003e\"month \"\u003cmonth\u003e\"year \"\u003cyear\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "check sign up and release special offer box",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Enter the address fields first name \"\u003cfirst_n\u003e\"last name \"\u003clast_n\u003e\"company \"\u003ccompany\u003e\"Address \"\u003cAddress\u003e\" Address line two \"\u003cAddline2\u003e\" city \"\u003ccity\u003e\"zipcode \"\u003czipcode\u003e\"additional information \"\u003cadditional_info\u003e\"home phone \"\u003chomephone\u003e\"mobile no \"\u003cmob_no\u003e\"enter adress alias \"\u003cadd_alias\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Select the value from state \"\u003cstate_dropdown\u003e\"and country dropdown \"\u003ccountry_dropdown\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "click on register button and display the successfully registration message",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "quit the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "crate-new-account-functionality-for-ecom-site;to-test-entire-create-an-account-form;",
  "rows": [
    {
      "cells": [
        "emailid",
        "first_name",
        "last_name",
        "password",
        "day",
        "month",
        "year",
        "first_n",
        "last_n",
        "company",
        "Address",
        "Addline2",
        "city",
        "zipcode",
        "additional_info",
        "homephone",
        "mob_no",
        "add_alias",
        "state_dropdown",
        "country_dropdown"
      ],
      "line": 18,
      "id": "crate-new-account-functionality-for-ecom-site;to-test-entire-create-an-account-form;;1"
    },
    {
      "cells": [
        "ak.yesankar@outlook.com",
        "junaid",
        "patle",
        "123456",
        "2",
        "March",
        "2010",
        "junaid",
        "patle",
        "bajaj",
        "fuck you",
        "galli no 2",
        "Pune",
        "444029",
        "ok to share",
        "6966584555",
        "9856235689",
        "multiple add",
        "Alaska",
        "United States"
      ],
      "line": 19,
      "id": "crate-new-account-functionality-for-ecom-site;to-test-entire-create-an-account-form;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 19,
  "name": "to test entire create an account form",
  "description": "",
  "id": "crate-new-account-functionality-for-ecom-site;to-test-entire-create-an-account-form;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "navigate to website and click on sign in button",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter e-mail Address \"ak.yesankar@outlook.com\"and click on create an account button",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "display successfully open the form message",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click on title radio button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Enter first name \"junaid\"last name \"patle\"and password  \"123456\"",
  "matchedColumns": [
    1,
    2,
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Enter DOB day \"2\"month \"March\"year \"\u003cyear\"\u003e",
  "matchedColumns": [
    4,
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "check sign up and release special offer box",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Enter the address fields first name \"junaid\"last name \"patle\"company \"bajaj\"Address \"fuck you\" Address line two \"galli no 2\" city \"Pune\"zipcode \"444029\"additional information \"ok to share\"home phone \"6966584555\"mobile no \"9856235689\"enter adress alias \"\u003cadd_alias\"\u003e",
  "matchedColumns": [
    16,
    7,
    8,
    9,
    10,
    11,
    12,
    13,
    14,
    15
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Select the value from state \"Alaska\"and country dropdown \"\u003ccountry_dropdown\"\u003e",
  "matchedColumns": [
    18
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "click on register button and display the successfully registration message",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "quit the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionImpliment.navigate_to_website_and_click_on_sign_in_button()"
});
formatter.result({
  "duration": 113614498460,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ak.yesankar@outlook.com",
      "offset": 22
    }
  ],
  "location": "StepDefinitionImpliment.enter_e_mail_Address_and_click_on_create_an_account_button(String)"
});
formatter.result({
  "duration": 667021709,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionImpliment.display_successfully_open_the_form_message()"
});
formatter.result({
  "duration": 134683,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionImpliment.click_on_title_radio_button()"
});
formatter.result({
  "duration": 4208894726,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "junaid",
      "offset": 18
    },
    {
      "val": "patle",
      "offset": 36
    },
    {
      "val": "123456",
      "offset": 57
    }
  ],
  "location": "StepDefinitionImpliment.enter_first_name_last_name_and_password(String,String,String)"
});
formatter.result({
  "duration": 787963358,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 15
    },
    {
      "val": "March",
      "offset": 24
    },
    {
      "val": "\u003cyear",
      "offset": 36
    }
  ],
  "location": "StepDefinitionImpliment.enter_DOB_day_month_year(String,String,String)"
});
formatter.result({
  "duration": 10342799863,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate element with text: 2\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-NGFOF13\u0027, ip: \u0027192.168.2.14\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.selectByVisibleText(Select.java:147)\r\n\tat stepDefinition.StepDefinitionImpliment.enter_DOB_day_month_year(StepDefinitionImpliment.java:66)\r\n\tat ✽.Then Enter DOB day \"2\"month \"March\"year \"\u003cyear\"\u003e(C:/Users/Akash/git/practiceform/sel/src/main/java/allbasesset/ecomtest.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinitionImpliment.check_sign_up_and_release_special_offer_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "junaid",
      "offset": 37
    },
    {
      "val": "patle",
      "offset": 55
    },
    {
      "val": "bajaj",
      "offset": 70
    },
    {
      "val": "fuck you",
      "offset": 85
    },
    {
      "val": "galli no 2",
      "offset": 113
    },
    {
      "val": "Pune",
      "offset": 131
    },
    {
      "val": "444029",
      "offset": 145
    },
    {
      "val": "ok to share",
      "offset": 176
    },
    {
      "val": "6966584555",
      "offset": 200
    },
    {
      "val": "9856235689",
      "offset": 222
    },
    {
      "val": "\u003cadd_alias",
      "offset": 253
    }
  ],
  "location": "StepDefinitionImpliment.enter_the_address_fields_first_name_last_name_company_Address_Address_line_two_city_zipcode_additional_information_home_phone_mobile_no_enter_adress_alias(String,String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Alaska",
      "offset": 29
    },
    {
      "val": "\u003ccountry_dropdown",
      "offset": 58
    }
  ],
  "location": "StepDefinitionImpliment.select_the_value_from_state_and_country_dropdown(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitionImpliment.click_on_register_button_and_display_the_successfully_registration_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitionImpliment.quit_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});