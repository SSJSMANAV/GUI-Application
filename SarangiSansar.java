import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * Write a description of class SarangiSansar here.
 *
 * @author (Manav Koirala)
 * @version (a version number or a date)
 */
public class SarangiSansar implements ActionListener
{
    ArrayList<Instrument> al = new ArrayList<Instrument>();
    public static void main (String[]args)
    {
        SarangiSansar obj = new SarangiSansar();
        obj.Instrument();
    }
    
    //Making frames,panel,labels,textfield,combobox and buttons
    JFrame frame = new JFrame("Instrument");
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JLabel title = new JLabel("Instrument To Rent");
    JLabel iName = new JLabel("Instrument Name:");
    JLabel chargePerDay = new JLabel("Charge/Day:");
    JTextField txtiName = new JTextField();
    JTextField txtchargePerDay = new JTextField();
    JButton addInstrument = new JButton("Add");
    JLabel iName1 = new JLabel("Instrument Name:");
    JLabel cName = new JLabel("Customer Name:");
    JLabel cPhone = new JLabel("Customer Phone No.:");
    JLabel cPAN = new JLabel("Customer PAN No:");
    JLabel cRenting = new JLabel("No. of Rent Days:");
    JTextField txtiName1 = new JTextField();
    JTextField txtcName = new JTextField();
    JTextField txtcPhone = new JTextField();
    JTextField txtcPAN = new JTextField();
    JTextField txtcRenting = new JTextField();
    JLabel rentDate = new JLabel("Rent Date:");
    JLabel returnDate = new JLabel("Return Date:");
    String[] year = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004",
            "2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2019",
            "2020","2021",};

    JComboBox<String> r1combobox = new JComboBox <String>(year); //creating a Jcombobox

    String[] month = {"January ","February  ","March  ","April ","May ","June ","July ","August ","September ",
            "October ","November ","December",};

    JComboBox<String> r2combobox = new JComboBox<String>(month); //creating a Jcombobox

    String[] day = {"1 ","2  ","3  ","4 ","5 ","6 ","7 ","8 ","9 ", "10 ","11 ","12 ","13 ","14 ","15 ","16 ","17 ","18 ","19 ","20 ","21 ","22 ","23 ","24 ","25 ","26 ",
            "27 ","28 ","29 ","30 ","31 ","32 "};

    JComboBox<String> r3combobox = new JComboBox<String>(day);                    

    JComboBox<String> rt1combobox = new JComboBox<String>(year);
    JComboBox<String> rt2combobox = new JComboBox<String>(month);
    JComboBox<String> rt3combobox = new JComboBox<String>(day);

    JButton rent = new JButton("Rent");
    JLabel iName2 = new JLabel("Instrument Name:");
    JTextField txtiName2 = new JTextField ();
    JButton return1 = new JButton("Return");
    JButton dis_1 = new JButton("Display");
    JButton clear = new JButton("CLEAR");

    //panel2 starting
    JLabel title2 = new JLabel("Instrument To Sell");
    JLabel iName0 = new JLabel("Instrument Name:");
    JLabel chargePerDay0 = new JLabel ("Price:");
    JTextField txtiName0 = new JTextField();
    JTextField txtchargePerDay0 = new JTextField();
    JButton addInstrument0 = new JButton("Add");
    JLabel iName3 = new JLabel("Instrument Name");
    JLabel cName0 = new JLabel("Customer Name:");
    JLabel cPhone0 = new JLabel("Customer Phone No.:");
    JLabel cPAN0 = new JLabel("Customer PAN No.:");
    JLabel cDiscountPer = new JLabel("Discount Percentage::");
    JTextField txtiName3 = new JTextField();
    JTextField txtcName0 = new JTextField();
    JTextField txtcPhone0 = new JTextField();
    JTextField txtcPAN0 = new JTextField();
    JTextField txtcDiscountPer = new JTextField();
    JLabel sellDate = new JLabel("Sell Date:");
    JComboBox<String> sd1combobox = new JComboBox<String>(year);
    JComboBox<String> sd2combobox = new JComboBox<String>(month);
    JComboBox<String> sd3combobox = new JComboBox<String>(day);
    JButton sell_1 = new JButton("Sell");
    JButton dis_2 = new JButton("Display");
    JButton clear2 = new JButton("CLEAR");
    
    //Making Instrument Method
    public void Instrument ()
    {
        frame.setBounds(180,10,1300,650);
        frame.setLayout(null);
        frame.setResizable(false);

        panel1.setBounds(0,0,650,650);
        panel1.setLayout(null);
        panel1.setBackground(new Color(0x00ffff));

        title.setBounds(75,20,350,35);
        title.setFont(new Font("Consolas",Font.BOLD,30));
        title.setForeground(new Color(0x000000));

        iName.setBounds(10,80,200,30);
        iName.setFont(new Font("Consolas",Font.PLAIN,18));
        iName.setForeground(new Color(0x000000));

        chargePerDay.setBounds(380,80,200,30);
        chargePerDay.setFont(new Font("Consolas",Font.PLAIN,18));
        chargePerDay.setForeground(new Color(0x000000));

        txtiName.setBounds(200,80,150,30);
        txtiName.setFont(new Font("Consolas",Font.PLAIN,18));

        txtchargePerDay.setBounds(520,80,100,30);
        txtchargePerDay.setFont(new Font("Consolas",Font.PLAIN,18));

        addInstrument.setBounds(520,130,100,35);
        addInstrument.setFocusable(false);
        addInstrument.setFont(new Font("Consolas",Font.BOLD,22));
        addInstrument.addActionListener(this);
        addInstrument.setBackground(new Color(0xffffff));
        addInstrument.setForeground(new Color(0x000000));

        iName1.setBounds(10,175,200,30);
        iName1.setFont(new Font("Consolas",Font.PLAIN,18));
        iName1.setForeground(new Color(0x000000));

        txtiName1.setBounds(270,175,150,30);
        txtiName1.setFont(new Font("Consolas",Font.PLAIN,18));

        cName.setBounds(10,215,200,30);
        cName.setFont(new Font("Consolas",Font.PLAIN,18));
        cName.setForeground(new Color(0x000000));

        cPhone.setBounds(10,255,200,30);
        cPhone.setFont(new Font("Consolas",Font.PLAIN,18));
        cPhone.setForeground(new Color(0x000000));

        cPAN.setBounds(10,295,200,30);
        cPAN.setFont(new Font("Consolas",Font.PLAIN,18));
        cPAN.setForeground(new Color(0x000000));

        cRenting.setBounds(10,335,250,30);
        cRenting.setFont(new Font("Consolas",Font.PLAIN,18));
        cRenting.setForeground(new Color(0x000000));

        txtcName.setBounds(270,215,150,30);
        txtcName.setFont(new Font("Consolas",Font.PLAIN,18));

        txtcPhone.setBounds(270,255,150,30);
        txtcPhone.setFont(new Font("Consolas",Font.PLAIN,18));

        txtcPAN.setBounds(270,295,150,30);
        txtcPAN.setFont(new Font("Consolas",Font.PLAIN,18));

        txtcRenting.setBounds(270,335,150,30);
        txtcRenting.setFont(new Font("Consolas",Font.PLAIN,18));

        rentDate.setBounds(10,375,200,30);
        rentDate.setFont(new Font("Consolas",Font.PLAIN,18));
        rentDate.setForeground(new Color(0x000000));

        returnDate.setBounds(10,415,200,30);
        returnDate.setFont(new Font("Consolas",Font.PLAIN,18));
        returnDate.setForeground(new Color(0x000000));

        r1combobox.setBounds(220,375,70,35);
        r1combobox.setFont(new Font("Consolas",Font.PLAIN,18));

        r2combobox.setBounds(300,375,135,35);
        r2combobox.setFont(new Font("Consolas",Font.PLAIN,18));

        r3combobox.setBounds(445,375,60,35);
        r3combobox.setFont(new Font("Consolas",Font.PLAIN,18));

        rt1combobox.setBounds(220, 415, 70, 35);
        rt1combobox.setFont(new Font("Consolas",Font.PLAIN,18));

        rt2combobox.setBounds(300, 415, 135, 35);
        rt2combobox.setFont(new Font("Consolas",Font.PLAIN,18));

        rt3combobox.setBounds(445, 415, 60, 35);
        rt3combobox.setFont(new Font("Consolas",Font.PLAIN,18));

        rent.setBounds(520,470,100,35);
        rent.setFocusable(false);
        rent.setFont(new Font("Consolas",Font.BOLD,22));
        rent.addActionListener(this);
        rent.setBackground(new Color(0xffffff));
        rent.setForeground(new Color(0x000000));

        iName2.setBounds(10,510,200,30);
        iName2.setFont(new Font("Consolas",Font.PLAIN,18));
        iName2.setForeground(new Color(0x000000));

        txtiName2.setBounds(220,510,150,30);
        txtiName2.setFont(new Font("Consolas",Font.PLAIN,18));

        return1.setBounds(260,560,120,35);
        return1.setFocusable(false);
        return1.setFont(new Font("Consolas",Font.BOLD,22));
        return1.addActionListener(this);
        return1.setBackground(new Color(0xffffff));
        return1.setForeground(new Color(0x000000));

        panel1.add(dis_1);
        dis_1.setBounds(20,560,120,35);
        dis_1.addActionListener(this);
        dis_1.setFocusable(false);
        dis_1.setForeground(new Color(0x000000));
        dis_1.setFont(new Font("Consolas",Font.BOLD,22));
        dis_1.setBackground(new Color(0xffffff));

        clear.setBounds(520,560,100,35);
        clear.setFocusable(false);
        clear.setFont(new Font("Consolas",Font.BOLD,22));
        clear.addActionListener(this);
        clear.setBackground(new Color(0xffffff));
        clear.setForeground(new Color(0xff0000));

        //panel 2............
        panel2.setBounds(650,0,650,650);
        panel2.setLayout(null);
        panel2.setBackground(new Color(0xe6e6e6));

        title2.setBounds(175,10,350,40);
        title2.setFont(new Font("Consolas",Font.BOLD,30));
        title2.setForeground(new Color(0x000000));

        iName0.setBounds(10,80,200,30);
        iName0.setFont(new Font("Consolas",Font.PLAIN,18));
        iName0.setForeground(new Color(0x000000));

        chargePerDay0.setBounds(400,80,200,30);
        chargePerDay0.setFont(new Font("Consolas",Font.PLAIN,18));
        chargePerDay0.setForeground(new Color(0x000000));

        txtiName0.setBounds(200,80,150,30);
        txtiName0.setFont(new Font("Consolas",Font.PLAIN,18));

        txtchargePerDay0.setBounds(520,80,100,30);
        txtchargePerDay0.setFont(new Font("Consolas",Font.PLAIN,18));

        addInstrument0.setBounds(520,130,100,35);
        addInstrument0.setFocusable(false);
        addInstrument0.setFont(new Font("Consolas",Font.BOLD,22));
        addInstrument0.addActionListener(this);
        addInstrument0.setBackground(new Color(0xffffff));
        addInstrument0.setForeground(new Color(0x000000));

        iName3.setBounds(10,175,200,30);
        iName3.setFont(new Font("Consolas",Font.PLAIN,18));
        iName3.setForeground(new Color(0x000000));

        cName0.setBounds(10,225,200,30);
        cName0.setFont(new Font("Consolas",Font.PLAIN,18));
        cName0.setForeground(new Color(0x000000));

        cPhone0.setBounds(10,275,200,30);
        cPhone0.setFont(new Font("Consolas",Font.PLAIN,18));
        cPhone0.setForeground(new Color(0x000000));

        cPAN0.setBounds(10,325,250,30);
        cPAN0.setFont(new Font("Consolas",Font.PLAIN,18));
        cPAN0.setForeground(new Color(0x000000));

        cDiscountPer.setBounds(10,375,250,30);
        cDiscountPer.setFont(new Font("Consolas",Font.PLAIN,18));
        cDiscountPer.setForeground(new Color(0x000000));

        txtiName3.setBounds(270,175,150,30);
        txtiName3.setFont(new Font("Consolas",Font.PLAIN,18));

        txtcName0.setBounds(270,225,150,30);
        txtcName0.setFont(new Font("Consolas",Font.PLAIN,18));

        txtcPhone0.setBounds(270,275,150,30);
        txtcPhone0.setFont(new Font("Consolas",Font.PLAIN,18));

        txtcPAN0.setBounds(270,325,150,30);
        txtcPAN0.setFont(new Font("Consolas",Font.PLAIN,18));

        txtcDiscountPer.setBounds(270,375,150,30);
        txtcDiscountPer.setFont(new Font("Consolas",Font.PLAIN,18));

        sellDate.setBounds(10,415,200,30);
        sellDate.setFont(new Font("Consolas",Font.PLAIN,18));
        sellDate.setForeground(new Color(0x000000));

        sd1combobox.setBounds(220,415,70,35);
        sd1combobox.setFont(new Font("Consolas",Font.PLAIN,18));

        sd2combobox.setBounds(300,415,135,35);
        sd2combobox.setFont(new Font("Consolas",Font.PLAIN,18));

        sd3combobox.setBounds(445,415,60,35);
        sd3combobox.setFont(new Font("Consolas",Font.PLAIN,18));

        sell_1.setBounds(520,490,100,40);
        sell_1.addActionListener(this);
        sell_1.setFont(new Font("Consolas",Font.BOLD,22));
        sell_1.setBackground(new Color(0xffffff));
        sell_1.setForeground(new Color(0x000000));
        sell_1.setFocusable(false);

        panel2.add(dis_2);
        dis_2.addActionListener(this);
        dis_2.setBounds(350,550,120,40);
        dis_2.setFocusable(false);
        dis_2.setFont(new Font("Consolas",Font.BOLD,22));
        dis_2.setBackground(new Color(0xffffff));
        dis_2.setForeground(new Color(0x000000));

        clear2.setBounds(520,550,100,35);
        clear2.setFocusable(false);
        clear2.setFont(new Font("Consolas",Font.BOLD,22));
        clear2.addActionListener(this);
        clear2.setBackground(new Color(0xffffff));
        clear2.setForeground(new Color(0xff0000));

        //Add panel1 to frame
        frame.add(panel1);

        //Add components to panel1
        panel1.add(title);
        panel1.add(iName);
        panel1.add(chargePerDay);
        panel1.add(txtiName);
        panel1.add(txtchargePerDay);
        panel1.add(addInstrument);
        panel1.add(iName1);
        panel1.add(cName);
        panel1.add(cPhone);
        panel1.add(cPAN);
        panel1.add(cRenting);
        panel1.add(txtiName1);
        panel1.add(txtcName);
        panel1.add(txtcPhone);
        panel1.add(txtcPAN);
        panel1.add(txtcRenting);
        panel1.add(rentDate);
        panel1.add(returnDate);
        panel1.add(r1combobox);
        panel1.add(r2combobox);
        panel1.add(r3combobox);
        panel1.add(rt1combobox);
        panel1.add(rt2combobox);
        panel1.add(rt3combobox);
        panel1.add(rent);
        panel1.add(iName2);
        panel1.add(txtiName2);
        panel1.add(return1);
        panel1.add(clear);

        //Add panel2 to Frameo
        frame.add(panel2);

        //Add components to panel 2
        panel2.add(title2);
        panel2.add(iName0);
        panel2.add(chargePerDay0);
        panel2.add(txtiName0);
        panel2.add(txtchargePerDay0);
        panel2.add(addInstrument0);
        panel2.add(iName3);
        panel2.add(cName0);
        panel2.add(cPhone0);
        panel2.add(cPAN0);
        panel2.add(cDiscountPer);
        panel2.add(txtiName3);
        panel2.add(txtcName0);
        panel2.add(txtcPhone0);
        panel2.add(txtcPAN0);
        panel2.add(txtcDiscountPer);
        panel2.add(sellDate);
        panel2.add(sd1combobox);
        panel2.add(sd2combobox);
        panel2.add(sd3combobox);
        panel2.add(sell_1);
        panel2.add(clear2);

        frame.setVisible(true);
    }
    
    //actionPerformed
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == dis_1)
        {
            for(Instrument i : al)
            {
                if(i instanceof InstrumentToRent)
                {
                    InstrumentToRent obj = (InstrumentToRent) i;
                    int a = obj.getinstrumentId();
                    String b = obj.getinstrumentName();
                    String c = obj.getcustomerName();
                    String d = obj.getcustomerMobileNumber();
                    int f = obj.getcustomerPAN();
                    String g = obj.getdateOfRent();
                    String h = obj.getdateOfReturn();
                    JOptionPane.showMessageDialog(panel1, ("Instrument ID: "+a)+("\nInstrument Name: "+b)+("\nCustomer Number: "+c)+("\nCustomer Mobile Number: "+d)+("\nCustomer PAN: "+f)+("\nDate of Rent: "+g)+("\nDate of Return: "+h));
                    i.Display();
                }
            }
        }

        if(e.getSource() == dis_2)
        {
            for(Instrument j : al)
            {
                if(j instanceof InstrumentToSell)
                {
                    InstrumentToSell obj = (InstrumentToSell) j;
                    int a = obj.getinstrumentId();
                    String b = obj.getinstrumentName();
                    String c = obj.getcustomerName();
                    String d = obj.getcustomerMobileNumber();
                    int f = obj.getcustomerPAN();
                    String g = obj.getsellDate();
                    JOptionPane.showMessageDialog(panel1, ("Instrument ID: "+a)+("\nInstrument Name: "+b)+(("\nCustomer Number: "+c))+("\nCustomer Mobile Number: "+d)+("\nCustomer PAN: "+f)+("\nSell Date: "+g));
                    j.Display();
                }
            }          
        }

        //instrumrnt to sell for sell
        if (e.getSource() == sell_1)
        {
            if (txtiName3.getText().isEmpty() || txtcName0.getText().isEmpty() || txtcPhone0.getText().isEmpty() || 
            txtcDiscountPer.getText().isEmpty() || txtcPAN0.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(panel2,"Empty Field Present!!!","Error: ",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try
                {
                    String vart0 = txtiName3.getText();
                    String vart1 = txtcName0.getText();
                    String vart2 = txtcPhone0.getText();
                    int vart3 = Integer.parseInt(txtcDiscountPer.getText());            
                    String year = sd1combobox.getSelectedItem().toString();
                    String month = sd2combobox.getSelectedItem().toString();
                    String day = sd3combobox.getSelectedItem().toString();
                    String sold = year+" "+month+" "+day;
                    int vart4 = Integer.parseInt(txtcPAN0.getText());
                    if(vart3 <= 100 && vart3 >= 0)
                    {
                        for(Instrument obj99 : al)
                        {
                            if(obj99 instanceof InstrumentToSell)
                            {
                                InstrumentToSell insSell = (InstrumentToSell) obj99;
                                if(insSell.getinstrumentName() .equals (vart0))
                                {
                                    if(insSell.getisSold() == false)
                                    {
                                        insSell.InstrumentToSell(vart1, vart2, vart4, sold, vart3);
                                        JOptionPane.showMessageDialog(panel2, ("You have Successfully Sold an Instrument")+("\nInstrument Name: "+vart0)+(("\nCustomer Number: "+vart1))+("\nPhone number: "+vart2)+("\nDiscount %: "+vart3)+
                                            ("\nCustomer PAN: "+vart4)+("\nSell Date: "+sold));

                                    }
                                    else if(insSell.getisSold() == true)
                                    {
                                        JOptionPane.showMessageDialog(panel2, "Sorry entered Instrument is already sold","ERROR: ", JOptionPane.ERROR_MESSAGE);
                                        return;
                                    }
                                }
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(panel2, "Intrument name not match","ERROR: ", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(panel2, "The Given Discount Percent Is Not Valid","ERROR: ", JOptionPane.ERROR_MESSAGE);
                    }
                }
                catch (NumberFormatException nf)
                {
                    JOptionPane.showMessageDialog(panel2, "Please enter Discount % and PAN No. in integer","ERROR: ", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        //Instrument To Rent For Add
        if(e.getSource() == addInstrument)
        {  
            String vart1 = txtiName.getText();
            int vart2;
            if(vart1.equals("") || txtchargePerDay.getText().equals(""))
            {
                JOptionPane.showMessageDialog(panel1, "Fields are Empty");
                return;
            }
            try
            {
                vart2 = Integer.parseInt(txtchargePerDay.getText());
            }
            catch(NumberFormatException nfe)
            {
                JOptionPane.showMessageDialog(panel1, "Please enter integer value for charge per day amount");
                return;
            }
            for(Instrument obj1 : al)
            {
                if(obj1 instanceof InstrumentToRent)
                {
                    InstrumentToRent obj2 = (InstrumentToRent) obj1;
                    if(obj1.getinstrumentName().equals(vart1))
                    {
                        JOptionPane.showMessageDialog(panel1, "Instrument is Already Rented","ERROR: ", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
            }
            InstrumentToRent obj3 = new InstrumentToRent(vart1, vart2);
            al.add(obj3);
            JOptionPane.showMessageDialog(panel1, ("You have Sucessfulley added an Instrument.")+("\nInstrument Name: "+vart1)+("\nCharge per Day: "+vart2));
        }
        
        //Instrument To Sell For Add
        if(e.getSource() == addInstrument0)
        {   
            String vart3 = txtiName0.getText();
            int vart4;  
            if(vart3.equals("") || txtchargePerDay0.getText().equals(""))
            {
                JOptionPane.showMessageDialog(panel2, "Fields are Empty");
                return;
            }
            try
            {
                vart4 = Integer.parseInt(txtchargePerDay0.getText());            }
            catch(NumberFormatException nfe)
            {
                JOptionPane.showMessageDialog(panel2, "Please enter integer value for price"); 
                return;
            }
            for(Instrument obj4 : al)
            {
                if(obj4 instanceof InstrumentToSell)
                {
                    InstrumentToSell obj5 = (InstrumentToSell) obj4;
                    if(obj5.getinstrumentName().equals(vart3))
                    {
                        JOptionPane.showMessageDialog(panel2, "Instrument is Already added","ERROR: ", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
            }
            InstrumentToSell obj6 = new InstrumentToSell(vart3, vart4);
            al.add(obj6);
            JOptionPane.showMessageDialog(panel2, ("You have Sucessfulley added an Instrument.")+("\nInstrument Name: "+vart3)+("\nCharge per Day: "+vart4));
        }

        //Instrument To Rent for clearing the data of textfield
        if(e.getSource() == clear)
        {
            txtiName.setText("");
            txtiName1.setText("");
            txtchargePerDay.setText("");
            txtcName.setText("");
            txtcPhone.setText("");
            txtcPAN.setText("");
            txtcRenting.setText("");
            txtiName2.setText("");
            r1combobox.setSelectedIndex(0);
            r2combobox.setSelectedIndex(0);
            r3combobox.setSelectedIndex(0);
            rt1combobox.setSelectedIndex(0);
            rt2combobox.setSelectedIndex(0);
            rt3combobox.setSelectedIndex(0);
        }

        //Instrument To Sell for clearing the data of textfield
        if(e.getSource() == clear2)
        {
            txtiName0.setText("");
            txtiName3.setText("");
            txtchargePerDay0.setText("");
            txtcName0.setText("");
            txtcPhone0.setText("");
            txtcPAN0.setText("");
            txtcDiscountPer.setText("");
            sd1combobox.setSelectedIndex(0);
            sd2combobox.setSelectedIndex(0);
            sd3combobox.setSelectedIndex(0);
        }

        //Instrument To Rent For Rent
        if(e.getSource() == rent) 
        {
            if(txtiName1.getText().isEmpty() || txtcName.getText().isEmpty()  || txtcPhone.getText().isEmpty() ||
            txtcPAN.getText().isEmpty() || txtcRenting.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(panel1, "Empty Field Present!!!");
            }
            else
            {
                try
                {
                    String var0 = txtiName1.getText();
                    String var1 = txtcName.getText();
                    String var2 = txtcPhone.getText();
                    String year = r1combobox.getSelectedItem().toString();
                    String month = r2combobox.getSelectedItem().toString();
                    String day = r3combobox.getSelectedItem().toString();
                    String rentday = year+" "+month+" "+day;
                    String year2 = rt1combobox.getSelectedItem().toString();
                    String month2 = rt2combobox.getSelectedItem().toString();
                    String day2 = rt3combobox.getSelectedItem().toString();
                    String returnday = year2+month2+day2;
                    int var3 = Integer.parseInt(txtcPAN.getText());
                    int var4 = Integer.parseInt(txtcRenting.getText());
                    for(Instrument obj20 : al)
                    {
                        if(obj20 instanceof InstrumentToRent )
                        {
                            InstrumentToRent inst_obj = (InstrumentToRent) obj20;
                            if(inst_obj.getinstrumentName().equals(var0))

                            {
                                if(inst_obj.getisRented() == true)
                                {
                                    JOptionPane.showMessageDialog(panel1, "The Instrument is already rented");
                                }
                                else if(inst_obj.getisRented() == false)
                                {
                                    inst_obj.InstrumentToRent1(var1, var2, var3, rentday, returnday, var4);
                                    JOptionPane.showMessageDialog(panel1, ("You have Successfully rent an Instrument")+("\nInstrument Name: "+var0)+
                                        (("\nCustomer Number: "+var1))+("\nPhone number: "+var2)+("\nDate of rent: "+rentday)+("\nDay of return: "+returnday)+
                                        ("\nCustomer PAN: "+var3)+("\nNo. of renting days: "+var4));
                                    return;
                                }
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(panel1, "Instrument name not match","ERROR: ", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                }
                catch(NumberFormatException na)
                {
                    JOptionPane.showMessageDialog(panel1, "Please Enter Interger value for PAN No. and Phone No.","ERROR: ", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        //Instrument To Rent for Returning the Instrument
        if(e.getSource() == return1)
        {   
            String var5 = txtiName2.getText();
            if (var5 .equals (""))
            {
                JOptionPane.showMessageDialog(panel1,"Empty Fields. Fill Up All The Required Fields.","Error: ",JOptionPane.ERROR_MESSAGE);
                return;
            }
            for(Instrument obj30 : al)
            {
                if (obj30 instanceof InstrumentToRent)
                {
                    InstrumentToRent ins_obj = (InstrumentToRent) obj30;
                    if(ins_obj.getinstrumentName() .equals (var5))
                    {
                        if(ins_obj.getisRented() != true)
                        {
                            JOptionPane.showMessageDialog(panel1, "This instrument is not rented");
                            return;
                        }
                        else
                        {
                            ins_obj.InstrumentToReturn();
                            JOptionPane.showMessageDialog(panel1, ("The Instrument name: ")+var5+(" have been successfully return."));
                            return;
                        }
                    }
                }
            }
            JOptionPane.showMessageDialog(panel1, "The Given Instrument Is Not Available As It Is Not Added For Renitng.");
        }
    }
}