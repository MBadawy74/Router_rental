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
 
     class router{
    public int serialnum;
    private String model;
    private int numofports;
    private int priceperday;
    private static int cntr=0;
 
      public router(){   
    model="";
    numofports=0;
    cntr++;
    serialnum=cntr;
    }
        public router(int serialnum,String model, int numofports,int priceperday){   
        this.serialnum=serialnum;
        this.model=model;
        this.numofports=numofports;
        this.priceperday=priceperday;
    }
    public final void addr(int serialnum,String model, int numofports,int priceperday){   
        this.serialnum=serialnum;
        this.model=model;
        this.numofports=numofports;
        this.priceperday=priceperday;
    }
    public void display(){
        System.out.println("The Serial number of router is: "+serialnum+ " Router model is: "+ model+
                " Number of ports are: "+numofports+" The Router price is: "+priceperday);
    }
        public int getSerialnum() {
            return serialnum;
        }
 
        public void setSerialnum(int serialnum) {
            this.serialnum = serialnum;
        }
 
        public String getModel() {
            return model;
        }
 
        public void setModel(String model) {
            this.model = model;
        }
 
        public int getNumofports() {
            return numofports;
        }
 
        public void setNumofports(int numofports) {
            this.numofports = numofports;
        }
 
        public int getPriceperday() {
            return priceperday;
        }
 
        public void setPriceperday(int priceperday) {
            this.priceperday = priceperday;
        }
 
        public static int getCntr() {
            return cntr;
        }
 
        public static void setCntr(int cntr) {
            router.cntr = cntr;
        }
 
 
    }      
    class exp extends Exception{
 
        public exp(String msg) {
        super(msg);
        }
 
    }
    class reservation{
       private customer customer;
       private  router router;
        private int reservnum;
         protected Date reservdate;
       protected Date startdate;
        protected Date enddate;
       
    public reservation(router r, Date reservdate, Date startdate, Date enddate) {
        this.router = r;
        this.reservdate = reservdate;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public Date getReservdate() {
        return reservdate;
    }

    public void setReservdate(Date reservdate) {
        this.reservdate = reservdate;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

        public customer getCustomer() {
            return customer;
        }
 
        public void setCustomer(customer customer) {
            this.customer = customer;
        }
 
        public router getRouter() {
            return router;
        }
 
        public void setRouter(router router) {
            this.router = router;
        }
 
        public int getReservnum() {
            return reservnum;
        }
 
        public void setReservnum(int reservnum) {
            this.reservnum = reservnum;
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
        
        
    abstract class customer{
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
 



   class resid extends customer{
private final double routerdisc;
public resid(){
routerdisc=0.25;
}
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
   cost+=(r1.getPriceperday()-(1*r1.getPriceperday())*routerdisc);
       }
  else if(ch==2){
   cost+=((r1.getPriceperday()*7)-(7*r1.getPriceperday())*routerdisc);
       }
  else if(ch==3){
   cost+=((r1.getPriceperday()*30)-(30*r1.getPriceperday())*routerdisc);
      
  }
 System.out.println("Total price is: "+cost);
 System.out.println(" Reservation ID is: "+reservation.getReservnum()+" Router model is: "+reservation.getRouter().getModel()+
    " Number of ports are: "+reservation.getRouter().getNumofports());
 }
   }    
 
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
 
        Cuts[0]=new resid();
        Cuts[1]=new resid();
        Cuts[2]=new resid();
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
 
 
 
      // Cuts[0].rent(routers.get(0));
    //    Cuts[0].invoice.displaydetails();

    // Cuts[1].rent(routers.get(1));
     //  Cuts[1].change(routers.get(3));

     //   Cuts[2].rent(routers.get(2));
     //   Cuts[2].cancel(cuts[2].reservation);
//        
      // Cuts[3].rent(routers.get(3));
    //  Cuts[3].extend(cuts[3].reservation);
        
       // Cuts[4].rent(routers.get(4));
       // Cuts[4].feedback("Bad kind of router");
    }
}