/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testuniversity;

/**
 *
 * @author x00125128
 */
public class TestUniversity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] ids = {1,2,3,4};
        String [] names = {"Computing","Business","Languages","Engineering"};
        
        University ex1 = new University("DCU",names,ids);
        System.out.println(ex1.getUniversityName());
        ex1.showList();
        
        
        

    }
    
}
