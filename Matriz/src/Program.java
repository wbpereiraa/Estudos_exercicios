import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz: ");
        int linha = entrada.nextInt();
        System.out.print("Digite o número de colunas da matriz: ");
        int coluna = entrada.nextInt();
        int[][] mat = new int[linha][coluna];

        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                mat[i][j] = entrada.nextInt();
            }
        }

        System.out.print("Digite o número que será analizado na matriz: ");
        int valorX = entrada.nextInt();

        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                if (mat[i][j] == valorX) {
                    System.out.println("Posição " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Esquerda: " + mat[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Acima: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length-1) {
                        System.out.println("Direita: " + mat[i][j+1]);
                    }
                    if (i < mat.length-1) {
                        System.out.println("Abaixo: " + mat[i+1][j]);
                    }
                }
            }
        }

        entrada.close();
    }
}