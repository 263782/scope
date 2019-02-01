import packageA.*;

public class Main
{

    public static void main(String[] args)
    {
        testFunction testFunction = new testFunction();
        pClass pClass = new pClass();

        testFunction();
        pClass.testFunction();
        testFunction.testFunction();
    }

    public static void testFunction()
    {
        boolean test = true;

        System.out.println("Variabele in functie: " + test);
    }
}
