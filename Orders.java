import java.util.ArrayList;
public class Orders {


   private String name; // default value of null
   private boolean ready; // default value false
   private ArrayList<Items> items = new ArrayList<Items>(); // defaults to null
   

   public Orders() {
      this.name = "Guest";
      this.items = new ArrayList<Items>();

   }
   // CONSTRUCTOR
   // No arguments, sets name to "Guest", initializes items as an empty list.
   

   // OVERLOADED CONSTRUCTOR
   // Takes a name as an argument, sets name to this custom name.
   // Initializes items as an empty list.
   public Orders(String name){
      this.name = name;
      this.items = new ArrayList<Items>();
   }

   // ORDER METHODS
   
   public void addItem(Items item){
      items.add(item);
   }

   public String getStatusMessage() {
         if (this.ready) {
           
           return  "Your order is ready!";
         }
            return "Thanks for waiting. Your order will be ready soon.";
      }
   
   public double getOrderTotal() {
      double total = 0;
      for (Items item: items){
         total += item.getPrice();
      }
      return total;
   }

   public void display() {
      System.out.printf("Cusomter Name:   %s\n", this.name);
      for(Items item: items) {
         System.out.print( item.getName()+ "  $"+ item.getPrice() + "\n");
         
      }
      System.out.printf("The total is: %s\n", getOrderTotal());
   }
      // Most of your code will go here, 
      // so implement the getters and setters first!
   
   // GETTERS & SETTERS
   

   public String getName(){
      return this.name;
   }

   public void setName(String name){
      this.name = name;
   }

   public Boolean getReady() {
      return this.ready;
   }

   public void setReady(Boolean ready){
      this.ready = ready;
   }

   public ArrayList<Items> getItems(){
      return this.items;
   }

   public void setItems(ArrayList<Items> items){
      this.items = items;
   }
}

