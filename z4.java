import java.util.Scanner;

public class z4 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int n = input.nextInt();
        int[] mas = new int[n];
        in(mas);
        gnomeSort(mas);
       out(mas);

    }
    public static void out(int[] mas){
        for(int i=0;i<= mas.length-1;i++){
            System.out.print(mas[i] );
        }
        System.out.println();

    }
    static void in(int[] mas){
        for(int i=0;i<=mas.length-1;i++){
            mas[i] = input.nextInt();
        }
    }
    static void gnomeSort(int[] mas)
    {
        int i = 0;

        while (i < mas.length) {
            if (i == 0)
                i++;
            if (mas[i] >= mas[i-1])
                i++;
            else {
                swap(mas[i-1],mas[i]);
                i--;
            }
        }
        return;
    }
    static void swap(int a,int b){
        int change = 0;
        change = a;
        a = b;
        b = change;
        return;
    }
}
