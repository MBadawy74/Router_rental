/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routerrental_package;
 
/**
 *
 * @author pc
 */
import java.util.*;
      
    class exp extends Exception{
 
        public exp(String msg) {
        super(msg);
        }
 
    }
   


     interface message{
     
     public final String msg="We are glad to serve you";
     public void printmsg();
     
     }   
         class message1 implements message{
            
             @Override
             public void printmsg(){
                 System.out.println(message.msg);
             }
        }
 
   
 
     class invoice{
       public reservation r_reserve;
       public customer c;

public void displaydetails(){
    System.out.println("Total price is: "+c.getCost()+" Reservation ID is: "+r_reserve.getReservnum()+" Router model is: "
            +r_reserve.getRouter().getModel()+" Number of ports are: "+r_reserve.getRouter().getNumofports());
 
}
 
    }
 
 
 
    /**
     * @param args the command line arguments
     */
public class routerrental_package {
 
    public static void main(String[] args) {
 
        
         customer Cuts[]=new customer[5];
 
        Cuts[0]=new resid() {};
        Cuts[1]=new resid() {};
        Cuts[2]=new resid() {};
        Cuts[3]=new forigen();  
        Cuts[4]=new forigen();
    ArrayList<router> routers =new ArrayList<router>();
router r;
     r=new router(10001,"ZTE110",5,100);
        routers.add(r);
     r=new router(10002,"ZTE111",3,120);  
        routers.add(r);
        r=new router(10003,"ZTE112",6,150);      
        routers.add(r);
        r=new router(10004,"ZTE113",7,170);
        routers.add(r);
     r=new router(10005,"ZTE114",8,200);
        routers.add(r);
   System.out.println("Avaliable Routers: ");
        for (router r11 : routers) {
            r11.display();
        } 
        
        
                         //CHOOSE THE FUNCTION AND UNHIDE IT
 
 
 
     //  Cuts[0].rent(routers.get(0));
    
    // Cuts[1].rent(routers.get(1));
     //  Cuts[1].change(routers.get(3));

      //  Cuts[2].rent(routers.get(2));
     //   Cuts[2].cancel(Cuts[2].reservation);
//        
    //   Cuts[3].rent(routers.get(3));
     // Cuts[3].extend(Cuts[3].reservation);
        
       // Cuts[4].rent(routers.get(4));
       // Cuts[4].feedback("Bad kind of router");
    }
}