package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


//    通过注解的方式配置Servlet
@WebServlet(name = "RegisterServlet",urlPatterns = "/registerServlet")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
//        打印到页面中
//        2.解决乱码问题
        req.setCharacterEncoding("UTF-8");
//      1. 获取请求参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String gender = req.getParameter("gender");
        String hobbys[] = req.getParameterValues("hobby");
        System.out.println("username="+username);
        System.out.println("password="+password);
        System.out.println("gender="+gender);
        if(hobbys!=null)
            for (int i = 0;i<hobbys.length;i++){
                System.out.println("hobbys="+hobbys[i]);
            }

//        3.请求转发

        if(username == null || username.isEmpty()||password==null||password.isEmpty()){
            req.setAttribute("message","用户名或密码不合法");
            RequestDispatcher dispatcher =  req.getRequestDispatcher("/register.jsp");
            dispatcher.forward(req,resp);
        }else{
            req.setAttribute("message","输入合法");
            RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
            dispatcher.forward(req,resp);
        }
        PrintWriter out = resp.getWriter();
        out.println("hello Servlet");
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        this.doPost(req,resp);
    }
}