public class Car {

    private String manufacture;
    private String colour;
    private int productionYear;
    private String model;
    private int horsePower;
    private double co2Emission;
    private int currentSpeed;

    public void setColour(String colour) {
        this.colour = colour;
    }

   // public void initialize(String manufacture, String colour, int)}


    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setCo2Emission(double co2Emission) {
        this.co2Emission = co2Emission;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getColour() {
        return colour;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public double getCo2Emission() {
        return co2Emission;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setManufacture(String manufacture) {


        if (manufacture.equals("Volkswagen")
                || manufacture.equals("Fiat")) {
            this.manufacture = manufacture;
        }
        else {
            System.out.println("Falscher Hersteller");
        }

    }
}

