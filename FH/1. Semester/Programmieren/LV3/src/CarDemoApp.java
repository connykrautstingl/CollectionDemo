import java.sql.SQLOutput;

public class CarDemoApp {


    public static void main(String[] args) {

        int number = 7;
        String numberString = "Seven";

        Car golf5_G_876TZ = new Car();
        Car fiatPanda_G_123RU = new Car();

        golf5_G_876TZ.manufacture = "Volkswagen";
        golf5_G_876TZ.model = "Golf V";
        golf5_G_876TZ.horsePower = 98;
        golf5_G_876TZ.colour = "black";
        golf5_G_876TZ.co2Emission = 300;

        fiatPanda_G_123RU.manufacture = "Fiat";
        fiatPanda_G_123RU.model = "Panda";
        fiatPanda_G_123RU.colour = "red";
        fiatPanda_G_123RU.horsePower = 75;
        fiatPanda_G_123RU.co2Emission = 120;

        Car golf5_LB_245LX = new Car();
        golf5_LB_245LX.colour = "black";
        golf5_LB_245LX.model = "Golf 5";

        System.out.println("Golf V aus Graz: " + golf5_G_876TZ.co2Emission);
        System.out.println("Fiat aus Graz: " + fiatPanda_G_123RU.model);

    }
}