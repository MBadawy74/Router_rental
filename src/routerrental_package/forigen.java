/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routerrental_package;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author pc
 */
  class forigen extends customer{
        @Override
        public void rent(router r1) {
 
      Scanner k=new Scanner(System.in);
 Date d=new Date();
           System.out.println("Choose your reservation type (1 for day,2 for week,3 for month)");
int ch=k.nextInt();
Date df=startdate();
 reservation=new reservation(r1,d,df,calcdate(df,ch));
 reserv.add(reservation);
   if(ch==1){
   cost+=(1*r1.getPriceperday());
       }
  else if(ch==2){
   cost+=(7*r1.getPriceperday());
       }
  else if(ch==3){
   cost+=(30*r1.getPriceperday());
       }
   
System.out.println("Total price is: "+cost);
 System.out.println(" Reservation ID is: "+reservation.getReservnum()+" Router model is: "+reservation.getRouter().getModel()+
    " Number of ports are: "+reservation.getRouter().getNumofports());
 
        }
 
                    }         