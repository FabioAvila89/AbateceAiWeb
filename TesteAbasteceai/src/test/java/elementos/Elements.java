package elementos;

import org.openqa.selenium.By;

public class Elements {
	
	public By pesquisar = By.id("search_query_top");
	
	public By detalhes =  By.cssSelector("#best-sellers_block_right > div > ul > li:nth-child(1) > a");
	
	public By buttonAddToCart = By.id("add_to_cart");
	
	public By proceedToCheckout = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span");
	public By proceedToCheckout2 = By.cssSelector("#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium");	
	public By emailAddress = By.id("email");
	public By senha = By.id("passwd");
	public By sign = By.id("SubmitLogin");
	public By proceedToCheckout3 = By.cssSelector("#center_column > form > p > button");
	public By iGree = By.id("cgv");
	public By proceedToCheckout4 = By.name("processCarrier");
	public By payByBank = By.cssSelector("#HOOK_PAYMENT > div:nth-child(1) > div > p > a");
	public By Confirm = By.cssSelector("#cart_navigation > button");
	
}
