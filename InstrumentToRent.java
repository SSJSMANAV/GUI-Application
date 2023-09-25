
/**
 *class InstrumentToRent is also child class of parent class.
 *
 * @author (Manav Koirala)
 * @version (2022/03/10)
 */
public class InstrumentToRent extends Instrument{
    //declaring instance variables
    private int chargePerDay;
    private String dateOfRent;
    private String dateOfReturn;
    private int noOfDays;
    private boolean isRented;
    /**
     * the constructor accepts six parameters and value are assigning respectively,
     */
    public InstrumentToRent(String instrumentName,int chargePerDay){
        //calling of constructor from parent class
        super(instrumentName);
        //assigning the constructor with instance variables
        this.chargePerDay = chargePerDay;    
        //assigning the constructor with instance variables
        this.dateOfRent= "";
        this.dateOfReturn = "";
        this.noOfDays = 0;
        //assigning boolean 
        this.isRented = false;
    }
    //accessor method
    public int getchargePerDay(){
        return this.chargePerDay;
    }

    public String getdateOfRent(){
        return this.dateOfRent;
    } 

    public String getdateOfReturn(){
        return this.dateOfReturn;
    }

    public int getnoOfDays(){
        return this.noOfDays;
    }

    public boolean getisRented(){
        return this.isRented;
    }

    //setter method
    public void setchargePerDay(int chargePerDay){
        this.chargePerDay = chargePerDay;
    }

    public void setdateOfRent(String dateOfRent){
        this.dateOfRent = dateOfRent;
    }

    public void setdateOfReturn(String dateOfReturn){
        this.dateOfReturn = dateOfReturn;
    }

    public void setnoOfDays(int noOfDays){
        this.noOfDays = noOfDays;
    }

    public void setisRented(boolean isRented){
        this.isRented = isRented;
    }
    //creating method for registering academic course with parameters
    public void InstrumentToRent1(String customerName, String customerMobileNumber, int customerPAN, String dateOfRent, String dateOfReturn, int noOfDays)
    {

        if(this.isRented == true){
            System.out.println("The Instrument is not available.");
            System.out.println("Customer Name : " + getcustomerName());
            System.out.println("Customer Phone No. : " + getcustomerMobileNumber());
            System.out.println("Date of return : " + getdateOfReturn());
        }

        else
        {
            setcustomerName(customerName);
            setcustomerMobileNumber(customerMobileNumber);
            setcustomerPAN(customerPAN);

            setdateOfRent(dateOfRent);
            setdateOfReturn(dateOfReturn);
            setnoOfDays(noOfDays);
            setisRented(true);

            System.out.println("Successfully Rented");
            System.out.println();
            System.out.println("Rent details are shown below: ");

            System.out.println("Customer_Name : " + getcustomerName());
            System.out.println("Customer_MobileNumber : " + getcustomerMobileNumber());
            System.out.println("Customer_PAN : " + getcustomerPAN());
            System.out.println("Rented date : " + getdateOfRent());
            System.out.println("Return date : " + getdateOfReturn());
            System.out.println("No. of days : " + getnoOfDays());
            System.out.println("Total price is " + getnoOfDays() * getchargePerDay());
        }
    }

    public void InstrumentToReturn(){

        if(this.isRented == true){
            setcustomerName("");
            setcustomerMobileNumber("");
            setdateOfReturn("");
            setdateOfRent("");  
            setnoOfDays(0);
            setisRented(false); 
        }

        else{
            System.out.println("Cannot be returned. Data unavailabe.");
        }
    }
    //Display method
    public void Display(){
        //calling method for signature as display in parent class
        super.Display();

        if(this.isRented == true){

            System.out.println("Customer Name : " + getcustomerName());
            System.out.println("Customer Phone No. : " + getcustomerMobileNumber());
            System.out.println("Customer PAN : " + getcustomerPAN());

            System.out.println("Rented date : " + getdateOfRent());
            System.out.println("Return date : " + getdateOfReturn());
        }

    }
}

