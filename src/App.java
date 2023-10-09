import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Uppgift a)");
        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv in ett heltal");
        int tal = scan.nextInt();

        int adder = 500;
        tal = (tal+500)/1000;
        tal=tal*1000;

        System.out.println("Ditt avrundade tal är: "+tal);

        System.out.println("Uppgift b)");
        System.out.println("mata in täljare och nämnare");
        int tak = scan.nextInt();
        int near = scan.nextInt();

        int div = tak/near;
        int rest = tak%near;
        System.out.println(div+" "+rest+"/"+near); 

        System.out.println("Uppgift c)");
        System.out.println("Ange antalet timmar:");
        double hour = scan.nextInt();
        System.out.println("Ange antalet minuter:");
        double min = scan.nextInt();
        System.out.println("Ange antalet sekunder:");
        double sek = scan.nextInt();

        double f_hour = hour+(min/60)+(sek/3600);
        double f_min = (hour*60)+min+(sek/60);
        double f_sek = (hour*3600)+(min*60)+sek;

        System.out.println("Antalet timmar: "+f_hour+" Antalet minuter: "+f_min+" Antalet sekunder: "+f_sek);

    }
}
