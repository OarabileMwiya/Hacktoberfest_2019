

import java.util.*;
/**
 * Write a description of class TheShoppingBasket here.
 *
 * @author (Oarabile Mwiya)
 * @version (Final)
 */
public class TheShoppingBasket
{

    // instance variables 
    
    private ArrayList<Items> items;
    
    // initialisation of instance variables
    
    public TheShoppingBasket()
    {
        items = new ArrayList<Items>();
    }

    //A method used to add an item to the collection
 
    
    public void addNewItem(int code, String name, double price)
    {
        Items newItem = new Items(code, name, price);
        items.add(newItem);
    }
    //count the number of items in the collection
    public int getItemsCount()
    {
        return items.size();
    }
    //Method used to display items in the basket
    public void printItems()
    {
        int index = 1;
        for( Items item : items)
        {
            System.out.println(index+". The item Code is: "+item.getCode()+"\n"+
            " Item Name: "+item.getName()+"\n"+" Item  Price: P"+item.getPrice());
            index++;
        }
   
    }
    //Method that gives the sum of items..
    
    public double itemTotal()
    {
        double total = 0;
        for(Items item : items)
        {
            total = total + item.getPrice();
        }
        return total;
   }
   // method that removes all items whose price is greater than some maximum
   public void lessItems(int maximum)
   {
       for(Items item : items)
       {
           if(maximum < item.getPrice())
           {
               items.remove(item);
           }
       }
   }
}


