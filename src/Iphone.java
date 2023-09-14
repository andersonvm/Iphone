public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

  @Override
  public void exibirPagina() {
    System.out.println("Exibindo a página");
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Adicionando nova aba");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando a página");
  }

  @Override
  public void ligar() {
    System.out.println("Efetuando ligando");
  }

  @Override
  public void atender() {
    System.out.println("Atendendo ligação");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz");
  }

  @Override
  public void tocar() {
    System.out.println("Tocando música");
  }

  @Override
  public void pausar() {
    System.out.println("Pausando a música");
  }

  @Override
  public void selecionarMusica() {
    System.out.println("Selecionando a música");
  }

  public static void main(String[] args) {
    Iphone ip = new Iphone();

    ip.ligar();
    ip.atender();
    ip.iniciarCorreioVoz();
    ip.tocar();
    ip.pausar();
    ip.selecionarMusica();
    ip.exibirPagina();
    ip.adicionarNovaAba();
    ip.atualizarPagina();
  }

}
