package Sist_IPTU;

public class Apartamento extends Imovel {
    
    private Boolean PossuiElevador;
 
    public Apartamento(Municipio municipio, Double areaM2, Integer vagas, Boolean PossuiElevador){
        super(municipio, areaM2, vagas);
        this.PossuiElevador = PossuiElevador;
    }  


    }

   

