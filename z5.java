import java.util.Scanner;

public class z5 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int n = input.nextInt();
        int[][] mas = new int[n][n];
        in(mas);
        check(mas);
        out(mas);


    }
    static void in(int[][] mas){
        for(int i = 0;i <= mas.length-1;i++){
            for(int j = 0;j <= mas.length-1;j++){
                mas[i][j] = input.nextInt();
            }
        }
    }
    static void out(int[][] mas){
        for(int i = 0;i <= mas.length-1;i++){
            System.out.println();
            for(int j = 0;j <= mas.length-1;j++){
                System.out.print(" "+mas[i][j]);
            }
        }
    }
    static void check(int[][] mas){
        int k = 0;
        for(int i = 0;i <= mas.length-1;i++) {
            k = 0;
            for (int j = 0; j <= mas.length - 1; j++) {
                if (mas[i][j] > k) {
                     k = mas[i][j];
                }
            }
            for(int p = 0; p <= mas.length-1;p++){
                if(i == p){
                    mas[i][p] = k;
                }
            }

        }
    }
    static void swap(int[][] mas, int max){
        max = 0;
        for(int i = 0;i <= mas.length-1;i++){
            for(int j = 0;j <= mas.length-1;j++){
                if(i == j){
                    mas[i][j] = max;
                }
            }
        }

    }// заставить swap нормально работать
}
