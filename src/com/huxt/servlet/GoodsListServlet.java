package com.huxt.servlet;

import com.huxt.Dao.GoodsDao;
import com.huxt.model.Goods;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author weijiangquan
 * @date 2022/4/15 -15:31
 */
@WebServlet(name = "GoodsListServlet",urlPatterns ="/goodsListServlet")
public class GoodsListServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //
        GoodsDao goodsDao = new GoodsDao();
        ArrayList<Goods> goosList = goodsDao.findAllGoods();
        req.setAttribute("goodsList",goosList);

        //请求转发到good_list.jsp页面
        RequestDispatcher dispatcher = req.getRequestDispatcher("good-list.jsp");
        dispatcher.forward(req,resp);
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
