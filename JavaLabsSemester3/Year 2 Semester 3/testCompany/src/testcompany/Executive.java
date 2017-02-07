
package testcompany;

public class Executive extends Employee{
        
        private double bonus;
        
            public Executive(String nameIn, String addressIn, String numberIn, String rsiNumberIn, double payIn) {
            super(nameIn, addressIn, numberIn, rsiNumberIn, payIn);
            bonus = 0;

        }
            public void awardBonus(double bonusIn){
                
                bonus = bonusIn;
            
            }
            public double pay(){
                
                double pay = 0;
                
               pay +=super.pay() +  bonus;
                return pay;
            
            }
          public String toString(){
            
            String s; 
            s = super.toString() +"\n";
            return s;
        
        }
            
    
    
    }