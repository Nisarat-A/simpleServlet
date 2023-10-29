package sit.int202.simple.simpleservlet.repositories;

import sit.int202.simple.simpleservlet.entities.subjects;


import java.util.ArrayList;
import java.util.List;


//ไว้ดึงข้อมูล

public class SubjectRepository {
    private  static  List<subjects> subjects;
    public List<subjects> findAll(){
        return subjects;
    }
    public  SubjectRepository(){
        initialize();
    }
    private void initialize(){
        subjects = new ArrayList<>(20);
        subjects.add(new subjects("INT100","IT FUND",3));
        subjects.add(new subjects("INT101","Java Prog",3));
        subjects.add(new subjects("INT103","Web Tech",1));
        subjects.add(new subjects("INT203","Data Structure",1));
    }
}


