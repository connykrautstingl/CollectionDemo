import java.sql.SQLOutput;

public class CarDemoApp {


    public static void main(String[] args) {

        int number = 7;
        String numberString = "Seven";

        Car golf5_G_876TZ = new Car();
        Car fiatPanda_G_123RU = new Car();

        golf5_G_876TZ.setManufacture("Volkswagen");
        golf5_G_876TZ.setModel("Golf V");
        golf5_G_876TZ.setHorsePower(98);
        golf5_G_876TZ.setColour("black");
        golf5_G_876TZ.setCo2Emission(300);

        fiatPanda_G_123RU.setManufacture("Fiat");
        fiatPanda_G_123RU.setModel("Panda");
        fiatPanda_G_123RU.setColour("red");
        fiatPanda_G_123RU.setHorsePower(75);
        fiatPanda_G_123RU.setCurrentSpeed(120);

        Car golf5_LB_245LX = new Car();
        golf5_LB_245LX.setColour("black");
        golf5_LB_245LX.setModel("Golf 5");

        System.out.println("Golf V aus Graz: " + golf5_G_876TZ.getModel());
        System.out.println("Fiat aus Graz: " + fiatPanda_G_123RU.getModel());

    }
}