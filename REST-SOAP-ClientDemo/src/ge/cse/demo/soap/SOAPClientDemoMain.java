package ge.cse.demo.soap;

import hello.HelloServiceServiceLocator;
import student.Student;
import student.StudentServiceServiceLocator;

public class SOAPClientDemoMain {
    public static void main(String[] args) throws Exception {

        HelloServiceServiceLocator locator = new HelloServiceServiceLocator();
        System.out.println(locator.getHelloServicePort().sayHallo());
        System.out.println(locator.getHelloServicePort().good(10));


        Student student = new Student();
        student.setId(1);
        student.setAge(25);
        student.setName("Zura");

        StudentServiceServiceLocator locator1 = new StudentServiceServiceLocator();
        locator1.getStudentServicePort().addStudent(student);
    }
}
