package busreservation;

public class Bus {
    private int busno;
    private boolean ac;
    private int capacity;
    
    Bus(int busno,boolean ac,int capacity){
        this.busno=busno;
        this.ac=ac;
        this.capacity=capacity;
    }
    
    public int getBusno(){
        return busno;
    }
    public boolean getAc(){
        return ac;
    }
    public int getCapacity(){
        return capacity;
    }
     public void setAc(boolean ac){
         this.ac=ac;
     }
     public void setCapacity(int capacity){
         this.capacity=capacity;
     }
     
     void display(){
         System.out.println("Bus Number: "+busno+"A/C? "+ac+"Capacity: "+capacity);
     }
}
