Feature: Create an user on Reqres.in
  I want to create an user

  Scenario: Creation an user
    When you create an user
     | name     | job  |
     | joel     | java |
    Then I should see the user created