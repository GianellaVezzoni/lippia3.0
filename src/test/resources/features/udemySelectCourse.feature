Feature: As a user i need to search a course in udemy
  And select determinate course

  @Smoke
  Scenario Outline: The user search by "php" and select a course
    Given The user is in udemy page
    When The user search for word php
    And The user select the <number> course
    Then The user verify that the course selected is correct
  Examples:
    |number|
    |1|
    |2|
    |5|
    |7|
