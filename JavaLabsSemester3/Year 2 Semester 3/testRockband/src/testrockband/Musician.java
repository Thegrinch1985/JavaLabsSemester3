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
public class Musician extends Person{
    
    private String instrument;
    
    public Musician(String nameIn,String instrumentIn){
        
        super(nameIn);
        instrument =instrumentIn;
    
    }
    @Override
    public String toString(){
        
        String s;
        
        s = super.toString() + " Plays " + getInstrument()+"\n";
        return s;
    
    }

    /**
     * @return the instrument
     */
    public String getInstrument() {
        return instrument;
    }

    /**
     * @param instrument the instrument to set
     */
    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }
    
}
