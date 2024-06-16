package Task2.Tasks.Kruchkov;

public class KruchkovTask2 {
    public static void main(String[] args)
            {


        System.out.println("Task  2 call example");
        Fraction fr = new Fraction(7,8);
        Fractionable casheNum =  UtilLib.cashe(fr);
                casheNum.setDenum(8);
        casheNum.doubleValue();

        casheNum.doubleValue();
        casheNum.reverseValue();
        casheNum.reverseValue();
                System.out.println(casheNum.doubleValue());
        casheNum.setNum(3);

        casheNum.doubleValue();
        casheNum.doubleValue();
                casheNum.reverseValue();
                casheNum.reverseValue();
                System.out.println(casheNum.doubleValue());
        casheNum.setNum(4);
                casheNum.doubleValue();
                casheNum.doubleValue();
                casheNum.reverseValue();
                casheNum.reverseValue();
                System.out.println(casheNum.doubleValue());
        if ( fr.count != 3 )   {
            System.out.println("Каш 1 не работает "+fr.count);
        }

        if ( fr.countR != 3 )   {
                    System.out.println("Каш 2 не работает "+fr.count);
                }

    }
}
