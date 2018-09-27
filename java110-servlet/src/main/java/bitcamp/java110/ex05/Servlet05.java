/* 서블릿 배치 정보 - 컨텍스트 초기화 파라미터
 * => 컨텍스트 초기화 파라미터는 모든 서블릿이 참조할 수 있다.
 *    즉 모든 서블릿이 공유해야 하는 정보를 컨텍스트 초기화 파라미터로 선언하라!
 * => 활용
 *    DB 연결정보, 파일 업로드 설정 정보 등 
 * 
 */
package bitcamp.java110.ex05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex05/servlet04")
public class Servlet05 extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    @Override
    public void doGet(
            HttpServletRequest req, 
            HttpServletResponse res) 
            throws ServletException, IOException {

        // 테스트:
        // => http://localhost:8888/ex05/test4.html
        
        res.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.println("GET 요청입니다.");
    }
}





























