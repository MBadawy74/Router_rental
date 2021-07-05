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

    public class router{
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