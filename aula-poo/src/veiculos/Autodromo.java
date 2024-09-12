package veiculos;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("129312");
        jeep.ligar();
    
        Moto cb1000 = new Moto();
        cb1000.setChassi("q13453 ");
        cb1000.ligar();

        /*Veiculo teste = cb1000;
        teste.ligar();*/

        
    }
}
