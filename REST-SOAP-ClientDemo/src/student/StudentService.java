/**
 * StudentService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package student;

public interface StudentService extends java.rmi.Remote {
    public student.Student[] getStudents() throws java.rmi.RemoteException;
    public void addStudent(student.Student arg0) throws java.rmi.RemoteException;
    public student.Student getStudent() throws java.rmi.RemoteException;
}
