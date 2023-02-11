import java.time.LocalDate;

public class Main {

    public static void prodejce1() {
        String name = "Jiří Palát";
        System.out.println("Jméno a Příjmení: "+name);
        LocalDate dateOfBirth = LocalDate.of(1985, 5, 4);
        System.out.println("Datum narození: "+dateOfBirth);
        int quantity = 254;
        System.out.println("Počet sjednaných smluv: "+quantity);
        double weight = 178.8;
        System.out.println("Množství prodané mrkve: "+weight+" tun");
        String region = "Mouřínov 195, 685 01 Bučovice";
        System.out.println("Sídlo firmy: "+region);
        String registrationNo = "9AI4776";
        System.out.println("SPZ: "+registrationNo);
        double fuelConsumption = 8.6;
        System.out.println("Průměrná spotřeba vozu: "+fuelConsumption+" l/100 km");
        String ipAdress = "192.168.48.39";
        System.out.println("IP adresa: "+ipAdress);
        System.out.println("Průměrné množství prodané mrkve na jednu smlouvu je: "+weight/quantity+" tun");
    }
    public static void prodejce2() {
        String name = "Veronika Baťková";
        System.out.println("Jméno a Příjmení: "+name);
        LocalDate dateOfBirth = LocalDate.of(1983, 5, 22);
        System.out.println("Datum narození: "+dateOfBirth);
        int quantity = 437;
        System.out.println("Počet sjednaných smluv: "+quantity);
        double weight = 582.2;
        System.out.println("Množství prodané mrkve: "+weight+" tun");
        String region = "Přátelství 27, 691 76, Šitbořice";
        System.out.println("Sídlo firmy: "+region);
        String registrationNo = "6B30286";
        System.out.println("SPZ: "+registrationNo);
        double fuelConsumption = 9.3;
        System.out.println("Průměrná spotřeba vozu: "+fuelConsumption+" l/100 km");
        String ipAdress = "185.219.166.210";
        System.out.println("IP adresa: "+ipAdress);
        System.out.println("Průměrné množství prodané mrkve na jednu smlouvu je: "+weight/quantity+" tun");
    }
    public static void prodejce3() {
        String name = "Kateřina Mrkvičková";
        System.out.println("Jméno a Příjmení: "+name);
        LocalDate dateOfBirth = LocalDate.of(1978, 8, 12);
        System.out.println("Datum narození: "+dateOfBirth);
        int quantity = 1289;
        System.out.println("Počet sjednaných smluv: "+quantity);
        double weight = 987.7;
        System.out.println("Množství prodané mrkve: "+weight+" tun");
        String region = "Nenačovice 87, 266 01, Beroun 1";
        System.out.println("Sídlo firmy: "+region);
        String registrationNo = "8BI9812";
        System.out.println("SPZ: "+registrationNo);
        double fuelConsumption = 6.2;
        System.out.println("Průměrná spotřeba vozu: "+fuelConsumption+" l/100 km");
        String ipAdress = "184.157.87.46";
        System.out.println("IP adresa: "+ipAdress);
        System.out.println("Průměrné množství prodané mrkve na jednu smlouvu je: "+weight/quantity+" tun");
    }
    public static void main(String[] args) {
        System.out.println("Evidence prodejců biomrkve");
        prodejce1();
        prodejce2();
        prodejce3();
    }
}