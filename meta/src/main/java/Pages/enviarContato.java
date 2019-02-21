package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class enviarContato {
	private WebDriver navegador;
	public enviarContato (WebDriver navegador) {
		this.navegador = navegador;	
}
	
	
	
	public enviarContato clicarMenuContato() {
		
		navegador.findElement(By.xpath("//*[@id=\"contatomenu\"]/a")).click();
		
		return this;
		}
	

public enviarContato tipoNome(String nome) {
	navegador.findElement(By.id("name")).sendKeys(nome);
	return this;
	
}
public enviarContato tipoemail(String email) {
	navegador.findElement(By.id("email")).sendKeys(email);
	return this;
	
}
public enviarContato tipoTelefone(String telefone) {
	navegador.findElement(By.id("phone")).sendKeys(telefone);
	return this;
}
public enviarContato tipoMensagem(String mensagem) {
	navegador.findElement(By.id("message")).sendKeys(mensagem);
	return this;

}
public enviarContato clicarBotaoEnviar() {
	navegador.findElement(By.xpath("//*[@id=\"enviarbotao\"]")).click();
	return this;

}}