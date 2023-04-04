package Oop1;

import javax.swing.plaf.basic.BasicDesktopIconUI;

public class StudentMain {

    public static void main(String[] args) {

      //  Student student = new Student(101,"Ruslan","Sahbazov",76,true);
      //  Student student1 = new Student(102,"Qara","Mesimov",78,true);
        /*student.id =100;
        student.name = "Elxan";
        student.surname = "Cebrayilov";
        student.avg = 75;
        student.isActive = true;*/

        //student.pirintData(student.id, student.name, student.surname, student.avg, student.isActive);

        //student.pirintData();
        //student1.pirintData();

       // Student student = new Student();
        //Set
        //student.id = 103;
        //Get
        //System.out.println(student.id);

        Student.uniName();
        Student student = new Student();
        //Set
        student.setId(105);
        student.setName("Vuqar");
        student.setSurname("Qasimov");
        student.setAvg(-67);
        student.setActive(true);
        //Get
       System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getSurname());
        System.out.println(student.getAvg());
        System.out.println(student.isActive());

        //System.out.println(student);



    }
}
