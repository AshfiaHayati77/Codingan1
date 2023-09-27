package latihanpraktikum;
import java.util.Scanner;
public class PercabanganIf {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("total = ");
        int total = input.nextInt();
        System.out.println("Total belanja = Rp. " + total);
        if(total >= 250000){
            System.out.println("Diskon 20%");
            int diskon = (20 * total /100);
            total -= diskon;
        } else if(total >= 200000){
            System.out.println("Diskon 15%");
            int diskon = (15 * total /100);
            total -= diskon;
        } else if (total >= 100000){
            System.out.println("Dapat diskon 10%");
            int diskon = 10 * total /100;
            total -=diskon;
        }
        else{
            System.out.println("Tidak dapat diskon");
        }
        System.out.println("Akhir = Rp. "+total);
    }
    
}
