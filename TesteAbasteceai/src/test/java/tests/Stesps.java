package tests;

import elementos.Elements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Stesps {
	
	Metodos metodos = new Metodos();
	Elements elementos = new Elements();
	
	
	@Given("^que eu esteja no site \"([^\"]*)\"$")
	public void que_eu_esteja_no_site(String url) throws Throwable {
		metodos.abrirBrowser(url, "CHROME");
		
		
	   
	}

	@When("^pesquiso por \"([^\"]*)\"$")
	public void pesquiso_por(String item) throws Throwable {
		
		metodos.escrever(elementos.pesquisar, item);
		metodos.pausa(2000);
		metodos.submit(elementos.pesquisar);
		
		
	    
	}

	@Then("^vejo detalhes do produto$")
	public void vejo_detalhes_do_produto() throws Throwable {
		metodos.clicar(elementos.detalhes);
		metodos.fechar();
	    

}
}