import java.util.Scanner;

public class areaSuperior {
    
    final static Scanner sc = new Scanner(System.in);
    
    public static void lerMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }
    }

    public static double calcularSoma(double[][] matriz) {
        double soma = 0;
        for (int i = 0; i < matriz.length/2; i++) {
            for (int j = i + 1; j < matriz.length - i - 1; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }

    public static double calcularMedia(double[][] matriz) {
        final int VALOR_FIXO = 30;
        return calcularSoma(matriz) / VALOR_FIXO;
    }

    public static void main(String[] args) {
        double[][] matriz = new double[12][12];
        char operacao = sc.next().charAt(0);

        lerMatriz(matriz);

        if (operacao == 'S') {
            System.out.printf("%.1f\n", calcularSoma(matriz));
        } else {
            System.out.printf("%.1f\n", calcularMedia(matriz));
        }
    }
}
