public class OrderTest {
   

   public static void main(String[] args) {

      Items item1 = new Items("Drip", 2.2);
      Items item2 = new Items("Capuccino", 1.2);
      Items item3 = new Items("Mocha", 2.5);
      Items item4 = new Items("Latte", 3.7);


      Orders order1 = new Orders();
      Orders order2 = new Orders();

      Orders order3= new Orders("Lauren");
      Orders order4 = new Orders("Bandit");
      Orders order5 = new Orders("Parker");
      
      order1.display(); //We  have to have display after adding the items because this will result in 0.0 if displayed before

      order1.addItem(item1);
      order1.addItem(item2);

      
      
      order1.setReady(true);
      System.out.println(order2.getStatusMessage());
      
      order1.getOrderTotal();
      System.out.println(order2.getOrderTotal());
      

      
       order1.display();
   }

}
