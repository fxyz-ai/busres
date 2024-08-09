package busreservation;

import java.util.ArrayList;
import java.util.Scanner;

public class Damo {
    public static void main(String[]args){
        ArrayList<Bus> buses=new ArrayList<Bus>();
        buses.add(new Bus(1,true,3));
        buses.add(new Bus(2,false,2));
        buses.add(new Bus(3,true,2));
        buses.add(new Bus(4,true,1));
        
        ArrayList<Booking> bookings=new ArrayList<Booking>();
        
        int ch=1;
        Scanner sc=new Scanner(System.in);
        for(Bus b:buses){
            b.display();
        }
        
        while(ch==1){
            System.out.println("Enter 1 to continue booking and 2 to exit");
            ch=sc.nextInt();
            sc.nextLine();
            if(ch==1){
                Booking b=new Booking();
                if(b.isAvail(bookings, buses)){
                    bookings.add(b);
                    System.out.println("Your booking is confirmed!!");
                }
                else{
                    System.out.println("Sorry!! Bus is full. Try another bus.");
                }
            }
        }
            
            
    }
}