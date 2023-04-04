package Oop1;

import java.util.Locale;

public class Student {

   private int id;
    private String name;
    private String surname;
    private int avg;
    private boolean isActive;

    public static String uniName;

    public static void uniName() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase(Locale.ROOT);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname.toUpperCase();
    }

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = Math.abs(avg);
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", avg=" + avg +
                ", isActive=" + isActive +
                '}';
    }
    /* public Student(int id, String name, String surname, int avg, boolean isActive) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.avg = avg;
        this.isActive = isActive;
    }*/

    /*void pirintData(int id, String name, String surname, int avg, boolean isActive){
        System.out.println(" id si "+id+" adi "+name+" soyadi "+surname+" ortalamasi "+avg+" aktivdirmi "+isActive);
    }*/
    /*void pirintData(){
        if (this.isActive){
            System.out.println(" id si "+this.id+" adi "+this.name+" soyadi "+this.surname+" ortalamasi "+this.avg+" aktivdirmi "+this.isActive);
        }
    }*/


}
