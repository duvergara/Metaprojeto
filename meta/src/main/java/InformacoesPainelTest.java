import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Pages.enviarContato;
import suporte.Generator;
import suporte.Screenshot;
import suporte.Web;


public class InformacoesPainelTest {
	
	private WebDriver navegador; 
		
		@Before
		public void setUp() {
			navegador = Web.creatChrome();
		}

		@Test
		public void  enviarContatopage() throws Exception{
			Thread.sleep(5000);
			new enviarContato(navegador)
			.clicarMenuContato()
			.tipoNome("Eduardo Moises da Silva")
			.tipoemail("duvergara@live.com")
			.tipoTelefone("11964366922")
			.tipoMensagem("teste positivo")
			.clicarBotaoEnviar();
			
			navegador.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);  
			String textoElement = navegador.findElement(By.id("success")).getText();
	        assertEquals("Sua mensagem foi enviada com sucesso.", textoElement);
			
			 Thread.sleep(5000);
			    Screenshot.tirar(navegador, "/Users/emoisess/Desktop/meta/test-reports/" + Generator.dataHoraparaArq()+ "contatopositivo.png");
			   
		}
		
		@Test
		public void  enviarContatopageemBraco() throws Exception{
			Thread.sleep(5000);
			new enviarContato(navegador)
			.clicarMenuContato()
			.tipoNome("Eduardo Moises da Silva")
			.tipoemail("duvergara@live.com")
			.tipoTelefone("")
			.tipoMensagem("teste positivo")
			.clicarBotaoEnviar();
			
			navegador.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);  
			String textoElement = navegador.findElement(By.xpath("//*[@id=\"Phone\"]/p/ul/li")).getText();
	        assertEquals("Por favor informe seu telefone.", textoElement);
			
			 Thread.sleep(5000);
			    Screenshot.tirar(navegador, "/Users/emoisess/Desktop/meta/test-reports/" + Generator.dataHoraparaArq()+ "contatonegativo banco.png");
			   
		}	
			
		
		
		@Test
		public void  enviarContatopageEmailInvalido() throws Exception{
			Thread.sleep(5000);
			new enviarContato(navegador)
			.clicarMenuContato()
			.tipoNome("Eduardo Moises da Silva")
			.tipoemail("duvergara")
			.tipoTelefone("11964366922")
			.tipoMensagem("teste positivo")
			.clicarBotaoEnviar();
			
			navegador.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);  
			String textoElement = navegador.findElement(By.xpath("//*[@id=\"Email\"]/p/ul/li")).getText();
	        assertEquals("Formato de e-mail inválido", textoElement);
			
			 Thread.sleep(5000);
			    Screenshot.tirar(navegador, "/Users/emoisess/Desktop/meta/test-reports/" + Generator.dataHoraparaArq()+ "contatonegativoemail.png");
		
		}	    
			    
			    @After
		        public void encerrarApp(){
				navegador.quit();;
			
		{
			
			
		
	}

}}
