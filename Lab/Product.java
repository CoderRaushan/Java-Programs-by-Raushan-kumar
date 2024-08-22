public class Product 
{ 
     
    private String name;
    private int price;
    private int quantity;
    public Product(String name)
    {
        this.name=name;
        this.price=0;
        this.quantity=0;
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

    public static int calculatePrice()
    {
       return (price*quantity);
    }
    
    public static void Display()
    {
        int total=calculatePrice();
        System.out.println("Product Name: " + name);
        System.out.println("Price per Unit: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + totalPrice);
    }


    public static void main(String[] args)
    {
        // Creating a product with name and price
        Product p1 = new Product("Laptop", 50000, 2);
        p1.Display();

        // Creating a product with only name
        Product p2 = new Product("Mouse");
        p2.Display();
    }
};
