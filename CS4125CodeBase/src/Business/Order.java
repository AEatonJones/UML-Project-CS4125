package Business;

import Business.Profiles.Cafe;
import Data.MenuItem;

public class Order implements Comparable<Order>{
    
    private MenuItem [] menuItems;
    private int etf;
    
    public Order(MenuItem [] menuItems){
        this.menuItems = menuItems;
        this.etf = this.menuItems.length * 3;
    }
    
    

    public float getCost()
    {
        float cost = 0.0f;
        
        for(MenuItem item : menuItems){
            cost += item.getCost();
        }
        
        return cost;
    }
    
    public Cafe getCafe()
    {
        return menuItems[0].getCafe();
    }

    public int getEtf()
    {
        return etf;
    }
    
    @Override
    public int compareTo(Order o)
    {
        int result = 0;
        
        if(this.etf < o.getEtf()){
            result--;
        }
        
        else if(this.etf > o.getEtf()){
            result++;
        }
        
        return result;
    }
}