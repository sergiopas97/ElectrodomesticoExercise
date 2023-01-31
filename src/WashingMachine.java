public class WashingMachine extends Appliance{
    private static final float DEFAULT_CHARGE = 5;
    private float charge;

    public WashingMachine(float price, float weight, String color, char eConsumption, float charge){
        super(price,weight,color,eConsumption);
        this.charge = charge;
    }


    public WashingMachine(float price, float weight,char charge){
        this(price,weight,DEFAULT_COLOR,DEFAULT_CONSUMPTION,charge);
    }
    public WashingMachine(){
        this(DEFAULT_PRICE,DEFAULT_WEIGHT,DEFAULT_COLOR,DEFAULT_CONSUMPTION,DEFAULT_CHARGE);
    }
}
