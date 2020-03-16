$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("darksky-temp.feature");
formatter.feature({
  "line": 2,
  "name": "temp feature",
  "description": "",
  "id": "temp-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    },
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@temp"
    }
  ]
});
formatter.before({
  "duration": 4846589755,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 24,
  "name": "Verify invalid signup error message",
  "description": "",
  "id": "temp-feature;verify-invalid-signup-error-message",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@temp-4"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "I am on darksky Register Page",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I click on register button",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "I verify I am on register page by asserting Register header",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkSkySD.iAmOnDarkSkyHomePage()"
});
formatter.result({
  "duration": 4653487870,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkySD.clickOnRegisterButton()"
});
formatter.result({
  "duration": 45033662,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkySD.verifyRegisterHeader()"
});
formatter.result({
  "duration": 28859248,
  "status": "passed"
});
formatter.after({
  "duration": 100457678,
  "status": "passed"
});
});