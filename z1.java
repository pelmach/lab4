import java.util.Scanner;
public class z1 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int n = input.nextInt();
        int[] six = new int[n];
        int[] ten = new int[6];
        double el = 0;
        in(six);
        for(int i=0;i<= six.length-1;i++){
            el += six[i]/Math.pow(6,i+1);
        }

        System.out.println(el);
        el *= Math.pow(10,ten.length);
        for(int i=0;i<= ten.length-1;i++){
            ten[ten.length-1-i] += el%10;
            el /= 10;

        }
        out(ten);


    }
    public static void out(int[] mas){
        for(int i=0;i<= mas.length-1;i++){
            System.out.print(mas[i] );
        }
        System.out.println();

    }
    public static void in(int[] mas){
        for(int i =0;i< mas.length;i++){
            int num = input.nextInt();
            if(num<6){
                mas[i]=num;
            }else {
                System.out.println("Error");
                break;
            }
        }

    }

}
