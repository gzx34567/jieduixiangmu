package calculate;

public class Test {

    public void testGener(){
        GenerNum g = new GenerNum();
        System.out.println(g.formula());
    }

    public void testCount(){
        Count c=new Count();
        System.out.println(c.count());
    }


    public void testStrToFraction(){
        Fraction fraction = new Fraction(2, 2, 5);
        System.out.println("分子：" + fraction.getNumerator());
        System.out.println("分母：" + fraction.getDenominator());
    }
}
