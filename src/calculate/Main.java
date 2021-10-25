package calculate;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        FileWriter fw1 = new FileWriter("Exercises.txt");
        BufferedWriter bw1 = new BufferedWriter(fw1);
        FileWriter fw2 = new FileWriter("Answers.txt");
        BufferedWriter bw2 = new BufferedWriter(fw2);
        Scanner sc = new Scanner(System.in);
        Scanner sccc = new Scanner(System.in);
        System.out.println("请输入题目个数");
        String n = sc.next();
        int num=Integer.parseInt(n);
        System.out.println("请输入最大值");
        String r = sc.next();
        int max=Integer.parseInt(r);

        for(int i=0;i<num;i++){
            Count a=new Count();
            a.maxium=max;
            String flag=a.count();

            if(flag!="F") {
                String s=Integer.toString(i+1);
                String[] str=flag.split("=");
                bw1.write(s+". "+str[0]+"=");
                bw1.newLine();
                bw1.flush();

                bw2.write(s+". "+str[1]);
                bw2.newLine();
                bw2.flush();

                //System.out.println(a.count());
            }else{
                i=i-1;
            }
        }
        bw1.close();
        bw2.close();
        System.out.println("请在Exercise.txt上输入答案，完成后在命令行输入任意数字提交");
       String answerpath = sccc.next();
        Check.check();


    }
}
