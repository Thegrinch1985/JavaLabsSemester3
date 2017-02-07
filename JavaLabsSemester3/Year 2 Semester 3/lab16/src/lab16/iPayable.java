/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab16;

/**
 *
 * @author x00125128
 */
public interface iPayable {
    
    final double LOW_TAX_RATE = 23;
    final double HIGH_TAX_RATE = 42;
    final double VAT_RATE = 23.5;
    final double THREE = 300;
    
    public  double getPaymentAmount();
    
    
    
}
