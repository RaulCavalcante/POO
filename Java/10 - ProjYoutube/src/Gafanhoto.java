public class Gafanhoto extends Pessoa{

    private String login;
    private int totAssistindo;

    public Gafanhoto(String nome, String sexo, int idade, String login){
        super(nome,sexo,idade);
        this.login = login;
        this.totAssistindo = 0;
    }

    @Override
    public String toString(){
        return super.toString()+" login = "+this.login+" , totAssistindo = "+this.totAssistindo+" }";
    }


    public void setLogin(String login){this.login=login;}
    public void setTotAssistindo(int totAssistindo){this.totAssistindo=totAssistindo;}
    public String getLogin(){return this.login;}
    public int getTotAssistindo(){return this.totAssistindo;}


}
