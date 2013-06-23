package org.luis.hibernateexample;

import static org.junit.Assert.assertEquals;

import org.hibernate.Session;
import org.junit.Test;
import org.luis.hibernateexample.domain.Student;
import org.luis.hibernateexample.util.HibernateUtil;

public class AppTest {

    @Test
    public void testInsertStudnet() {
        Session session = HibernateUtil.getSessionfactory().openSession();
        session.beginTransaction();

        Student student = new Student();
        student.setStudentName("Luis Estrada");
        student.setStudentAge("24");

        session.save(student);
        session.getTransaction().commit();

        Student retrivedStudent = (Student)session.get(Student.class, student.getStudentId());

        assertEquals(retrivedStudent.getStudentName(), student.getStudentName());
        assertEquals(retrivedStudent.getStudentAge(), student.getStudentAge());
    }

}
