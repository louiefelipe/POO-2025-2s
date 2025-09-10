package Sist_IPTU;

public class MainCalculo {

    public static void main(String[] args) {
        Municipio Brasilia = new Municipio("Brasilia", "DF", 65.5);

        Apartamento apt = new Apartamento(Brasilia, 62.0, 1, true);

        System.out.println("IPTU calculado no valor de R$: " + apt.calcularIPTU());
    
    }
}