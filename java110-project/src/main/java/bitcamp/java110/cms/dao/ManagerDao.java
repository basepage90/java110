package bitcamp.java110.cms.dao;

import java.util.ArrayList;
import java.util.List;

import bitcamp.java110.cms.domain.Manager;

public class ManagerDao {

    private List<Manager> list = new ArrayList<>();
    // 인터페이스 List쓴건 걍 설명하려고... 퍼포먼스나 뭐 장점그런건없고 그냥 이렇게도 쓸수이썽


    public int insert(Manager manager) {
        for (Manager item : list) {
            if (item.getEmail().equals(manager.getEmail())) {
                return 0;
            }
        }
        list.add(manager);
        return 1;
    }



    public List<Manager> findAll(){
        return list;

    }

    public Manager findByEmail(String email) {
        for (Manager item : list) {
            if (item.getEmail().equals(email)) {
                return item;
            }
        }
        return null;
    }

    public int delete(String email) {
        for (Manager item : list) {
            if (item.getEmail().equals(email)) {
                list.remove(item);
                return 1;
            }
        }
        return 0;
        
    }

}
