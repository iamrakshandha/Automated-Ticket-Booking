$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BookFlights.feature");
formatter.feature({
  "line": 1,
  "name": "Book Flights",
  "description": "",
  "id": "book-flights",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Enter flight details and search",
  "description": "",
  "id": "book-flights;enter-flight-details-and-search",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@run"
    },
    {
      "line": 4,
      "name": "@pre-requisite-flights"
    },
    {
      "line": 5,
      "name": "@afterScenarioFlights"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is on SpiceJet landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters flight details and search",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Respective flights are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionBookFlights.user_is_on_spicejet_landing_page()"
});
formatter.result({
  "duration": 11815724600,
  "status": "passed"
});
formatter.match({
  "location": "BookFlights2.user_enters_flight_details_and_search()"
});
formatter.result({
  "duration": 6185017500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionBookFlights.respective_flights_are_displayed()"
});
formatter.result({
  "duration": 66935700,
  "status": "passed"
});
formatter.after({
  "duration": 213508600,
  "status": "passed"
});
formatter.uri("BookHotels.feature");
formatter.feature({
  "line": 1,
  "name": "Book Hotels",
  "description": "",
  "id": "book-hotels",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Enter hotel details and search",
  "description": "",
  "id": "book-hotels;enter-hotel-details-and-search",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@run"
    },
    {
      "line": 5,
      "name": "@pre-requisite-hotels"
    },
    {
      "line": 6,
      "name": "@afterScenarioHotels"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User on SpiceJet landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User navigates to book hotels",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Enters hotel details and search",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Respective hotels are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionBookHotels.user_on_spicejet_landing_page()"
});
formatter.result({
  "duration": 11678773300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionBookHotels.user_navigates_to_book_hotels()"
});
formatter.result({
  "duration": 210300300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionBookHotels.enters_hotel_details_and_search()"
});
formatter.result({
  "duration": 6669211000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionBookHotels.respective_hotels_are_displayed()"
});
formatter.result({
  "duration": 3157251200,
  "status": "passed"
});
formatter.after({
  "duration": 1231430000,
  "status": "passed"
});
formatter.uri("LoginSignUp.feature");
formatter.feature({
  "line": 1,
  "name": "Login/SignUp",
  "description": "",
  "id": "login/signup",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14626565400,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "SignUp invalid email",
  "description": "",
  "id": "login/signup;signup-invalid-email",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@run"
    },
    {
      "line": 4,
      "name": "@pre-requisite1"
    },
    {
      "line": 5,
      "name": "@afterScenarios"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is on signup landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Enter invalid user details and submit",
  "rows": [
    {
      "cells": [
        "Rakshandha",
        "Kannappan",
        "Canada",
        "8073576926",
        "Selenium@1234567",
        "Selenium@1234567",
        "1990 - 2001",
        "16",
        "iamrakshandha@gmail"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Invalid email popup",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionLoginSignUp.user_is_on_signup_landing_page()"
});
formatter.result({
  "duration": 137600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionLoginSignUp.enter_invalid_user_details_and_submit(DataTable)"
});
formatter.result({
  "duration": 4747968800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionLoginSignUp.invalid_email_popup()"
});
formatter.result({
  "duration": 41040600,
  "status": "passed"
});
formatter.after({
  "duration": 4362975000,
  "status": "passed"
});
formatter.before({
  "duration": 14559495900,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "SignUp valid email",
  "description": "",
  "id": "login/signup;signup-valid-email",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@run"
    },
    {
      "line": 13,
      "name": "@pre-requisite1"
    },
    {
      "line": 14,
      "name": "@afterScenarios"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "User is on signup landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Enter valid user details and submit",
  "rows": [
    {
      "cells": [
        "Rakshandha",
        "Kannappan",
        "Canada",
        "8073576926",
        "Selenium@1234567",
        "Selenium@1234567",
        "1990 - 2001",
        "16",
        "iamrakshandha@gmail.com"
      ],
      "line": 18
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "opt",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionLoginSignUp.user_is_on_signup_landing_page()"
});
formatter.result({
  "duration": 67400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionLoginSignUp.enter_valid_user_details_and_submit(DataTable)"
});
formatter.result({
  "duration": 13657078300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionLoginSignUp.opt()"
});
formatter.result({
  "duration": 79671600,
  "status": "passed"
});
formatter.after({
  "duration": 4376781800,
  "status": "passed"
});
formatter.before({
  "duration": 17664676900,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "SignUp using existing user deatils",
  "description": "",
  "id": "login/signup;signup-using-existing-user-deatils",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@run"
    },
    {
      "line": 22,
      "name": "@pre-requisite1"
    },
    {
      "line": 23,
      "name": "@afterScenarios"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "User is on signup landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "Enter existing user details and submit",
  "rows": [
    {
      "cells": [
        "Rakshandha",
        "Kannappan",
        "India",
        "9003190155"
      ],
      "line": 27
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "User already existing popup",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionLoginSignUp.user_is_on_signup_landing_page()"
});
formatter.result({
  "duration": 84100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionLoginSignUp.enter_existing_user_details_and_submit(DataTable)"
});
formatter.result({
  "duration": 985669700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionLoginSignUp.user_already_existing_popup()"
});
formatter.result({
  "duration": 223979300,
  "status": "passed"
});
formatter.after({
  "duration": 4509960400,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 33,
  "name": "Login invalid email",
  "description": "",
  "id": "login/signup;login-invalid-email",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 30,
      "name": "@run"
    },
    {
      "line": 31,
      "name": "@pre-requisite2"
    },
    {
      "line": 32,
      "name": "@afterScenarios"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "User is on login landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "Enter \u003cemailID\u003e \u003cpassword\u003e and user submits",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "Login \"Deals\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 37,
  "name": "",
  "description": "",
  "id": "login/signup;login-invalid-email;",
  "rows": [
    {
      "cells": [
        "emailID",
        "password"
      ],
      "line": 38,
      "id": "login/signup;login-invalid-email;;1"
    },
    {
      "cells": [
        "firstname@gmail.com",
        "Selinium@1234567"
      ],
      "line": 39,
      "id": "login/signup;login-invalid-email;;2"
    },
    {
      "cells": [
        "lastname@gmail.com",
        "Selinium@1234567"
      ],
      "line": 40,
      "id": "login/signup;login-invalid-email;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 13210686100,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Login invalid email",
  "description": "",
  "id": "login/signup;login-invalid-email;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 30,
      "name": "@run"
    },
    {
      "line": 32,
      "name": "@afterScenarios"
    },
    {
      "line": 31,
      "name": "@pre-requisite2"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "User is on login landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "Enter firstname@gmail.com Selinium@1234567 and user submits",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "Login \"Deals\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionLoginSignUp.user_is_on_login_landing_page()"
});
formatter.result({
  "duration": 84000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "firstname@gmail.com",
      "offset": 6
    },
    {
      "val": "Selinium@1234567",
      "offset": 26
    }
  ],
  "location": "StepDefinitionLoginSignUp.enter_and_user_submits(String,String)"
});
formatter.result({
  "duration": 3516334000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Deals",
      "offset": 7
    }
  ],
  "location": "StepDefinitionLoginSignUp.login_something(String)"
});
formatter.result({
  "duration": 109027700,
  "status": "passed"
});
formatter.after({
  "duration": 4087430100,
  "status": "passed"
});
formatter.before({
  "duration": 12259404600,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "Login invalid email",
  "description": "",
  "id": "login/signup;login-invalid-email;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 30,
      "name": "@run"
    },
    {
      "line": 32,
      "name": "@afterScenarios"
    },
    {
      "line": 31,
      "name": "@pre-requisite2"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "User is on login landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "Enter lastname@gmail.com Selinium@1234567 and user submits",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "Login \"Deals\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionLoginSignUp.user_is_on_login_landing_page()"
});
formatter.result({
  "duration": 46700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lastname@gmail.com",
      "offset": 6
    },
    {
      "val": "Selinium@1234567",
      "offset": 25
    }
  ],
  "location": "StepDefinitionLoginSignUp.enter_and_user_submits(String,String)"
});
formatter.result({
  "duration": 4085532700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Deals",
      "offset": 7
    }
  ],
  "location": "StepDefinitionLoginSignUp.login_something(String)"
});
formatter.result({
  "duration": 107263600,
  "status": "passed"
});
formatter.after({
  "duration": 150901300,
  "status": "passed"
});
formatter.before({
  "duration": 13586482200,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "Login valid email",
  "description": "",
  "id": "login/signup;login-valid-email",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 43,
      "name": "@run"
    },
    {
      "line": 44,
      "name": "@pre-requisite2"
    },
    {
      "line": 45,
      "name": "@afterScenarios"
    }
  ]
});
formatter.step({
  "line": 47,
  "name": "User is on login landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 48,
  "name": "Enter \"swebdriver1@gmail.com\" and \"Selenium@1234567\"",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "Login \"Successful\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionLoginSignUp.user_is_on_login_landing_page()"
});
formatter.result({
  "duration": 100900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "swebdriver1@gmail.com",
      "offset": 7
    },
    {
      "val": "Selenium@1234567",
      "offset": 35
    }
  ],
  "location": "StepDefinitionLoginSignUp.enter_something_and_something(String,String)"
});
formatter.result({
  "duration": 16246129300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Successful",
      "offset": 7
    }
  ],
  "location": "StepDefinitionLoginSignUp.login_something(String)"
});
formatter.result({
  "duration": 52280800,
  "status": "passed"
});
formatter.after({
  "duration": 4225500700,
  "status": "passed"
});
});