public class Main {
    public static void main(String[] args) {
        // Instancia um objeto iPhone
        iPhone meuIphone = new iPhone();
        
        // Utilizando funcionalidades do Reprodutor Musical
        meuIphone.getReprodutorMusical().tocar();
        meuIphone.getReprodutorMusical().selecionarMusica("Imagine - John Lennon");
        meuIphone.getReprodutorMusical().pausar();
        
        // Utilizando funcionalidades do Aparelho Telefônico
        meuIphone.getAparelhoTelefonico().ligar("123-456-7890");
        meuIphone.getAparelhoTelefonico().atender();
        meuIphone.getAparelhoTelefonico().iniciarCorreioVoz();
        
        // Utilizando funcionalidades do Navegador
        meuIphone.getNavegador().exibirPagina("www.example.com");
        meuIphone.getNavegador().adicionarNovaAba();
        meuIphone.getNavegador().atualizarPagina();
    }
}
