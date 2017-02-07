/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcompany;

/**
 *
 * @author Howie
 */
public class Staff {
    
    StaffMember[] ex1;
    
    public Staff() {
        
        ex1 = new StaffMember[]{new Executive("John", "1 This Street ",
                "0988883444", "0867754833", 2423.07),
            new Employee("Paul", "2 That Street", "0987665544", "S98886644", 1246.15),
            new Employee("Daver", "3 That Street", "0444465544", "S1212644", 1169.23),
            new Hourly("Joanne", "4 long drive", "086217644", "09876564", 10.55),
            new Volunteer("Norma", "5 short avenue", "0986665554"),
            new Volunteer("Kate", "6 short avenue", "44465554"),
            new Commission("Molly", "7 nowhere road", "0987766655", "09474646744", 6.25, .2),
            new Commission("Joe", "8 my place ", "098887767", "w098777666", 9.75, .15)};
        
    }
    
    public void processStaff() {
        
        for (int i = 0; i < ex1.length; i++) {
            if ((ex1[i] instanceof Executive)&& (ex1[i].name.equals("John"))) {
                
                Executive e = (Executive) ex1[i];
                e.awardBonus(500);
            } else if ((ex1[i] instanceof Hourly)&& (ex1[i].name.equals("Joanne")) ){
                Hourly h = (Hourly) ex1[i];
                h.addHours(50);
                
            } else if ((ex1[i] instanceof Commission)&& (ex1[i].name.equals("Molly"))) {
                
                Commission c = (Commission) ex1[i];
                c.addSales(400);
                c.addHours(55);
                
            }
            else if((ex1[i]instanceof Commission)&& (ex1[i].name.equals("Joe")))
            {
            Commission c1 =(Commission)ex1[i];
            c1.addSales(950);
            c1.addHours(45);
            }
            
        }
        
    }
    
    public void payDay(){
        
        for(int i = 0;i < ex1.length;i++)
        {
        System.out.println(ex1[i]);
        ex1[i].pay();
            
        
        }
            
    
    
    }
}
