/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal04;

/**
 *
 * @author User
 */
public class CourseDemo {
        public static void main(String[] args) {
       Instructor myInstructor = new Instructor("Rahmawati", "Lutvia", "SR3007");


       TextBook myTextBook = new TextBook("Tak Seindah Merpati Putih", "Raffi Ahmad", "RANS");


       Course myCourse = new Course("Self Motivation", myInstructor, myTextBook);
       
       System.out.println(myCourse);
        }
}
