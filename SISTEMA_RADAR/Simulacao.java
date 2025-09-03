package SISTEMA_RADAR;

public class Simulacao {
        public static void main(String[] args) {
            Carro opala = new Carro("CAR2P90", 
            0, 
            76, 
            "Comodoro");
    
            Radar radar = new Radar(60, 
            "Pardal", 
            "Pistão Sul");

            opala.acelerar();
            opala.acelerar();
            opala.acelerar();
            opala.acelerar();
            opala.acelerar();
            opala.acelerar();
            opala.acelerar();
            opala.acelerar();
            opala.acelerar();
            opala.acelerar();
            opala.acelerar();
            opala.acelerar();
            opala.acelerar();
            opala.acelerar();

            
           radar.avaliarVelocidade(opala);

            opala.acelerar();
            opala.acelerar();

            opala.frear();

            radar.avaliarVelocidade(opala);

        }
    }
