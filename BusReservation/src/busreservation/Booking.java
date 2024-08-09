package busreservation;

import java.text.*;
import java.util.*;

public class Booking {
    Scanner sc=new Scanner(System.in);
    private String name;
    private int busno;
    private Date date;
    
    Booking(){
        System.out.println("Enter name: ");
        String name=sc.next();
        sc.nextLine();
        System.out.println("Enter bus number: ");
        int busno=sc.nextInt();
        System.out.println("Enter date of travel: ");
        String fordate=sc.next();
        SimpleDateFormat condate=new SimpleDateFormat("DD-MM-YYYY");
        try{
            date=condate.parse(fordate);
        }
        catch(ParseException e){
            e.printStackTrace();
        }
    }
    
    public boolean isAvail(ArrayList<Booking> bookings, ArrayList<Bus> buses){
        int capac=0;
        for(Bus bus:buses){
            if(bus.getBusno()==busno)
                capac=bus.getCapacity();
        }
        
        int bkd=0;
        for(Booking b:bookings){
            if(b.busno==busno && b.date.equals(date)){
                bkd++;
            }
        }   
        return bkd>capac?true:false;
    }
}
