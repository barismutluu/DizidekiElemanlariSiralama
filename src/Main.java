import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin boyutu n :");
        int diziBoyutu=input.nextInt();
        int[] numbers = new int[diziBoyutu];

        for (int i=0;i<diziBoyutu;i++){
            System.out.print(i+1 +". Elemanı :");
            numbers[i]= input.nextInt();
        }

        Arrays.sort(numbers);
        System.out.println("Sıralama :"+Arrays.toString(numbers));
    }
}