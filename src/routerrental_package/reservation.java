/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routerrental_package;

import java.util.Date;

/**
 *
 * @author pc
 */
 public class reservation{
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

