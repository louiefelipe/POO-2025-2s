package atividade1;

public class SistemaOperacional {
    private Computador computador;

    public SistemaOperacional(Computador computador){
        this.computador = computador;
    }
    public Computador getComputador(){
        return this.computador;
    }

    public void setComputador(Computador computador){
        if(computador != null){
            this.computador = computador;
        }
    }

    public Boolean executarPrograma(Programa p){
        return true;
    }
    
}
