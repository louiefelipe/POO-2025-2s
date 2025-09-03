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

        if(p.getSSDOcupado() > computador.getSSD()){
            System.out.println("ERRO na instalação: SSD insuficiente\n");
            float tempoExecucao = p.getQuantidadeOperacoes() / (computador.getOperacoesPseg() * computador.getNucleos());
            System.out.println("Tempo de execução: "+ tempoExecucao + " segundos\n-------------------------------------");

            return false;
        }
        
        if(p.getMemoriaRAMAlocada() > computador.getMemoriaRAM()){
            System.out.println("ERRO na instalação: Memória RAM insuficiente\n");
             float tempoExecucao = p.getQuantidadeOperacoes() / (computador.getOperacoesPseg() * computador.getNucleos());
             System.out.println("Tempo de execução: "+ tempoExecucao + " segundos\n-------------------------------------");

             return false;
        }

         float tempoExecucao = p.getQuantidadeOperacoes() / (computador.getOperacoesPseg() * computador.getNucleos());
        System.out.println("Programa executado com êxito!\n");
        System.out.println("Tempo de execução: "+ tempoExecucao + " segundos\n-------------------------------------");

        return true;
    
    }

    
}
