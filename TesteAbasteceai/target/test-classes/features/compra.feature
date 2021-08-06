#Author: your.email@your.domain.com


Feature: realizzar compra
  Eu como usuario quero realizar uma compra

  @compra
  Scenario: realizaar compra
    
    Given eu esteja no site "http://automationpractice.com/index.php"
   
    When pesquiso um produto
   
    Then finalizo a compra
    
 