package com.bhq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author bhq
 * @date 2022/4/14--11:55
 */
//核心业务类
public class Operate {
    private List<Person> list;

    public Operate() {
        this.list = new ArrayList<>();


    }

    //    用户添加记录业务逻辑控制
    public void addLogic() {
//        System.out.println("控制添加业务逻辑");
        Menu menu = new Menu();
        TelNoteRegex regex = new TelNoteRegex();
        while (true) {
            menu.addMenu();
            int item = regex.menuItemValidate(1, 3);
            switch (item) {
                case 1:
                    this.addOperation();
                    break;
                case 2:
                    this.showAll();
                    break;
                case 3:
                    return;

            }


        }

    }

    //    用户查找业务逻辑控制
    public void searchLogic() {
//        System.out.println("控制查询业务逻辑");
        Menu menu = new Menu();
        TelNoteRegex regex = new TelNoteRegex();
        while (true) {
            menu.searchMenu();
            int item = regex.menuItemValidate(1, 7);
            switch (item) {
                case 1:
                    this.searchByName();
                    break;
                case 2:
                    this.searchByAge();
                    break;
                case 3:
                    this.searchBySex();
                    break;
                case 4:
                    this.searchByTelNum();
                    break;
                case 5:
                    this.searchByAdd();
                    break;
                case 6:
                    this.showAll();
                    break;
                case 7:
                    return;

            }


        }
    }

    //   用户修改业务逻辑控制
    public void modifyLogic() {
//        System.out.println("控制修改业务逻辑");
        Menu menu = new Menu();
        TelNoteRegex regex = new TelNoteRegex();
        while (true) {
            menu.modifyMenu();
            int item = regex.menuItemValidate(1, 3);
            switch (item) {
                case 1:
                    this.showAll();
                    break;
                case 2:
                    this.modifyOperation();
                    break;
                case 3:
                    return;

            }


        }
    }


    //   用户删除业务逻辑控制
    public void deleteLogic() {
//        System.out.println("控制删除业务逻辑");
        Menu menu = new Menu();
        TelNoteRegex regex = new TelNoteRegex();
        while (true) {
            menu.deleteMenu();
            int item = regex.menuItemValidate(1, 4);
            switch (item) {
                case 1:
                    this.showAll();
                    break;
                case 2:
                    this.deleteOperation();
                    break;
                case 3:
                    this.deleteAllOperation();
                    break;
                case 4:
                    return;

            }


        }
    }

    //    用户排序业务逻辑控制
    public void orderLogic() {
//        System.out.println("控制排序业务逻辑");
        Menu menu = new Menu();
        TelNoteRegex regex = new TelNoteRegex();
        while (true) {
            menu.orderMenu();
            int item = regex.menuItemValidate(1, 5);
            switch (item) {
                case 1:
                    this.orderName();
                    break;
                case 2:
                    this.orderAge();
                    break;
                case 3:
                    this.orderSex();
                    break;
                case 4:
                    this.showAll();
                    break;
                case 5:
                    return;

            }


        }
    }

    //    添加新纪录
    public void addOperation() {
//        System.out.println("添加新纪录");
        TelNoteRegex regex = new TelNoteRegex();
        String name = regex.nameValidate();
        String age = regex.ageValidate();
        String sex = regex.sexValidate();
        String telNum = regex.telNumValidate();
        String address = regex.addressValidate();
        Person person = new Person(name, age, sex, telNum, address);
        this.list.add(person);
        person.setId(this.list.size());
    }

    //    查询全记录
    public void showAll() {
//        System.out.println("查询全记录");
        if (this.list.size() == 0) {
            System.out.println("没有任何记录");
            return;
        }
        list.forEach(System.out::println);
    }

    //    按姓名查找记录
    public void searchByName() {
//        System.out.println("按姓名查找记录");
        TelNoteRegex regex = new TelNoteRegex();
        String name = regex.nameValidate();
        boolean flag = true;
        for (int i = 0; i < this.list.size(); i++) {
            if (name.equals(list.get(i).getName())) {
                System.out.println(this.list.get(i));
                flag = false;
            }

            if (flag) {
                System.out.println("没有此人记录");
            }

        }


    }

    //    按年龄查找记录
    public void searchByAge() {
//        System.out.println("按年龄查找记录");
        TelNoteRegex regex = new TelNoteRegex();
        String name = regex.ageValidate();
        boolean flag = true;
        for (int i = 0; i < this.list.size(); i++) {
            if (name.equals(list.get(i).getAge())) {
                System.out.println(this.list.get(i));
                flag = false;
            }

            if (flag) {
                System.out.println("没有此人记录");
            }

        }

    }

