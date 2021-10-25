package calculate;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Check {
    public static void check() throws Exception {

      /*  FileWriter fw = new FileWriter("D:/cal/Grade.txt");
        BufferedWriter bw = new BufferedWriter(fw);*/
   /*     Scanner sc = new Scanner(System.in);
        String n = sc.next();
        System.out.println("输入题目存放路径");*/
        FileReader fr1 = new FileReader("Exercises.txt");
        BufferedReader br1 = new BufferedReader(fr1);
     /*   System.out.println("输入答案存放路径");
        String r = sc.next();*/
        FileReader fr2 = new FileReader("Answers.txt");
        BufferedReader br2 = new BufferedReader(fr2);
        int correct=0;
        int wrong=0;
        String s1[]=new String[20000];
        String s2[]=new String[20000];
        String line=null;
        String right="Correct (";
        String mistake="Wrong (";
        int i=1;

        while ((line=br1.readLine())!=null) {

            String[] s = line.split("=",-1);
            s1[i]=s[1];

           // System.out.println(s1[i]);
            if ((line = br2.readLine()) != null) {
                String[] ss=line.split(" ");
                s2[i]=ss[1];
                if(s1[i].equals(s2[i])) {
                    correct++;
                    right=right+i+",";

                }else
                    wrong++;
                    mistake=mistake+i+",";
                //System.out.println(s2[i]);
                i++;
            }
        }
        right=right+")";
        mistake=mistake+")";
        System.out.println(right);
        System.out.println(mistake);


     /*  s=line.split("-");

            System.out.print(s[0]);
        System.out.print(s[1]);                         */
        br1.close();

    }
    }
