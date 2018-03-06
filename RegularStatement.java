package com.company;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularStatement {
    public static void main(String[] args) {
        String str = "В последнее время часто приходится слышать безапелляционные заявления, " +
                "например: «Я ничего никому не должен». Их повторяет, считая хорошим тоном, немалое количество людей " +
                "самого разного возраста, в первую очередь молодых! А пожившие и умудренные еще более циничны в своих " +
                "суждениях: «Не надо ничего делать, потому что, пока россияне, забыв о завалившемся под лавку величии, " +
                "тихо пьют, всё идет своим чередом».";
        Pattern p = Pattern.compile("[.!]");
        Matcher m = p.matcher(str);
        String TestStringParts[] = p.split(str);
        for (int i=0; i<TestStringParts.length; i++)
        {
            System.out.println("Предложение "+(i+1));
            System.out.println(TestStringParts[i]);
        }
        int j=TestStringParts.length;
        for (int i=0; i<TestStringParts.length; i++)
        {
                TestStringParts[i] = m.replaceAll(TestStringParts[j-1]);
                j--;
                System.out.println("Предложение " + (i+1));
                System.out.println(TestStringParts[i]);
        }
    }
}
