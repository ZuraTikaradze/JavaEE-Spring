package ge.cse.demo.services;

import ge.cse.demo.models.Student;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public class StudentService {

    @WebMethod
    public List<Student> getStudents(){
        List<Student> studentList=new ArrayList<Student>();
        studentList.add(new Student(1,"zura",24));
        studentList.add(new Student(2,"zura",25));
        studentList.add(new Student(3,"zura",26));
        studentList.add(new Student(4,"zura",27));
        return studentList;
    }

    @WebMethod
    public Student getStudent(){
        return new Student(1,"zura",24);
    }
    @WebMethod
    public void addStudent(Student student){
        System.out.println(student);
    }
}
