/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testrockband;

/**
 *
 * @author Howie
 */
public class Rockband {

    private String bandName;
    private String label;
    private Musician[] members;

    public Rockband(String nameIn, String labelIn, String mnamesIn[], String instrumentsIn[]) {
        int bandsize = mnamesIn.length;
        bandName = nameIn;
        label = labelIn;

        members = new Musician[bandsize];

        for (int i = 0; i < members.length; i++) {
            members[i] = new Musician(mnamesIn[i], instrumentsIn[i]);
        }

    }

    public boolean changeRecordLabel(String labelIn) {

        if (labelIn.equals(label)) {
            return false;
        } else {
            label = labelIn;
            return true;
        }

    }
    public String toString(){
        
        String s = "";
      
        s += "Rock Band : " + "\n\t" + "Name : " + bandName + "\n\t" + "Record Company : " + label + "\n" ;
        
        for(int i = 0; i < members.length;i++)
        {
        s+= members[i];
        }
        
        return s;
    
    }
}
