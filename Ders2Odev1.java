/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders2odev1;

import java.util.Scanner;

/**
 *
 * @author solaris
 */
public class Ders2Odev1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CourseProgram courseProgram1 = new CourseProgram("Ders Programı", "1.Gün sonu kayıt", "Ödev 1", "1.Gün");
        CourseProgram courseProgram2 = new CourseProgram("Ders Programı", "2.Gün sonu kayıt", "Ödev 1", "2.Gün");
        CourseProgram courseProgram3 = new CourseProgram("Ders Programı", "3.Gün sonu kayıt", "Ödev 1", "3.Gün");

        CourseProgram[] coursePrograms = {courseProgram1, courseProgram2, courseProgram3};

        for (CourseProgram courseProgram : coursePrograms) {

            System.out.println(courseProgram.date + "\n" + courseProgram.lessonProgram + "\n" + courseProgram.register
                    + "\n" + courseProgram.homeWorks + "\n");
        }
        Teacher teacher1 = new Teacher(1, "Engin Demiroğ");

        Teacher[] teachers = {teacher1};

        for (Teacher teacher : teachers) {

            System.out.println(teacher.id + teacher.name);

        }

        Register n = new Register();
        n.FinishAndGoOn();

    }

}
