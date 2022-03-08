import java.util.ArrayList;
public class Order {
    private String name;
    private Boolean ready;
    ArrayList<Item> items = new ArrayList<Item>();


    public Order(){
        this.name = "Guest";
        
    }
    public Order(String name , Boolean ready){
        this.name = name;
        this.ready = ready;
    }
    public String getName(){
        return this.name;
    } 
    public void setName(String name){
        this.name = name;
    }
    public Boolean getStatus(){
        return this.ready;
    }
    public void setStatus(Boolean ready){
        this.ready = ready;
    }
    public void addItem(Item Item){
        this.items.add(Item);
    }
    public String status(){
        if (this.ready == true){
            return"Your Order is ready";
        }
        else{
            return"Thank you for waiting , Your order will be ready soon";
        }

    }
    public void display(){
        double total = 0;
        System.out.println("customer name :" + this.name);
        for (int i=0 ; i<this.items.size() ; i++){
            System.out.println(this.items.get(i).getName() + "   - " + "   " + this.items.get(i).getprice());
            
        }
        double total_prices = this.getTotal();
        System.out.println(total_prices);
    }
    public double getTotal(){
        double total = 0;
        for (int i=0 ; i<this.items.size() ; i++){
            total +=this.items.get(i).getprice();
        }
        return total;
    }
}
