package collections;
import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {

        HashMap<String, String> capitais = new HashMap<>();
        capitais.put("Brasil", "Brasília");
        capitais.put("Japão", "Tóquio");
        capitais.put("França", "Paris");

        for (String pais : capitais.keySet()) {
            System.out.println("País: " + pais + " - Capital: " + capitais.get(pais));
        }

        if (capitais.containsKey("Argentina")) {
            System.out.println("A capital da Argentina é: " + capitais.get("Argentina"));
        } else {
            System.out.println("Argentina não está no mapa.");
        }
    }
}


//Associa uma chave a um valor, permitindo o armazenamento e a recuperação eficiente de dados com base em chaves únicas.