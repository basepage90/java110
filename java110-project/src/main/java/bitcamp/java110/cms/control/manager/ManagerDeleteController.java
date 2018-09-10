package bitcamp.java110.cms.control.manager;

import java.util.Scanner;

import bitcamp.java110.cms.App;
import bitcamp.java110.cms.annotation.Component;
import bitcamp.java110.cms.annotation.RequestMapping;

@Component
public class ManagerDeleteController {

    @RequestMapping("manager/delete")
    public void delete(Scanner keyIn) {
        System.out.print("삭제할 이메일은? ");
        String email= keyIn.nextLine();

        if (App.managerDao.delete(email) > 0) {

            System.out.println("삭제하였습니다.");

        } else {
            System.out.println("이메일에 해당하는 매니져가 없습니다.");
        }

        System.out.println("삭제하였습니다.");
    }
}
