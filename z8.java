import java.util.Scanner;

public class z8 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int n = input.nextInt();
        int mas[][] = new int[n][n];
        mas(mas);
        out(mas);

    }
    static void mas(int[][] mas){
        int k = 1;
        for(int i = 0; i <= mas.length/2-1; i++){
            for(int j = 0; j <= mas.length/2-1; j++){
                if( i == 0 && j == 0){
                    mas[i][j] = k;
                    k++;
                }
                if( i != 0 && j == 0){
                    mas[i][j] = k;
                    k++;
                }
                if( i == j-1 || j == i-1){
                    mas[i][j] = k;
                    k++;
                }
                if( i == 0 && j != 0){
                    mas[i][j] = k;
                    k++;
                }
            }
        }
        for(int i = mas.length/2; i <= mas.length-1; i++){
            for(int j = 0; j <= mas.length/2-1; j++){
                mas[i][j] = 2;
            }
        }
        for(int i = 0; i <= mas.length/2-1; i++){
            for(int j = mas.length/2; j <= mas.length-1; j++){
                mas[i][j] = 3;
            }
        }
        for(int i = mas.length/2; i <= mas.length-1; i++){
            for(int j = mas.length/2; j <= mas.length-1; j++){
                mas[i][j] = 4;
            }
        }

    }
    static void out(int mas[][]){
        for(int i = 0; i <= mas.length-1; i++){
            System.out.println();
            for(int j = 0; j <= mas.length-1; j++){
                System.out.print(mas[i][j]+ "\t");
            }
        }
    }
    static void newMas(int[][] mas){
        int k = 0;
        for(int i = 0; i <= mas.length/2-1; i++){
            mas[i][0] = k;
            k++;
        }
        for(int i = mas.length/2-1; i <= 1; i--){
            mas[i][i] = k;
            k++;
        }
        for(int i = mas.length/2-1; i <= 1; i--){
            mas[0][i] = k;
            k++;
        }
    }
}
