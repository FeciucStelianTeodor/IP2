/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.LinkedList;

/**
 *
 * @author michael
 */
public class Cos {
    private LinkedList<Item> items;
    private static Cos instance = null;
    
    private Cos()
    {
        this.items = new LinkedList<>();
    }
    
    public static Cos getInstance()
    {
        if(instance == null)
        {
            instance = new Cos();
        }
        return instance;
    }
    
    public void addItem(Item item)
    {
        this.items.add(item);
    }
    
    public void removeItem(Item item)
    {
        this.items.remove(item);
    }
    
    public int checkOut()
    {
        int sum = 0;
        for(Item item : items)
            sum += item.getPrice();
        return sum;
    }
}
