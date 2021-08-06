#Author: fabioavilamacedo@gmail.com


Feature: Pesquisar produto "Faded Short Sleeve"
  Eu como usuario quero pesquisar produto na automationpractice

  @pesquisar
  
  Scenario: Pesquisar produto e ver detalhes
   
    Given que eu esteja no site "http://automationpractice.com/index.php"
    
    When pesquiso por "Faded Short Sleeve"
    
    Then vejo detalhes do produto
    

  