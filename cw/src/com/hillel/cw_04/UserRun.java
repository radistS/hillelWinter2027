package com.hillel.cw_04;

public class UserRun {

    static void main() {
        User us = User.createUser();
        System.out.println(us);

        us = new User("1", "2", "3");
        System.out.println(us);

        us.setId(1);
        us.setActive(true);

        System.out.println(us);

    }

}
