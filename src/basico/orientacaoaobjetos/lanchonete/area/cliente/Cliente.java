package orientacaoaobjetos.lanchonete.area.cliente;

import java.util.Scanner;

public class Cliente {

    public void escolherLanche() {

	}
	public void fazerPedido() {
		System.out.println("FAZENDO O PEDIDO");
	}
	public void pagarConta() {
		consultarSaldoAplicativo();
		System.out.println("PAGANDO A CONTA");
	}
	private void consultarSaldoAplicativo() {
		System.out.println("ACESSANDO O APP DO BANCO");
	}
}

