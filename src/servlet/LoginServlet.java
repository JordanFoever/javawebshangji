package servlet;

import com.huxt.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet",urlPatterns = "/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req,
                          HttpServletResponse resp)
            throws ServletException, IOException {
       //1.获取用户名和密码
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //2.用户名=admin，密码=123456，重定向到user_center。jsp页面
        if(username!=null&&username.equals("admin")
                &&password!=null&&password.equals("123456")){
//            获取session对象
            HttpSession session = req.getSession();
//            构建一个user
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            user.setName("管理员");
            user.setPhone("110");
            user.setAddress("武汉大学文学院");
            session.setAttribute("user",user);
            resp.sendRedirect(req.getContextPath()+"/user_center.jsp"); //转发给个人中心页面
        }else{
            req.setAttribute("message","用户名或密码不合法");
            //3.用户名密码是其他情况，请求转发login.jsp页面
            RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
            dispatcher.forward(req,resp);
        }
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        this.doPost(req, resp);
    }
}


