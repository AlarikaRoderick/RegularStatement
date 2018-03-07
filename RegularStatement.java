package com.company;
import java.util.*;
import java.util.regex.*;
import java.io.*;

public class RegularStatement {
    public static void main(String[] args) throws Exception {
        Pattern p = Pattern.compile("[.!]");

            BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Helena\\Desktop\\test.txt"));
            String line;
            List<String> lines = new ArrayList<String>();
            while((line = file.readLine())!= null) {
                lines.add(line);
            }
            String [] linesArray = lines.toArray(new String[lines.size()]);
            for(int i=0; i<linesArray.length; i++)
            {
                System.out.println(linesArray[i]);
            }
            String NewStr = Arrays.toString(linesArray);
        String TestStringParts[] = p.split(NewStr);
        for (int i=0; i<TestStringParts.length; i++)
        {
            System.out.println("Предложение "+(i+1));
            System.out.println(TestStringParts[i]);
        }

        try(FileWriter FileWithNewStr = new FileWriter("C:\\Users\\Helena\\Desktop\\test1.txt")){
            for (int i=TestStringParts.length-1; i>0; i--) {
                FileWithNewStr.write(TestStringParts[i]+"\n");

            }
            FileWithNewStr.flush();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}


