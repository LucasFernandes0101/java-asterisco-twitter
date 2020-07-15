package asterico;
//contém os atributos necessarios para salvar todas as conversões
public class Textos {
    //atributo com o texto que o usuário digitou
    private String texto;
    //atributo com o texto que o usuário digitou convertido para asteriscos
    private String Asterisco;

    //retorna o texto que o usuário digitou
    public String getTexto() {
        return texto;
    }

    //altera o texto que o usuário digitou
    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    //retorna o texto que o usuário digitou em asteriscos
    public String getAsterisco() {
        return Asterisco;
    }
    
    //alterna o texto que o usuário digitou em asteriscos
    public void setAsterisco(String Asterisco) {
        this.Asterisco = Asterisco;
    }
    
    
}