package SISTEMA_RADAR;

public class Simulacao {
        public static void main(String[] args) {
            Carro opala = new Carro();
            opala.velocidade = 0;
            opala.placa = "CAR2P90";
            opala.modelo = "Comodoro";
            opala.ano = 76;
    
            Radar radar = new Radar();
            radar.modelo = "pardal";
            radar.limiteVelocidade = 60;
            radar.localizacao = "Pistão Sul";

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
