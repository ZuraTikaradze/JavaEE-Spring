package ge.cse.api.controller;

import ge.cse.api.model.Student;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
//http://localhost:8080/RESTFullDemo_war_exploded/api/studentManager/hi
@Path("/studentManager")
public class StudentController {

    @GET
    @Path("/hi")
    public String sayHallo(){
        return "Hello !";
    }


    @GET
    @Path("/students")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getStudents() {
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student(1,"GIORGI",12));
        studentList.add(new Student(2,"Data",45));
        return studentList;
    }

    @POST
    @Path("addStudent")
    @Produces(MediaType.APPLICATION_JSON) // აბრუნებს ჯეისონს
    @Consumes(MediaType.APPLICATION_JSON) // იღებს ჯეისონს
    public void addStudent(Student student) {
        System.out.println(student.toString());
    }

//    http://localhost:8080/crudAPI/api/studentManager/addStudent
//    {
//        "id":5,
//            "name":"GIORGIAAA",
//            "age":123
//    }



    @GET
    @Path("/getStudent/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student getStudent(@PathParam("id") int id) {
        System.out.println(id);
        return new Student(id,"Zura",25);
    }
    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Student updateStudent(Student student) {
        System.out.println(student.toString());
        return student;
    }

    @DELETE
    @Path("/{id}")  // მიუხედავად იმისა რომ deleteStudent -ს  და updateStudent -ს
                    // ერთიდაიგივე url ი აქვს იმისმიხედვით თუ რომელი მეთოდით
                    // გამოვიძახებთ (DELETE თუ PUT)  მოხდება შესაბამისად გადამისამართება.
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteStudent(@PathParam("id")int id) {
        System.out.println("delete : " + id);
            //http://localhost:8080/crudAPI/api/studentManager/1
    }
}
