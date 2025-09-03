package atividade1;

public class Computador {
    private Integer memoriaRAM;
    private Integer SSD;
    private Float operacoesPseg;

    public Computador(Integer memoriaRAM, Integer SSD, Float operacoesPseg){
        this.memoriaRAM = memoriaRAM;
        this.SSD = SSD;
        this.operacoesPseg = operacoesPseg;
    }

    public Integer getMemoriaRAM(){
        return this.memoriaRAM;
    }

    public void setMemoriaRAM(Integer memoriaRAM){
        if(memoriaRAM != null && memoriaRAM < 4){
        this.memoriaRAM = memoriaRAM;
        
        }
    }

    public Integer getSSD(){
        return this.SSD;
    }

    public void setSSD(Integer SSD){
        if(SSD != null && SSD < 0 ){
            this.SSD = SSD;
        }
    }

    public Float getOperacoesPseg(){
        return this.operacoesPseg;
    }

    public void setOperacoesPseg(Float operacoesPseg){
        if(operacoesPseg != null && operacoesPseg < 0 ){
            this.operacoesPseg = operacoesPseg;
        }
    }

}
