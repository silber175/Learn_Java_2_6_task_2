package Task2.Tasks.Kruchkov;

public class Fraction implements Fractionable {
    private int num;
    private int denum;
    private double tmp;
    int count = 0;
    int countR = 0;

    public Fraction(int num, int denum)    {
        this.num = num;
        this.denum = denum;
    }

    @Mutator
    public void setNum(int num)    {
        this.num = num;
    }
    @Mutator
    public void setDenum(int denum)     {
        this.denum = denum;
    }

    public int getDenum(){
        return this.denum ;
    }
    @Cashe
    public double doubleValue()    {
      //  System.out.println("выполнение расчета значения");
        count++;
        return (double) this.num/this.denum;
    }

    @Cashe
    public double reverseValue()    {
     //   System.out.println("выполнение расчета значения");
        countR++;
        return (double) this.denum/this.num;
    }

}


