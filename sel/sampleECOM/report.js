$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Akash/git/practiceform/sel/src/main/java/allbasesset/test_learn.feature");
formatter.feature({
  "line": 1,
  "name": "to sample account create form",
  "description": "",
  "id": "to-sample-account-create-form",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "to test few field of account create form",
  "description": "",
  "id": "to-sample-account-create-form;to-test-few-field-of-account-create-form",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Navigate to site",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "click on sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "enter email address \"\u003cemailid1\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "enter security password \"\u003cpass\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click on sgin in button again",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "display the message",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "quit the only browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "to-sample-account-create-form;to-test-few-field-of-account-create-form;",
  "rows": [
    {
      "cells": [
        "emailid1",
        "pass"
      ],
      "line": 13,
      "id": "to-sample-account-create-form;to-test-few-field-of-account-create-form;;1"
    },
    {
      "cells": [
        "ak.yesankar@outlook.com",
        "okakash"
      ],
      "line": 14,
      "id": "to-sample-account-create-form;to-test-few-field-of-account-create-form;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "to test few field of account create form",
  "description": "",
  "id": "to-sample-account-create-form;to-test-few-field-of-account-create-form;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Navigate to site",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "click on sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "enter email address \"ak.yesankar@outlook.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "enter security password \"okakash\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click on sgin in button again",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "display the message",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "quit the only browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Demostepdef.navigate_to_site()"
});
formatter.result({
  "duration": 15944645926,
  "status": "passed"
});
formatter.match({
  "location": "Demostepdef.click_on_sign_in_button()"
});
formatter.result({
  "duration": 2447384560,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ak.yesankar@outlook.com",
      "offset": 21
    }
  ],
  "location": "Demostepdef.enter_email_address(String)"
});
formatter.result({
  "duration": 521721697,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "okakash",
      "offset": 25
    }
  ],
  "location": "Demostepdef.enter_security_password(String)"
});
formatter.result({
  "duration": 215495399,
  "status": "passed"
});
formatter.match({
  "location": "Demostepdef.click_on_sgin_in_button_again()"
});
formatter.result({
  "duration": 1364847199,
  "status": "passed"
});
formatter.match({
  "location": "Demostepdef.display_the_message()"
});
formatter.result({
  "duration": 131598,
  "status": "passed"
});
formatter.match({
  "location": "Demostepdef.quit_the_only_browser()"
});
formatter.result({
  "duration": 920310510,
  "status": "passed"
});
});