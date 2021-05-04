public class Cachorro extends Lobo{
    @Override
    public void emitirSom(){
        System.out.println("Ua Ua Ua Ua");
    }
    public void reagir(String frase){
        if(frase.equalsIgnoreCase("Toma comida")||frase.equalsIgnoreCase("Ola")){
            System.out.println("Abanar e Latir");
        }else{
            System.out.println("Rosnar");
        }
    }
    public void reagir(int hora, int men){
        if(hora<12){
            System.out.println("Abanar");
        }else if(hora>= 18){
            System.out.println("Ignora");
        }else {
            System.out.println("Abanar e Latir");
        }
    }
    public void reagir(boolean dono){
        if(dono==true){
            System.out.println("Abanar");
        }else{
            System.out.println("Rosnar e Latir");
        }
    }
    public void reagir(int idade, double peso){
        if (idade<5){
            if (peso<10){
                System.out.println("Abanar");
            }else{
                System.out.println("Latir");
            }
        }else{
            if (peso<10){
                System.out.println("Rosnar");
            }else {
                System.out.println("Ignorar");
            }
        }
    }

}
