package com.huxt.Dao;

import com.huxt.model.Goods;
import java.util.ArrayList;
/**
 * 该类是数据库相关的类(在这个目前通过模拟数据库数据的方式)
 * @author weijiangquan
 * @date 2022/4/15 -15:16
 */
public class GoodsDao{
    /**
     *
     * @return 将数据返回给集合
     */
    //查寻所有产品的信息 集合
    public ArrayList<Goods> findAllGoods(){
        //模拟10条产品信息
        // 先去声明一个集合 用来存放所有的产品信息
        ArrayList<Goods> goodsList = new ArrayList<>();
        for (int i = 1;i<=10;i++){
            Goods goods = new Goods();
            goods.setId(i);
            goods.setName("超美并行零");
            goods.setImage1("picture/9-1.jpg");
            goods.setPrice(399);
            //一个产品存放到集合中去 goodsList
            goodsList.add(goods);
        }
        return goodsList;
    }
}
