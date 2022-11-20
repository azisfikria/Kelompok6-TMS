Feature: Login User

  Scenario: TCC.TMS.058 User invalid login TMS
    When TCC.TMS.058 User go to Web Dika TMS
    And TCC.TMS.058 User enter username password invalid TMS
    And TCC.TMS.058 User click button login invalid TMS
    Then TCC.TMS.058 User invalid credentials TMS

  Scenario: TCC.TMS.059 User valid login TMS
    When TCC.TMS.059 User enter username password valid TMS
    And TCC.TMS.059 User click button login valid TMS
    Then TCC.TMS.059 User valid credentials TMS