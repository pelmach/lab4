import java.util.Scanner;

public class z3 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int a = input.nextInt();
        int b = input.nextInt();
        int n = input.nextInt();
        int[] mas = new int[2*n];
        in(mas);
        Check(a,b,mas);


    }
   static void in(int[] mas){
        for(int i=0;i<=mas.length-1;i++){
            mas[i] = input.nextInt();
        }
    }
   static void Check(int a,int b,int[] mas){
        for(int i=0;i<=mas.length-2;i++){
            int check = (int) ((int) Math.pow(mas[i],2)/Math.pow(a,2)+Math.pow(i+1,2)/Math.pow(b,2));
            if(check == 1 || check < 1){
                System.out.println((int) (i+2)/2);
            }
        }


    }
}
