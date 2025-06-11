public class figurasMatrizes {

    public static void main(String[] args) {
        char[][] matrizFigura = new char[4][4];
        preencherMatriz3(matrizFigura);
        imprimirMatrizDeInteiros(matrizFigura);
    }


    public static void imprimirMatrizDeInteiros(char[][] matriz) {
        int linhas = matriz.length;  
        int colunas = matriz[0].length;

        // cabeçalho
        for(int j=0; j< colunas; j++){
            System.out.printf("\t[ %d ]", j);
        }
        System.out.println();
        // for das linhas
        for(int i=0; i< linhas; i++){

            System.out.printf("[ %d ]", i);
            // for das colunas
            for(int j=0; j< colunas; j++){
                System.out.printf("\t%c",matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static void preencherMatriz1(char[][] matrizFigura) {
        for (int i = 0; i < matrizFigura.length; i++) {
            for (int j = 0; j < matrizFigura.length; j++) {
                matrizFigura[i][j] = '*';
            }
        }
    }

    public static void preencherMatriz2(char[][] matrizFigura) {
        for (int i = 0; i < matrizFigura.length; i++) {
            for (int j = 0; j < matrizFigura.length; j++) {
                if (i == 0 || i == 3 || j == 0 || j == 3) {
                    matrizFigura[i][j] = '*';
                }
            }
        }
    }

    public static void preencherMatriz3(char[][] matrizFigura) {
        for (int i = 0; i < matrizFigura.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                matrizFigura[i][j] = '*';
            }
        }
    }
}