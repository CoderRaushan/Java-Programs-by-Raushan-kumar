
class KyadeRahaHaiReException extends Exception {
    KyadeRahaHaiReException(String msg) {
        System.out.println(msg);
    }
}

public class ThrowException {
    public static void main(String[] args) {
        try {
            CheckAge(6);
        } catch (Exception e) {
            System.out.println("Exception occure:");
        }
    }

    public static void CheckAge(int age) throws KyadeRahaHaiReException {
        if (age < 18) {
            throw new KyadeRahaHaiReException("bhaak madharchod car chalyenge!");
        }
        else 
        {
            System.out.println("you can drive man!");
        }
    }
}