$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Employee.feature");
formatter.feature({
  "line": 1,
  "name": "Test CRUD methods in Sample Employee REST API testing",
  "description": "",
  "id": "test-crud-methods-in-sample-employee-rest-api-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Get All Employees record",
  "description": "",
  "id": "test-crud-methods-in-sample-employee-rest-api-testing;get-all-employees-record",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "GET all employee service api endpoint",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Send a GET HTTP request",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I receive get valid Response",
  "keyword": "Then "
});
formatter.match({
  "location": "EmployeeSteps.i_set_get_all_employee_service_api_endpoint()"
});
formatter.result({
  "duration": 239827286,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.send_a_get_http_request()"
});
formatter.result({
  "duration": 4351860691,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.i_receive_get_valid_response()"
});
formatter.result({
  "duration": 43040365,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "create employee",
  "description": "",
  "id": "test-crud-methods-in-sample-employee-rest-api-testing;create-employee",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "Post employee data",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "send a Post request",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "recive the valide data",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I validate the user",
  "keyword": "And "
});
formatter.match({
  "location": "EmployeeSteps.post_employee_data()"
});
formatter.result({
  "duration": 76231,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.send_a_Post_request()"
});
formatter.result({
  "duration": 1947744216,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.recive_the_vail_data()"
});
formatter.result({
  "duration": 1303891,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeSteps.i_validate_the_user()"
});
formatter.result({
  "duration": 213902,
  "status": "passed"
});
});