@Youtube
Feature: as Android user, I wanna log in to Google and play a video on YouTube

  Scenario Outline: Reproduce a video on the Youtube website
    Given I open the Youtube APP
    When  I enter the credentials of <user> with <password> to acces Youtube and play the <video>
    Then  I verify that video reproduced equals to the searched video

    Examples:
      |      user         | password   |             video                |
      | esuarca@gmail.com | 1026148163 | One Strange Rock Day of the Dead |
