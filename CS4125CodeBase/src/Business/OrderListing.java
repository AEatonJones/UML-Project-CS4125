package Business;

import Business.Orders.Order;
import java.util.ArrayList;

public class OrderListing implements Listing<Order>{

    private ArrayList<Order> waiting = new ArrayList<Order>();
    private ArrayList<Order> ready = new ArrayList<Order>();
    
    public int amountWaiting()
    {
        return waiting.size();
    }
    
    public int amountReady()
    {
        return ready.size();
    }
    
    public ArrayList<Order> getWaitingOrders(){
        return waiting;
    }
    
    public ArrayList<Order> getReadyOrders(){
        return waiting;
    }
    
    @Override
    public void sortListing(){
        waiting.sort(null);
    }

    @Override
    public void push(Order listItem){
        waiting.add(listItem);
        sortListing();
    }

    @Override
    public void pick(Order listItem)
    {
        waiting.remove(listItem);
        ready.add(listItem);
    } 
}