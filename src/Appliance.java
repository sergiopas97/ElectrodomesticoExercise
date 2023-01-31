public abstract class Appliance {
    protected static final String DEFAULT_COLOR = "white";
    protected static final char DEFAULT_CONSUMPTION = 'F';
    protected static final float DEFAULT_PRICE = 100;
    protected static final float DEFAULT_WEIGHT = 5;
    protected float price;
    protected String color;
    protected char eConsumption;
    protected float weight;

    public Appliance(float price, float weight, String color, char eConsumption) {
        this.price = price;
        this.color = checkColor(color);
        this.eConsumption = checkEConsumption(eConsumption);
        this.weight = weight;
    }

    public Appliance(float price, float weight) {
        this(price, weight, DEFAULT_COLOR, DEFAULT_CONSUMPTION);
    }

    public Appliance() {
        this(DEFAULT_PRICE, DEFAULT_WEIGHT);
    }

    public float getPrice() {
        return price;
    }

    public float getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public char getEConsumption() {
        return eConsumption;
    }

    private char checkEConsumption(char letter) {
        if (letter >= 'A' && letter <= 'F')
            return letter;
        else return DEFAULT_CONSUMPTION;
    }

    private String checkColor(String color) {
        switch (color) {
            case "white":
            case "black":
            case "red":
            case "blue":
            case "grey":
                return color;
            default:
                return DEFAULT_COLOR;
        }

    }

    protected void finalPrice() {
        switch (eConsumption) {
            case 'A':
                price += 100;
                break;
            case 'B':
                price += 80;
                break;
            case 'C':
                price += 60;
                break;
            case 'D':
                price += 50;
                break;
            case 'E':
                price += 30;
                break;
            case 'F':
                price += 10;
                break;
        }

        if (weight >= 0 && weight <= 19)
            price += 10;
        else if (weight >= 20 && weight <= 49)
            price += 50;
        else if (weight >= 50 && weight <= 79)
            price += 80;
        else if (weight >= 80)
            price += 100;
    }
}
