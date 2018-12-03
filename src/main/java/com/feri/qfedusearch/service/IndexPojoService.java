package com.feri.qfedusearch.service;

import com.feri.qfedusearch.index.IndexPojo;
import com.feri.qfedusearch.vo.PageBean;
import com.feri.qfedusearch.vo.ResultBean;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/12/3 16:39
 */
public interface IndexPojoService {
    //新增
    ResultBean save(IndexPojo pojo);
    //删除
    ResultBean del(int id);
    //查看全部
    List<IndexPojo> queryAll();
    //模糊查询
    List<IndexPojo> queryLike(String name);



}
