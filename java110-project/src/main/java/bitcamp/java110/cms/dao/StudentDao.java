package bitcamp.java110.cms.dao;

import java.util.ArrayList;
import java.util.List;

import bitcamp.java110.cms.domain.Student;

public class StudentDao {

    private List<Student> list = new ArrayList<>();
    // 인터페이스 List쓴건 걍 설명하려고... 퍼포먼스나 뭐 장점그런건없고 그냥 이렇게도 쓸수이썽


    public int insert(Student student) {
        for (Student item : list) {
            if (item.getEmail().equals(student.getEmail())) {
                return 0;
            }
        }
        list.add(student);
        return 1;
    }



    public List<Student> findAll(){
        return list;

    }

    public Student findByEmail(String email) {
        for (Student item : list) {
            if (item.getEmail().equals(email)) {
                return item;
            }
        }
        return null;
    }

    public int delete(String email) {
        for (Student item : list) {
            if (item.getEmail().equals(email)) {
                list.remove(item);
                return 1;
            }
        }
        return 0;
        
    }

}
