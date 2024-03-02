import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in) ;
        System.out.print("Enter the base currency (USD, EUR, GBP, JPY): ");
        String base= scanner.nextLine(). toUpperCase();

        System.out.print("Enter the target currency: ")  ;
        String target = scanner.nextLine ().toUpperCase() ;


        System.out.print("Enter the amount to convert: ");
        double amount =scanner.nextDouble();
        double convertedAmount =convertCurrency(amount, base,target);




        System.out.println("Converted amount: "+ convertedAmount +" " +target);
        scanner.close();  }

    private static double convertCurrency(double amount, String base, String target) {
        double usdEur = 0.85;
        double usdGbp = 0.73 ;
        double usdJpy= 109.91;



 
        switch(target) {
            case "EUR":
                return amount* usdEur;
            case "GBP":
                return amount*usdGbp;
            case "JPY" :
                return amount* usdJpy;
            default:
                return -1  ; 
        
            }
    
    
        }    }
