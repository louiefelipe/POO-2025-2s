package atividade1;

public class Programa {
    private Integer memoriaRAMAlocada;
    private Integer SSDOcupado;
    private Integer nucleos;
    private Integer quantidadeOperacoes;

    public Programa(Integer memoriaRAMAlocada, Integer SSDOcupado, Integer nuceleos, Integer quantidadeOperacoes){
        this.memoriaRAMAlocada = memoriaRAMAlocada;
        this.SSDOcupado = SSDOcupado;
        this.nucleos = nuceleos;
        this.quantidadeOperacoes = quantidadeOperacoes;
    }

    public Integer getMemoriaRAMAlocada(){
        return this.memoriaRAMAlocada;
    }

    public void setMemoriaRAMAlocada(Integer memoriaRAMAlocada){
        if(memoriaRAMAlocada != null && memoriaRAMAlocada < 0){
            this.memoriaRAMAlocada = memoriaRAMAlocada;
        }
    }

    public Integer getSSDOcupado(){
        return this.SSDOcupado;
    }
    
    public void setSSDOcupado(Integer SSDOcupado){
        if(SSDOcupado != null && SSDOcupado < 0){
            this.SSDOcupado = SSDOcupado;
        }
    }

    public Integer getNucleos(){
        return this.nucleos;
    }

    public void setNucleos(Integer nucleos){
        if(nucleos != null && nucleos < 0){
            this.nucleos = nucleos;
        }
    }

    public Integer getQuantidadeOperacoes(){
        return this.quantidadeOperacoes;
    }

    public void setQuantidadeOperacoes(Integer quantidadeOperacoes){
        if(quantidadeOperacoes != null && quantidadeOperacoes < 0){
            this.quantidadeOperacoes = quantidadeOperacoes;
        }
    }

}
