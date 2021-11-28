import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class z6 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int n = input.nextInt();
        int[][] mas = new int[n][n];
        in(mas);
        check(mas);

    }
    static void in(int[] @NotNull [] mas){
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
        int[][] newMas = new int[mas.length][mas.length];
        for(int i = 0;i <= mas.length-1;i++){
            for(int j = 0;j <= mas.length-1;j++){
                newMas[j][mas.length-i-1] = mas[i][j];
            }
        }
        out(newMas);
        System.out.println();
        out(mas);
    }
}
