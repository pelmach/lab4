import java.util.Scanner;

public class z7 {
   static Scanner input = new Scanner(System.in);
   public static void main(String[] args){
       int n = input.nextInt();
       int mas[][] = new int[n][n];
       int k = 1;
       newMas(mas,k);
       out(mas);
   }
  static void newMas(int[][] mas, int k) {
      for (int i = 0; i <= mas.length - 1; i++) {
          mas[i][i] = k;
          k++;
      }
      for (int i = mas.length - 2; i >= 0; i--) {
          mas[mas.length - 1][i] = k;
          k++;
      }
      for (int i = mas.length - 2; i >= 1; i--) {
          mas[i][0] = k;
          k++;
      }
      int m = 0;
          int f = 1;
          int b = 0;
          while (mas[f + 1][b + 1] == 0) {
              f++;
              b++;
              mas[f][b] = k;
              k++;
          }

          while (mas[f][b - 1] == 0) {
              b--;
              mas[f][b] = k;
              k++;
          }
          while (mas[f - 1][b] == 0) {
              f--;
              mas[f][b] = k;
              k++;
          }
          m++;

      }

   public static void out(int[][] mas){
        for(int i = 0;i <= mas.length-1;i++){
            System.out.println();
            for(int j = 0;j <= mas.length-1;j++){
                System.out.print(mas[i][j]+ "\t");
            }
        }
    }
}
