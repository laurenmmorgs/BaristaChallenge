public class Items {
    
   // MEMBER VARIABLES
   private String name;
   private double price;
   
   // CONSTRUCTOR
   //   Takes a name and price as arguments 
   //   and sets them accordingly

   public Items(String name, Double price) {
      this.name = name;
      this.price = price;
   }
   
   // GETTERS & SETTERS  - for name and price

   public String getName() {
      return this.name;
   }
   public void setName(String name){
      this.name = name;
   }

   public Double getPrice(){
      return this.price;
   }

   public void setPrice(double price){
      this.price = price;
   }
}