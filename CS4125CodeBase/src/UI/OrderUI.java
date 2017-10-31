package UI;

import Business.Information_Managers.OrderObserver;
import Business.Orders.Order;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class OrderUI implements UI, OrderObserver{

    ArrayList<Order> orders;
    
    @Override
    public void update(Order order, String action)
    {
        switch (action){
            
            case "ADD": orders.add(order);break;
            
            case "DEL": orders.remove(order);break;
            
        }
    }

    @Override
    public void draw()
    {
        
    }
    
}
