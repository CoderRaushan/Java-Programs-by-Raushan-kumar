import java.util.Scanner;

public class array_sort {  
    public static void main(String[] args) {
        int a[] = new int[10];
        System.out.println("enter your array element:");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i <= 9; i++) {
            a[i] = s.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i <= 9; i++) {
            System.out.print(" "+a[i]);
        }
    }
}

