package com.bhq;

import java.util.Scanner;

/**
 * @author bhq
 * @date 2022/4/14--12:11
 */
//数据校验类
public class TelNoteRegex {

    public static void main(String[] args) {
        TelNoteRegex regex = new TelNoteRegex();
//        int i = regex.menuItemValidate(1,6);
//        System.out.println(i);
//        String s = regex.nameValidate();
//        System.out.println(s);
//        String ageValidate = regex.ageValidate();
//        System.out.println(ageValidate);
//        String s = regex.sexValidate();
//        System.out.println(s);
//        String s = regex.telNumValidate();
//        System.out.println(s);
//        String s = regex.addressValidate();
//        System.out.println(s);
    }


    public int menuItemValidate(int min, int max) {
        //定义验证菜单项的正则表达式
        String regex = "[1-9]";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入正确的数值，最小值" + min + "\t" + "最大值" + max);
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                int i = Integer.parseInt(input);
                if (i >= min && i <= max) {
                    return i;
                } else {
                    System.out.println("输入的菜单项不符，请重新输入");
                }

            } else {
                System.out.println("输入的数字不合法，请检查");
            }

        }


    }

    public String nameValidate() {
        //对用户输入姓名的验证，字母可以是大写或小写长度1-10之间
        String regex = "[a-zA-Z]{1,10}";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入姓名：格式为1-10之间的大写或者小写字母");
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("输入的姓名有误，请重新输入");
            }

        }


    }

    public String ageValidate() {
        //对用户输入年龄的验证，年龄的格式要求为10-99之间的。
        String regex = "[1-9][0-9]";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入年龄10-99之间的");

            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("输入的年龄格式有误，请重新输入");
            }

        }


    }

    //对用户输入性别的验证，性别输入要求男m或M，女f或F
    public String sexValidate() {
//        对性别验证的正则表达式
        String regex = "[m|M|f|F]";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入性别（男m or M）（女 f或F）");
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("输入的性别格式有误，请重新输入");
            }

        }
    }

    public String telNumValidate() {

        // 对电话号码验证的正则表达式，电话要求，允许带有区号的座机号，允许手机号
        String regex = "(\\d{3,4}-\\d{7,8})|([1])\\d{10}";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入电话号码，可以是座机号或者是手机号");
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("输入的电话号码格式有误，请重新输入");
            }

        }
    }

    public String addressValidate() {
        // 对地址证的正则表达式，地址格式要求：字母或者数字，长度1-50
        String regex = "\\w{1,50}";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入地址格式为字母或者数字，长度为1,50");
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("输入的地址格式有误，请重新输入");
            }

        }
    }


}
