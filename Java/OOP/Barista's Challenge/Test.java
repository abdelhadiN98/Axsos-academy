public class Test {

    public static void main(String []args){
        Order order1 = new Order();
        Item item1 = new Item("cappucino",11.5);
        Item item2 = new Item("mocha",14.5);
        item1.getName();
        // item1.name = "cappu";
        System.out.println(order1.getName());
        order1.setStatus(false);
        System.out.println(order1.status());

        order1.addItem(item1);
        order1.addItem(item2);
        order1.display();
    }
    
}
