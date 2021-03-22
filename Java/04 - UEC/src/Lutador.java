public class Lutador {

    private String nome;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador (String nome, float peso, int vitorias, int derrotas, int empates){
        this.nome = nome;
        this.peso = peso;
        this.categoria = definirCategoria(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    private void setNome(String nome){this.nome = nome;}
    private void setPeso(int peso){this.peso = peso;}
    private void setCategoria(String categoria){this.categoria = categoria;}
    private void setVitorias(int vitoria){this.vitorias = vitoria;}
    private void setDerrota(int derrota){this.derrotas = derrota;}
    private void setEmpates(int empates){this.empates = empates;}

    public String getNome(){return this.nome;}
    private float  getPeso(){return this.peso;}
    public String   getCategoria(){return this.categoria;}
    private int  getVitorias(){return this.vitorias;}
    private int  getDerrotas(){return this.derrotas;}
    private int  getEmpates(){return this.empates;}

    private String definirCategoria (float peso){
        String categoriaDefinida = null;
        if (peso<5.2){
            categoriaDefinida = "Peso Invalido";
        } else if (peso<73.3){
            categoriaDefinida = "Peso Pena";
        }else if (peso<80.9){
            categoriaDefinida = "Peso Medio";
        }else if (peso<120.2){
            categoriaDefinida = "Peso Pesado";
        }else{
            categoriaDefinida = "Peso Invalido";
        }
        return categoriaDefinida;
    }

    public void apresentacao(){System.out.println("\nO Lutador "+getNome()+" com o peso "+getPeso()+" da categoria "+getCategoria()+" com " +
            "o total de "+getVitorias()+" vitoria(s), "+getEmpates()+" empate(s), "+getDerrotas()+" derrota(s)\n");}
    public void status(){System.out.println("\nNome: "+getNome()+"\nVitoria(s): "+getVitorias()+"\nEmpate(s): "+getEmpates()+"\nDerrota(s): "+getDerrotas()
    );}
    public void ganhaLuta(){ this.setVitorias((getVitorias()+1));}
    public void empatarLuta(){ this.setEmpates((getEmpates()+1));}
    public void perdeLuta(){ this.setDerrota((getDerrotas()+1));}


}
