public class Shirt {
  public int shirtID = 404; // стандартне значення номера моделі сорочки
  public String description = "Friend, you have a nice shirt!"; // стандартний опис сорочки
  public String colorCode = "red";
  public double price = 70.0; // стандартна вартість сорочки
  public int quantityInStock = 0; // стандартна кількість на складі
  
  // цей метод просто виводить всю інформацію про сорочку на екран
  public void displayShirtInformation() {
    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description:" + description);
    System.out.println("Color Code: " + colorCode);
    System.out.println("Shirt price: $" + price);
    System.out.println("Quantity in stock: " + quantityInStock);
  } // кінець методу displayShirtInformation
} // кінець опису класуn