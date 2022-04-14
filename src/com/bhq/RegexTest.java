package com.bhq;

/**
 * @author bhq
 * @date 2022/4/14--18:45
 */
public class RegexTest {
    public static void main(String[] args) {
//        String regex = "[^a-zA-Z0-9]*";
        String regex = "\\W*";
        String content = "白汉淇";
        System.out.println(content.matches(regex));

        String r2 = "[a-z]{1}\\w{3,8}";
        String c2 = "fdgdfe";
        System.out.println(c2.matches(r2));

        String r3 = "([0-9]{3,4})-([0-9]{7,8})";
        String c3 = "0101-1363267";
        System.out.println(c3.matches(r3));


    }

}
