package exercicios;

public class Divisao {
    private double numero1;
    private double numero2;

    public void setNumero1(double numero1){
        this.numero1 = numero1;
    }
    public void setNumero2(double numero2){
        this.numero2 = numero2;
    }

    double calcularDivisao(double num1, double num2){
        if (num2 == 0){
            System.out.println("\nNão é possível dividir por zero, pois isso vai contra a lógica da Matemática..");
            return 0;
        }
        return num1 / num2;
    }
}
