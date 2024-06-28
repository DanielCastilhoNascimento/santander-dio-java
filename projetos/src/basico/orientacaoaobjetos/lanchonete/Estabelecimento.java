
package orientacaoaobjetos.lanchonete;
import orientacaoaobjetos.lanchonete.atendimento.cozinha.Almoxarife;
import orientacaoaobjetos.lanchonete.atendimento.cozinha.Cozinheiro;
import orientacaoaobjetos.lanchonete.area.cliente.Cliente;

public class Estabelecimento {

    public static void main(String[] args) {

		Cozinheiro cozinheiro = new Cozinheiro();
		Atendente atendente = new Atendente();
		Cliente cliente = new Cliente();

		atendente.apresentarCardapio();
		cliente.escolherLanche();
		cliente.fazerPedido();

		
		//ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();;
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();

		atendente.servindoMesa();
		cliente.pagarConta();
		atendente.receberPagamento();	
	
	}

}
