
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        double perKM = 2.20;
        
        
       Scanner getData = new Scanner (System.in);
       
        System.out.print("Lutfen Katedilen Mesafeyi Giriniz : ");
        
        double gidilen = getData.nextDouble();
        
        double toplamTutar = 10 + (gidilen * perKM );
        
        toplamTutar = (toplamTutar < 20) ? 20 : toplamTutar;
        
        System.out.println("Taksimetre Ucretiniz : " + toplamTutar + " Liradir...");
        
        
        
    }
    
}
