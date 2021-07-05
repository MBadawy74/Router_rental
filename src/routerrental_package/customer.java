package routerrental_package;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
 public abstract class customer{
        private final int cust_id;
        protected String report;
        protected reservation reservation;
        protected invoice invoice;
        protected ArrayList<reservation>reserv=new ArrayList<>();//
        private int c=0;
          Date de;
     protected int ch;
       int cost=0;
    
    
        public customer(){
            report=" ";
            c++;
            cust_id=c;
        }
       private void calcreservationdate(){
               System.out.println("The Reservation date is");
               Date d1 =new Date();
               int m;  
               m=d1.getMonth()+1;
               Calendar c = Calendar.getInstance();
               System.out.println(c.get(Calendar.DAY_OF_MONTH)+" "+ m +" "+ c.get(Calendar.YEAR));
      }              
           public  Date startdate(){
 Calendar c1=(Calendar)Calendar.getInstance();
 Calendar c2=(Calendar)Calendar.getInstance();
 int day,month,year;
System.out.println("Enter the start date ");
Scanner input=new Scanner (System.in);
c1.set(Calendar.DAY_OF_MONTH, day=input.nextInt());
c1.set(Calendar.MONTH, month=input.nextInt()-1);
c1.set(Calendar.YEAR,year=input.nextInt());
Date d=c1.getTime();
c2.setTime(d);
return d;
}

 public  Date calcdateforextend(Date d,int duration){
    Scanner input=new Scanner (System.in);
Calendar c1=(Calendar)Calendar.getInstance();
 Calendar c2=(Calendar)Calendar.getInstance();
 int day,month,year;
 day=d.getDate();
 month=d.getMonth()+1;
 year=d.getYear()+1900;
  c1.set(Calendar.MONTH, month-1); 
        c1.set(Calendar.YEAR, year); 
        c1.set(Calendar.DAY_OF_MONTH, day); 
       c1.add(Calendar.DAY_OF_MONTH, duration);
        Date date = c1.getTime();
            return date;
 }
        public int getCust_id() {
        return cust_id;
    }
 

    public abstract void rent(router r1);
   
    public  Date calcdate(Date d,int ch){
    Scanner input=new Scanner (System.in);
Calendar c1=(Calendar)Calendar.getInstance();
 Calendar c2=(Calendar)Calendar.getInstance();
 int day,month,year;
 day=d.getDate();
 month=d.getMonth()+1;
 year=d.getYear()+1900;
  c1.set(Calendar.MONTH, month-1); 
        c1.set(Calendar.YEAR, year); 
        c1.set(Calendar.DAY_OF_MONTH, day); 
         Date dt = c1.getTime(); 
        c2.setTime(dt); 
    //System.out.println("Choose your reservation type (1 for day,2 for week,3 for month)");
//int ch=input.nextInt();
if(ch== 1){
 c2.add(Calendar.DAY_OF_MONTH, 1);
 dt=c2.getTime();
 System.out.println(dt); 
return dt;
}
else if (ch==2){
 c2.add(Calendar.WEEK_OF_YEAR, 1);
 dt=c2.getTime();         
 System.out.println(dt);
 return dt;         
         }	 
         else if (ch==3){
              c2.add(Calendar.MONTH, 1);
 dt=c2.getTime();
 System.out.println(dt);
 return d;        
         }
        else
             return null;
}

        public void extend(reservation router_reserve){
        Scanner k=new Scanner(System.in);
              for(int i=0;i<reserv.size();i++){
              if(reserv.get(i).equals(router_reserve)){
                  System.out.println("Enter duration in days");
                  int d=k.nextInt();
                 Date newdate=calcdateforextend(reservation.getEnddate(),d);
                  System.out.println(newdate);
              }
              }
              System.out.println("Reservation extended succefully");
        }
        public void cancel(reservation cancel_reserve){
             int reservation_date=reservation.getReservdate().getDate();
          int end_date=reservation.getEnddate().getDate();
                        if((end_date-reservation_date)<=2){
          try{
                  throw new exp("You can't Cancel your rent please check today's date");
 
          }
           catch(exp ex){
               System.out.println(ex.getMessage());
           }
          }
                        else if((end_date-reservation_date)>2){
 
              for(int i=0;i<reserv.size();i++){
                  if(reserv.get(i)==cancel_reserve){
                      reserv.remove(cancel_reserve);
                      break;
                  }
              }
          System.out.println("Your rent has been cancelled");
          }
        }
        
        public void change(router r){
 
            rent(r);
       System.out.println("You rent has been changed to: ");
            System.out.println(r.getModel()+" "+r.serialnum);
 
        }
        public void change(int rnum,router r){
            boolean find=false;
              for(int i=0;i<reserv.size();i++){
                  if(reserv.get(i).getRouter().serialnum==rnum){
find=true;
reserv.add(reserv.get(i));
                  }
              }
            try{
                if(find==false)
                    throw new StringIndexOutOfBoundsException("please enter valid one");
            }
catch(StringIndexOutOfBoundsException x){
        System.out.println("Not found"+x.getMessage());
        }
        }
 
        public String feedback(String msg){
       this.report=msg; 
        System.out.println(msg);
       return msg;
        }
 
    public String getReport() {
        return report;
    }
    
    public int getCost() {
        return cost;
    }
       }  
 

 