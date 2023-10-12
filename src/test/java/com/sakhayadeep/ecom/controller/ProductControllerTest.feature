Feature: Product Controller Test
  Background:
    * url 'http://localhost:8081'
  Scenario: Test Get Products API
    Given path '/products'
    When method GET
    Then status 200

  Scenario: Test Get Product By Id API
    Given path '/product'
    And path '2'
    When method GET
    Then status 200
    And print response
    And match response.productName == 'test product'