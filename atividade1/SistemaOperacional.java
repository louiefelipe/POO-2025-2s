package atividade1;

public class SistemaOperacional {
    private Computador computador;
    private Programa programa;

    public SistemaOperacional(Computador computador, Programa programa){
        this.computador = computador;
        this.programa = programa;
    }
    public Computador getComputador(){
        return this.computador;
    }

    public void setComputador(Computador computador){
        if(computador != null){
            this.computador = computador;
        }
    }

    public Programa getPrograma(){
        return this.programa;
    }

    public void setPrograma(Programa programa){
        if(programa != null){

        this.programa = programa;
        }
    }
    
}
