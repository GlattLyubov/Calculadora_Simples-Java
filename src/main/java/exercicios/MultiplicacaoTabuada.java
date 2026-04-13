package exercicios;

public class MultiplicacaoTabuada {
    private int numero1;

    public void setNumero1(int numero1){

        this.numero1 = numero1;
    }

    int fazerTabuada(int num1){

        int multiplicador = 0;
        int resultado = 0;

        while(multiplicador <= 10){
            resultado = num1 * multiplicador;
            System.out.println(num1 + " X " + multiplicador + " = " + resultado);
            multiplicador++;
        }
        return resultado;
    }
}
