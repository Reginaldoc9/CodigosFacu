package arraylixo;

import java.util.ArrayList;

public class ArrayLixo {

    public static void main(String[] args) {
        
        Automovel carro = new Automovel("Fiat","Palio",2.0);
        Automovel carro2 = new Automovel("Mercedez","Bus",2.0);
        
        ArrayList<Automovel>Carro = new ArrayList<>();
        Carro.add(carro);
        Carro.add(carro2);
        System.out.println(Carro);
        
    }
    
}
