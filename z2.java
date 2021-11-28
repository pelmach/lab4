import java.util.Scanner;

public class z2 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int n = input.nextInt();
        int[] mas = new int[n];
        in(mas);
        task1(mas);
        task2(mas);

    }
    static void in(int[] mas){
        for(int i=0;i<= mas.length-1;i++){
            mas[i]=input.nextInt();
        }
    }
    static void task1(int[] mas){
        int k=0;
        for(int i=1;i<= mas.length-2;i++){
            int max =0;
            if(mas[i-1]>=mas[i+1]){
                max=mas[i-1];
            }else{
                max=mas[i+1];
            }
            if(max<mas[i]){
                k++;
            }

        }
        System.out.println(k);
    }
    static void task2(int[] mas){
        int k=0;
        for(int i=1;i<= mas.length-1;i+=2){
            int max=0;
            if(mas[i-1]>=mas[i+1]){
                max=mas[i-1];
            }else{
                max=mas[i+1];
            }
            if(mas[i]>max){
                k++;
            }
        }
        System.out.println(k);
    }
}
