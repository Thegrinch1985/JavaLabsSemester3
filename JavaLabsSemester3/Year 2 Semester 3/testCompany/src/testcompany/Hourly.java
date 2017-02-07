
package testcompany;

  public class Hourly extends Employee {

        private int hoursWorked;
        
        public Hourly(String nameIn, String addressIn, String numberIn, String rsiNumberIn, double payIn) {
            super(nameIn, addressIn, numberIn, rsiNumberIn, payIn);
            hoursWorked = 0;

        }

        public void addHours(int hoursIn) {
            hoursWorked = hoursIn;

        }

        public double pay() {
            double pay = 0;
            double overtime = hoursWorked - 40;
            if (hoursWorked > 40) {
                pay = (hoursWorked - overtime)* rateOfPay
                        +((overtime) * (rateOfPay * 1.5));
            }

            return pay;

        }
        @Override
        public String toString(){
            
            String s; 
            s = super.toString()+ "hours Worked :\t" + hoursWorked  +"\n";
            return s;
        
        }
    }