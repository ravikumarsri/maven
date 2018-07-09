Feature: Test facebook smoke scenario

  Scenario Outline: Test login with valid credentials
    Given Open Firefox and start application
    When I enter valid "<username>" and "<password>"
    Then User should able to login sucessfully
    Then Closer the application.

    Examples: 
      | username                 | password     |
      | ds.sridhar09@gmail.com   | mamta@sri143 |
      | mamta.hirawat1@gmail.com | mamta@sri143 |
