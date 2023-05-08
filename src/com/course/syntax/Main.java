package com.course.syntax;

public class Main {
    public static void main(String[] args) {
        User user = new User ("Karyna", "Adzhyaliieva", "karina.knu97@gmail.com", new Role(Role.Type.ADMIN));

        user.printUserInfo();
    }
}
