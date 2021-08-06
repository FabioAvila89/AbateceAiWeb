package tests;

import elementos.Elements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class stepsCompra {
	
	Metodos metodos = new Metodos();
	Elements el = new Elements();
	
	@Given("eu esteja no site {string}")
	public void eu_esteja_no_site(String url) {
		metodos.abrirBrowser(url, "CHROME");
	    
	}

	@When("pesquiso um produto")
	public void pesquiso_um_produto() throws InterruptedException {
		metodos.escrever(el.pesquisar, "Faded Short Sleeve");
		metodos.pausa(2000);
		metodos.submit(el.pesquisar);
		metodos.clicar(el.detalhes);
		metodos.clicar(el.buttonAddToCart);
		metodos.pausa(3000);
		metodos.clicar(el.proceedToCheckout);
		metodos.pausa(3000);
		
		metodos.clicar(el.proceedToCheckout2);
		metodos.escrever(el.emailAddress, "teste.teste@teste.com");
		metodos.escrever(el.senha, "12345");
		metodos.clicar(el.sign);
		metodos.clicar(el.proceedToCheckout3);
		metodos.clicar(el.iGree);
		metodos.clicar(el.proceedToCheckout4);
		metodos.clicar(el.payByBank);
		
	}

	@Then("finalizo a compra")
	public void finalizo_a_compra() {
		metodos.clicar(el.Confirm);
	    metodos.fechar();
	}
	

}
