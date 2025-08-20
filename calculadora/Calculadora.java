package calculadora;

public class Calculadora {

    public Double numeroA;
    public Double numeroB;

    public void somar(){
        Double resultadoSoma = this.numeroA + this.numeroB;
        System.out.println(this.numeroA + " + " + this.numeroB + " = " + resultadoSoma);

        
    }

    public void subtrair(){
        Double resultadoMenos = this.numeroA - this.numeroB;
        System.out.println(this.numeroA + " - " + this.numeroB + " = " + resultadoMenos);
    }

    public void multiplicar(){
        Double resultadoMulti = this.numeroA * this.numeroB;
        System.out.println(this.numeroA + " x " + this.numeroB + " = " + resultadoMulti);
    
    }

    public void dividir(){
        Double resultadoDiv = this.numeroA / this.numeroB;
        System.out.println(this.numeroA + " / " + this.numeroB + " = " + resultadoDiv);
    }
}
