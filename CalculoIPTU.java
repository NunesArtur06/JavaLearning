import java.util.Scanner;
import java.util.Locale;

public class lista {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        int area;
        int tipo;
        double IPTU=0;
        tipo = scan.nextInt();
        area = scan.nextInt();
        
        if(tipo == 1){
            if(area<200 && area>0){
                IPTU = area*1.0;
                System.out.printf("%.2f", IPTU);
            }else if(area>0){
                IPTU = area*1.2;
                System.out.printf("%.2f", IPTU);
            }else{
            System.out.print("Entrada inválida!\n");                        
            }
        }else if(tipo == 2){
            if(area<200 && area>0){
                IPTU=area*1.1;
                System.out.printf("%.2f", IPTU);
            }else if(area>0){
                IPTU=area*1.3;
                System.out.printf("%.2f", IPTU);
            }else{
             System.out.print("Entrada inválida!\n");                        
            }
        }else{
        System.out.print("Entrada inválida!\n");            
        }     
        
      
            
        
    } 
}
