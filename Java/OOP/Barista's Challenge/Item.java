public class Item {
    private String name;
    private double price;
    // private boolean ready;
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getprice(){
        return this.price;
    }
    public void setName(double price){
        this.price = price;
    }
    
    public Item(String name , double price){
        this.name = name ;
        this.price = price;
    }
    // public void addItem(){

    // }
    // public void getStatusMessage(boolean ready){
    //     this.ready = false;
    //     if (this.ready ==false){
    //         System.out.println("Your order is not ready");
    //     }
    //     else{
    //         System.out.println("Your order is ready");
    //     }
    // }
}