    //    按性别查找记录
    public void searchBySex() {
//        System.out.println("按性别查找记录");
        TelNoteRegex regex = new TelNoteRegex();
        String name = regex.sexValidate();
        boolean flag = true;
        for (int i = 0; i < this.list.size(); i++) {
            if (name.equals(list.get(i).getSex())) {
                System.out.println(this.list.get(i));
                flag = false;
            }

            if (flag) {
                System.out.println("没有此人记录");
            }

        }
    }

    //    按电话号码查找记录
    public void searchByTelNum() {
//        System.out.println("按号码查找记录");
        TelNoteRegex regex = new TelNoteRegex();
        String name = regex.telNumValidate();
        boolean flag = true;
        for (int i = 0; i < this.list.size(); i++) {
            if (name.equals(list.get(i).getTelNum())) {
                System.out.println(this.list.get(i));
                flag = false;
            }

            if (flag) {
                System.out.println("没有此人记录");
            }

        }
    }

    //    按地址查找记录
    public void searchByAdd() {
//        System.out.println("按地址查找记录");
        TelNoteRegex regex = new TelNoteRegex();
        String name = regex.addressValidate();
        boolean flag = true;
        for (int i = 0; i < this.list.size(); i++) {
            if (name.equals(list.get(i).getAddress())) {
                System.out.println(this.list.get(i));
                flag = false;
            }

            if (flag) {
                System.out.println("没有此人记录");
            }

        }
    }

    //    修改指定记录
    public void modifyOperation() {
        TelNoteRegex regex = new TelNoteRegex();
        Menu menu = new Menu();
        //对被修改的序号就行验证，可以使用对菜单项的验证方法
        int itemNum = regex.menuItemValidate(1, this.list.size());
        System.out.println("请输入记录的记号");
        int menuItem = regex.menuItemValidate(1, 6);
        menu.submitModifyMenu();
        switch (menuItem) {
            case 1:
                String nameValidate = regex.nameValidate();
                this.list.get(itemNum - 1).setName(nameValidate);
                break;
            case 2:
                String ageValidate = regex.ageValidate();
                this.list.get(itemNum - 1).setAge(ageValidate);
                break;
            case 3:
                String sexValidate = regex.nameValidate();
                this.list.get(itemNum - 1).setSex(sexValidate);
                break;
            case 4:
                String telNumValidate = regex.telNumValidate();
                this.list.get(itemNum - 1).setTelNum(telNumValidate);
                break;
            case 5:
                String addressValidate = regex.addressValidate();
                this.list.get(itemNum - 1).setAddress(addressValidate);
                break;
            case 6:
                return;
        }


        System.out.println("修改成功");
    }

    //    删除指定记录
    public void deleteOperation() {
//        System.out.println(" 删除指定记录");

        TelNoteRegex regex = new TelNoteRegex();
        int itemNum = regex.menuItemValidate(1, this.list.size());
        System.out.println("请输入记录的记号");

        this.list.remove(itemNum - 1);
        //重新为记录设置新的序好
        for (int i = 0; i < this.list.size(); i++) {
            (this.list.get(i)).setId(i + 1);
        }
        System.out.println("删除成功，请继续操作");
    }

    //    删除全部记录
    public void deleteAllOperation() {
//        System.out.println(" 删除全记录");
        this.list.clear();
        System.out.println("电话中的记录已经全部清空，请继续操作");
    }


    //    按用户姓名排序记录
    public void orderName() {
//        System.out.println(" 按用户姓名排序记录");
        Collections.sort(this.list,new OrderByName());
        for (int i = 0; i < this.list.size(); i++) {
            (this.list.get(i)).setId(i+1);
        }

    }

    //     按用户年龄排序记录
    public void orderAge() {
//        System.out.println(" 按用户年龄排序记录");
        Collections.sort(this.list,new OrderByAge());
        for (int i = 0; i < this.list.size(); i++) {
            (this.list.get(i)).setId(i+1);
        }

    }

    //     按用户性别排序记录
    public void orderSex() {
//        System.out.println(" 按用户性别排序记录");
        Collections.sort(this.list,new OrderBySex());
        for (int i = 0; i < this.list.size(); i++) {
            (this.list.get(i)).setId(i+1);
        }

    }

    //    按照姓名进行排序的比较器
    class OrderByName implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    //    按照年龄进行排序的比较器
    class OrderByAge implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getAge().compareTo(o2.getAge());
        }
    }

    //    按照性别进行排序的比较器
    class OrderBySex implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getSex().compareTo(o2.getSex());
        }
    }


}
