import java.util.ArrayList;
public class TestOrders {
    
    public static void main(String[] args){
        // for items name and price
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();
        item1.name = "mocha";
        item2.name = "latte";
        item3.name = "drip coffee";
        item4.name = "capuccino";
        item1.price = 10.5;
        item2.price = 15.5;
        item3.price = 12.5;
        item4.price = 14.5;
        // for orders :
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();
        order1.name = "Cindhuri";
        order2.name = "Jimmy";
        order3.name = "Noah";
        order4.name = "Sam";
        System.out.println(order1.total);
        // double total =(item1.price + item2.price);
        // ArrayList<Item> items = new ArrayList<Item>();
        order2.items.add(item1);
        order2.total+=item1.price;
        System.out.println(order2.total);
        System.out.println("list of Jimmy :" +order2.items);
        order3.items.add(item4);
        System.out.println("list of Noah :" +order3.items);
        order4.items.add(item2);
        order4.items.add(item2);
        System.out.println("list of Sam :" +order4.items);
        order1.ready = true;
        System.out.println("Cindhuri status order is : " + order1.ready );
        int count = order4.items.size();
        System.out.println("Sam order's count is :" + count);
        order2.ready = true;
        System.out.println("Jimmy status order is : " + order2.ready );
    }
}
