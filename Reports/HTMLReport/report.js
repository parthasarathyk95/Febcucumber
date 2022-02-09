$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/Fblogin.feature");
formatter.feature({
  "name": "to validate the Facebook login Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user need to be in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.user_need_to_be_in_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.scenario({
  "name": "to validate the login with invalid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user should enter invalid Username",
  "rows": [
    {
      "cells": [
        "username",
        "abi",
        "balu",
        "chandru"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.userShouldEnterInvalidUsername(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user should enter invalid Password",
  "rows": [
    {
      "cells": [
        "pass@123",
        "abi@456",
        "balu@789"
      ]
    },
    {
      "cells": [
        "chandru@012",
        "daniel@123",
        "edwin@456"
      ]
    },
    {
      "cells": [
        "Balu@789",
        "chandru@012",
        "pass@1234"
      ]
    },
    {
      "cells": [
        "abi@456",
        "balu@789",
        "chandru@012"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.userShouldEnterInvalidPassword(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_clicks_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user will navigate to invalid credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_will_navigate_to_invalid_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
});