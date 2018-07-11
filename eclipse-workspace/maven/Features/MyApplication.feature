Feature: Test facebook smoke scenario

  Scenario: Test login with valid credentials
    Given Open Firefox and start application
    When I enter valid username and password
      | ds.sridhar09@gmail.com | mamta@sri143 |
    Then User should able to login sucessfully
    Then Closer the application.
