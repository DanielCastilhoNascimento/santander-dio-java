package orientacaoaobjetos.mensageria.apps;

public abstract class ServicoMensageria {

    public abstract void enviarMensagem();

	public abstract void receberMensagem();
	
	//métodos privadas, visíveis somente na classe
	protected void validarConectadoInternet() {

		// visibilidade do protected é para o pacote e as classes filhas, criado pacote apps. Assim
		// não fica visivel ao Computador do usuario.

		System.out.println("Validando se está conectado a internet");
	}
	protected void salvarHistoricoMensagem() {							
		System.out.println("Salvando o histórico da mensagem");
	}

}
