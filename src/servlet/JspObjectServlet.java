package servlet;

import com.sun.media.jfxmediaimpl.MediaDisposer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name="JspObjectServlet",urlPatterns = "/jspObjectServlet")
public class JspObjectServlet  extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     //1.通过request对象传递值

        req.setAttribute("name1","JAVA 语言程序设计");
        //2.session对象传值(比前一个稍微大一点)可以占时理解为针对用户的
//        创建session对象
        HttpSession session = req.getSession();
        session.setAttribute("name2","java Web应用开发");

       //3.application 对象传递值(比上一个范围更大)
        ServletContext application = this.getServletContext();
        application.setAttribute("name3","Java  EE 企业级开发框架");
        
//        请求转化到show.jsp
        RequestDispatcher Dispatcher = req.getRequestDispatcher("jsp/show.jsp");
        Dispatcher.forward(req,resp);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}






