Feature: Login Admin

  Scenario: TCC.TMS.001 Admin go to web correct URL
    When TCC.TMS.001 Admin go to web correct URL
    Then TCC.TMS.001 dmin on web TMS

  Scenario: TCC.TMS.002 Admin go to web incorrect URL
    When TCC.TMS.002 Admin enter incorrect URL
    Then TCC.TMS.002 Admin on page 404 not found

  Scenario: TCC.TMS.003 Admin login valid
    When TCC.TMS.003 Admin go to web TMS
    And TCC.TMS.003 Admin input username password valid
    And TCC.TMS.003 Admin click login
    Then TCC.TMS.003 Admin on dashboard page

  Scenario: TCC.TMS.004 Admin login invalid
    When TCC.TMS.004 Admin input username password invalid
    And TCC.TMS.004 Admin click login
    Then TCC.TMS.004 Pop up notification Wrong username or password

  Scenario: TCC.TMS.005 Admin login null
    When TCC.TMS.005 Admin null username password
    And TCC.TMS.005 Admin click login
    Then TCC.TMS.005 Pop notifcation please fill out this field

  Scenario: TCC.TMS.006 Admin logout
    When TCC.TMS.005 Admin on dashboard page
    And TCC.TMS.005 Admin click profile
    And TCC.TMS.005 Admin click logout
    Then TCC.TMS.005 Admin on login page