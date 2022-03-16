import java.util.ArrayList;
public class Order {
    private String name;
    double total;
    private boolean ready;
    private ArrayList<Item> items ;
    
    // getter and setter and constructor
    public Order(String name){
        this.name=name;
        this.items=new ArrayList<Item>();
    }
    public void setName(String name){
        this.name=name;
    }
    public void setReady(boolean ready){
        this.ready=ready;
    }
    public void setArrayList(ArrayList<Item> items){
        this.items=items;
    }
    public String getName(){
        return name;
    }
    public boolean getReady(){
        return ready;
    }
    public ArrayList<Item> getItems(){
        return items;
    }
    public void addItems(Item item){
        items.add(item);
    }
    public void display(){
        total=0;
        System.out.println("Customer name is : " + name);
        for ( Item item : items){
        System.out.println(item.getName() + ":" + item.getPrice());
        total+=item.getPrice();
    }
        System.out.println("Total :" + total);
    }
}