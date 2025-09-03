package SISTEMA_RADAR;

public class Carro {
    private Integer ano;
    private String modelo;
    private String placa;
    private Integer velocidade;

    public Carro(String placa, Integer velocidade, Integer ano, String modelo){

        this.placa = placa;
        this.velocidade = velocidade;
        this.ano = ano;
        this.modelo = modelo;

    }

    public Integer getVelocidade(){
        return this.velocidade;
    }

    public void setVelocidade(Integer velociadade){
        if(velociadade != null && velociadade > 0){
            this.velocidade = velociadade;

        }
    }

    public String getPlaca(){
        return this.placa;
    }

    public Integer getAno(){
        return this.ano;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void acelerar(){
        this.velocidade += 5;
    }

    public void frear (){
        if (this.velocidade >= 0){
            this.velocidade -= 5;
    }

    

    }
}
