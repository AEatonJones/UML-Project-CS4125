package Business.Information_Managers;

import Business.Orders.Order;
import Data.OrderDB;

/**
* An interface which describes an order observer.
*/
public interface OrderObserver{
    /**
     * Uses the provided action on the given Order.
     * @param order The affecting order.
     * @param action The specified action to use on the order.
     */
    public abstract void update(Order order, String action);
    
}
