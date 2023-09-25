
/**
 * class NonAcademicCourse is one of child class of course class which is parent class
 *
 * @author (Manav Koirala)
 * @version (2021/05/10)
 */
public class InstrumentToSell extends Instrument{
    //declaring instance variables
    private float price;
    private String sellDate;
    private float discountPercent;
    private boolean isSold;
    /**
     * the constructor accepts four parameters and value are assigning respectively,
     */
    public InstrumentToSell(String instrumentName, float price) {
        //calling of constructor from parent class
        super(instrumentName);
        //assigning constructor with respective values
        this.price = price;
        this.sellDate = "";
        this.discountPercent = 0;
        this.isSold = false;
    }

    //accessor method
    public float getprice() {
        return this.price;
    }

    public String getsellDate(){
        return this.sellDate;
    }

    public float getdiscountPercent(){
        return this.discountPercent;
    }

    public boolean getisSold(){
        return this.isSold;
    }

    public void setprice(float price){
        if (!isSold) {
            this.price = price;
        }
        else {
            System.out.print("The Instrument has already been sold. Therefore, it's price cannot be changed.");
        }
    }

    public void  setsellDate(String sellDate){
        this.sellDate = sellDate;
    }

    public void setdiscountPercent(float discountPercent) {
        this.discountPercent = discountPercent;
    }

    public void setisSold(boolean isSold) {
        this.isSold = isSold;
    }

    public void InstrumentToSell(String customerName, String customerMobileNumber, int customerPAN, String sellDate, float discountPercent) {
        if (isSold ==true) {
            System.out.println("Instrument has been already sold out." + 
                "\nCustomer Details are listed below: " +
                "\nCustomer Name: " + getcustomerName() +
                "\nCustomer Mobile Number: " + getcustomerMobileNumber() +
                "\nCustomer PAN: " + getcustomerPAN());
        } else {
            setcustomerName(customerName);
            setcustomerMobileNumber(customerMobileNumber);
            setcustomerPAN(customerPAN);
            this.setsellDate(sellDate);
            this.setdiscountPercent(discountPercent);
            setisSold(true);
            super.setcustomerName(customerName);
            super.setcustomerMobileNumber(customerMobileNumber);
            super.setcustomerPAN(customerPAN);
            float finalPrice= this.price - (getdiscountPercent() / 100 * this.price);
            System.out.println("The Instruments Final Price Is:" + finalPrice);
        }
    }

    public void display() {
        //calling method for signature as display in parent class
        super.Display();
        System.out.println(getprice());

        if(isSold ==true) {
            System.out.println(
                "Customer Details: " +
                "\nCustomer Name: " + getcustomerName() +
                "\nCustomer Mobile Number: " + getcustomerMobileNumber() + 
                "\nCustomer PAN: " + getcustomerPAN() +
                "\nThe Instrument is sold in " + getsellDate()
            );
        }
    }
}