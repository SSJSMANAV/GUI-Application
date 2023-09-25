
/**
 * Instrument is the parent class or super class or base class
 *
 * @author (Manav Koirala)
 * @version number (2022/03/10)
 */
public class Instrument{
    //defining variables
    private static int instrumentId;
    private String instrumentName;
    private String customerName;
    private String customerMobileNumber;
    private int customerPAN;

    /** Initializing variables in the constructor and assigning values to constructor arguments, accordingly.**/
    public Instrument(String instrumentName) {
        instrumentId++;
        this.instrumentName = instrumentName;
        this.customerName = "";
        this.customerMobileNumber = ""; //assigning with empty string
        this.customerPAN = 0;
    }
    //each attribute's matching accessor method
    public int getinstrumentId() {
        return instrumentId;
    }

    public String getinstrumentName() {
        return this.instrumentName;
    }

    public String getcustomerName() {
        return this.customerName;
    }

    public String getcustomerMobileNumber() {
        return this.customerMobileNumber;
    }

    public int getcustomerPAN() {
        return this.customerPAN;
    }

    public void setinstrumentId( int instrumentId){
        instrumentId = instrumentId;
    }

    public void setinstrumentName( String instrumentName){
        this.instrumentName = instrumentName;
    }

    public void setcustomerName( String customerName){
        this.customerName = customerName;
    }

    public void setcustomerMobileNumber( String customerMobileNumber){
        this.customerMobileNumber = customerMobileNumber;
    }
    //setter method to assign new name parameter
    public void setcustomerPAN( int customerPAN){
        this.customerPAN = customerPAN;
    }
    //Display method
    public void Display(){
        System.out.println("Instrument ID : " + getinstrumentId());
        System.out.println("Instrument Name : " + getinstrumentName());

        if(this.customerName !="" && this.customerMobileNumber != "" && this.customerPAN != 0){
            System.out.println("Customer Name : " + getcustomerName());
            System.out.println("Customer MobileNumber : " + getcustomerMobileNumber());
            System.out.println("Customer PAN : " + getcustomerPAN());
        }
    }
}