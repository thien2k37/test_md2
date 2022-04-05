
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int n;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("độ dài của mảng:");
        n = scanner.nextInt();
        array = new int[n];
        int i = 0;
        while (i < array.length) {
            System.out.print("nhập các phàn tủ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        int sum = 0;



        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if(array[j] % 2 == 0){
                sum = sum + array[j];
            }
        }

        System.out.println( "\n" + "tong cac so chan: " +sum);

        System.out.println("nhập a: ");
        int a = scanner.nextInt();
        for (int j = 0; j < array.length; j++) {
            if(array[j] == a) {
                System.out.println( "vi tri cua a trong mang la: " + j);
            }
        }

    }
}
