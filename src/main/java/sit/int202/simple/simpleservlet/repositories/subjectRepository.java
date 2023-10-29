package sit.int202.simple.simpleservlet.repositories;

import sit.int202.simple.simpleservlet.entities.subject;


import java.util.ArrayList;
import java.util.List;

import static jdk.internal.misc.OSEnvironment.initialize;

//ไว้ดึงข้อมูล
public class subjectRepository {
    private static List<subject> subjects ;
    public List<subject> FindAll() {
        return subjects ;
    }
    public void SubjectRepository(){
        initialize();
    }
    public void initialize(){
        subjects = new ArrayList<>(20);
        subjects.add(new subject("INT100","IT Fundramentals",3));
        subjects.add(new subject("INT101","Java Programming",2));
        subjects.add(new subject("INT105","Web Technology",3));
        subjects.add(new subject("INT201","Front-end Developer",2));
        subjects.add(new subject("INT200","Web programming",1));
        subjects.add(new subject("INT207","Network I",3));
    }

}
