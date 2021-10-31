
package javaapplication2;
import java.util.Scanner;

class student{
    public String student_name;
    private int student_id;
    private float student_GPA;
    subject std_subject;
    address std_address;

    public student(String student_name, int student_id, float student_GPA, subject std_subject, address std_address) {
        this.student_name = student_name;
        this.student_id = student_id;
        this.student_GPA = student_GPA;
        this.std_subject = std_subject;
        this.std_address = std_address;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getStudent_GPA() {
        return student_GPA;
    }

    public void setStudent_GPA(float student_GPA) {
        this.student_GPA = student_GPA;
    }

    public subject getStd_subject() {
        return std_subject;
    }

    public void setStd_subject(subject std_subject) {
        this.std_subject = std_subject;
    }

    public address getStd_address() {
        return std_address;
    }

    public void setStd_address(address std_address) {
        this.std_address = std_address;
    }

    @Override
    public String toString() {
        return "student{" + "student_name=" + student_name + ", student_id=" + student_id + ", student_GPA=" + student_GPA +"\n , subject_id=" + std_subject.subject_id + ", subject_name=" + std_subject.subject_name + ", subject_hours=" + std_subject.subject_hours + " \n address{" + "streetnum=" + std_address.streetnum + ", city=" + std_address.city + ", country=" + std_address.country  +'}';
    }
    
    
    
    
}
//////////////////////////////
class subject{
    int subject_id;
    String subject_name;
    int subject_hours;

    public subject(int subject_id, String subject_name, int subject_hours) {
        this.subject_id = subject_id;
        this.subject_name = subject_name;
        this.subject_hours = subject_hours;
    }

    public int getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public int getSubject_hours() {
        return subject_hours;
    }

    public void setSubject_hours(int subject_hours) {
        this.subject_hours = subject_hours;
    }

  
    
    
}
///////////////////////////////////
class address{
    int streetnum;
    String city;
    String country;

    public address(int streetnum, String city, String country) {
        this.streetnum = streetnum;
        this.city = city;
        this.country = country;
    }

    public int getStreetnum() {
        return streetnum;
    }

    public void setStreetnum(int streetnum) {
        this.streetnum = streetnum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "address{" + "streetnum=" + streetnum + ", city=" + city + ", country=" + country + '}';
    }

    
    
    
    
}

public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        subject sub = new subject(80023,"scince",3);
        address add = new address(3,"bani mazar ","minia");
        student std= new student("ahmed sayed ",800034,3,sub,add);
        
        System.out.println(std.toString());
    }
    
}
