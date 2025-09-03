package SISTEMA_RADAR;

public class Radar {
    private Integer limiteVelocidade;
    private String modelo;
    private String localizacao;

    public Radar(Integer limiteVelocidade, String modelo, String localizacao){
        this.limiteVelocidade = limiteVelocidade;
        this.modelo = modelo;
        this.localizacao = localizacao;

    }

    public void emitirNotificacao(String placa, Integer velocidadeAvaliada){
        System.out.println("Limite de velocidade: "+this.limiteVelocidade);
        System.out.println("Velocidade avaliada: "+velocidadeAvaliada);
        System.out.println("Placa: "+placa);

    }

    public Integer getLimiteVelocidade(){
        return this.limiteVelocidade;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getLocalizacao(){
        return this.localizacao;
    }
    
    public void avaliarVelocidade(Carro c){
        if (c.getVelocidade() > this.limiteVelocidade){
            emitirNotificacao(c.getPlaca(), c.getVelocidade());

        }

    }

}
