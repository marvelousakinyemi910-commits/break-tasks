import java.util.Scanner;

public class Main{

    public static void  main(String[] args){
       Scanner input = new Scanner(System.in);
        System.out.println("Enter a state: ");
         String stateInput = input.nextLine();
         States geoZone = States.findZoneByState(stateInput);
         if (geoZone != null ){
             System.out.println(geoZone);
         }
         else{
             System.out.println("State not found");
         }
    }
}