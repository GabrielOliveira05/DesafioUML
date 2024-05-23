
public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical{

	@Override
	public void tocar() {
		
		System.out.println("Tocando música");
	}

	@Override
	public void pausar() {
		System.out.println("Música pausada");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Música selecionada:" + musica);
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz iniciado");
		
	}

	@Override
	public void atender() {
		System.out.println("Ligação atendida");
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para o número: " + numero);
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada");
		
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Encaminhado para a URL: " + url);
		
	}

	
	

}
