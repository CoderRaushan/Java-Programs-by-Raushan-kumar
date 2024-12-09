


public class Throw {
    public static void main(String[] args) {
        try {
            CheckAge(6);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occure:"+e.getMessage());
        }
    }

    public static void CheckAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("bhaak madharchod car chalyenge!");
        }
        else 
        {
            System.out.println("you can drive man!");
        }
    }
}