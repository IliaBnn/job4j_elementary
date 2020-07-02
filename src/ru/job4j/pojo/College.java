package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Bunin Ilia Olegovich");
        student.setGroup("3-SUZS-6");
        student.setDate(new Date());

        System.out.println("Student " + student.getFullName() + " of group " + student.getGroup() + " go to university ");
    }
}
