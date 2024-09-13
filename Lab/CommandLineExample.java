public class CommandLineExample {
    public static void main(String[] args) 
    {
        if (args.length > 0) 
        {
            System.out.println("Command-line arguments passed:");
            for (int i = 0; i < args.length; i++) 
            {
                System.out.println("Argument " + i + ": " + args[i]);
            }
        } 
        else {
            System.out.println("No command-line arguments passed.");
        }
    }
}
