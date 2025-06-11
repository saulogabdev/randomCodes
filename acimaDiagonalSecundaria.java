import java.util.Scanner;

public class acimaDiagonalSecundaria {
    
    final static Scanner sc = new Scanner(System.in);

    public static void lerMatriz(float[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = sc.nextFloat();
            }
        }
    }
    
    public static float calcularSoma(float[][] matriz) {
        float soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length - i - 1; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }

    public static float calcularMedia(float[][] matriz) {
        final int VALOR_FIXO = 66;
        return calcularSoma(matriz) / VALOR_FIXO;
    }
    
    public static void main(String[] args) {
        char operacao;
        float[][] matriz = new float[12][12];
        operacao = sc.next().charAt(0);

        lerMatriz(matriz);

        if (operacao == 'S') {
            System.out.printf("%.1f\n", calcularSoma(matriz));
        } else {
            System.out.printf("%.1f\n", calcularMedia(matriz));
        }
    }
}
