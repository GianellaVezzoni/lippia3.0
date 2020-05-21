Feature: As a user i need to search in udemy to find a course

  @Smoke
  Scenario: The user search by "java"
    Given The user is in udemy page
    When The user search for word java
    Then The user verify that results are shown properly

  @Smoke
  Scenario: The user search by "automation"
    Given The user is in udemy page
    When The user search for word automation
    Then The user verify that results are shown properly

  @Smoke
  Scenario: The user search by "docker"
    Given The user is in udemy page
    When The user search for word docker
    Then The user verify that results are shown properly

  @Smoke
  Scenario: The user search by "design"
    Given The user is in udemy page
    When The user search for word design
    Then The user verify that results are shown properly

  @Smoke
  Scenario: The user search by "php" and filter by price
    Given The user is in udemy page
    When The user search for word php
    And The user filter by free courses
    Then The user verify that results are shown properly