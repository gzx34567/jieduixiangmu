package calculate;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

public class GenerNum {

    int max;

    public String FraNumber(){

        int a=(int)(1+Math.random()*(max-1));
        int b=(int)(1+Math.random()*(max-1));
        int c = (int)(b+1+Math.random()*(max-b));

        String d= +a+"'"+b + "/" + c;
        return d;
    }

    public String IntNumber(){


        Random random = new Random();
        int a = 1+random.nextInt(max - 2);
        String d = Integer.toString(a);
        return d;
    }


    public String symbol(int flag) {
        Random rand = new Random();
        String str = null;

        if(flag==1) {

            int a = rand.nextInt(4);
            if (a == 0)
                str = " + ";
            else if (a == 1)
                str = " - ";
            else if (a == 2)
                str = " × ";
            else if (a == 3)
                str = " ÷ ";
        } else{
            int a = rand.nextInt(2);

            if (a == 0)
                str = " + ";
            else if (a == 1)
                str = " - ";
        }
        return str;
    }

    public String formula(){
        boolean flag=true;
        String str = "";
        String str1="";
        int t;
        Random rand = new Random();
        t = rand.nextInt(3) + 2;
        String[] number = new String[t];
        String[] symbol = new String[t-1];
        String[] total = new String[4*t-3];
        String[] total1 = new String[4*t-3];
        for(int i = 0;i < t;i++) {
            int a=(int)(Math.random()*2);

            if(a==0){
                number[i] = IntNumber();
            }else
                number[i]=FraNumber();
        }

        for(int i = 0;i < t-1;i++) {
            symbol[i] = symbol(1);
                if(i>0) {
                    if (symbol[i - 1] == (" + ") | symbol[i - 1] == (" - ")) {
                        symbol[i] = symbol(2);
                    }
                }
        }

      for(int i = 0,j=0;j<t;j++) {
            total[i] = number[j];
           i+=2;
        }

        for(int i = 1,j=0;j<t-1;j++) {
            total[i] = symbol[j];
            i+=2;
        }
        for(int i = 0;i < 2*t-1;i++) {
            str = str + total[i];

        }

		 return str;
    }

   /*public static void main(String[] args) {
        GenerNum g=new GenerNum();
        System.out.println(g.formula());

    }*/
}
