package atividade1;

public class Main {
    public static void main(String[] args) {
        Computador PC = new Computador(16, 
        400, 8, 3.8f);
    
        SistemaOperacional sistema = new SistemaOperacional(PC);

        Programa programa = new Programa(8, 100, 200);
    
        
        Programa p1 = new Programa(16, 400, 300);
        Programa p2 = new Programa(8, 450, 200);
        Programa p3 = new Programa(32, 200, 500);

        sistema.executarPrograma(p1);
        sistema.executarPrograma(p2);
        sistema.executarPrograma(p3);

    }
}

