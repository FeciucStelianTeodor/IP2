/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author michael
 */
public class Cos {
    private static Cos instance = null;
    private Cos()
    {
        
    }
    
    public static Cos getInstance()
    {
        if(instance == null)
        {
            instance = new Cos();
        }
        return instance;
    }
}
