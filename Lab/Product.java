public class Product 
{ 
    public  String name;
    public  int price;
    public  int quantity;
    public  Product(String name)
    {
        this.name=name;
    }
    public Product(String name,int price)
    {
        this.name=name;
        this.price=price;
    }
    public Product(String name,int price,int quantity)
    {
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public  int calculatePrice()
    {
       return (price*quantity);
    }
    
    public void Display()
    {
        int total=calculatePrice();
        System.out.println("Product Name: " + name);
        System.out.println("Price per Unit: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + total);
    }

    public static void main(String[] args)
    {

        Product p1 = new Product("Laptop");
        p1.Display();

        Product p2 = new Product("Mouse",55,9);
        p2.Display();
        // Display();
    }
};
