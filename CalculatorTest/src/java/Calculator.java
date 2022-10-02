public class Calculator {

    public static int sum(int first, int second){
        return first + second;
    }

    public static int spacing(int first, int second){
        return first - second;
    }

    public static int multiplication(int first, int second){
        return first * second;
    }

    public static float divide(int first, int second){
        return first / second;
    }

    public static int pow(int number, int stepen){
        int result = number;

        for(int i = 0; i < stepen - 1; i++)
            result *= number;

        return result;
    }
}
