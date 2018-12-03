package com.feri.qfedusearch.app;

import com.feri.qfedusearch.index.IndexPojo;
import com.feri.qfedusearch.service.IndexPojoService;
import com.feri.qfedusearch.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/12/3 16:51
 */
@RestController
public class IndexPojoController {
    @Autowired
    private IndexPojoService service;

    //新增
    @RequestMapping("indexsave.do")
    public ResultBean save(IndexPojo pojo){
        System.out.println("接收："+pojo.getName());
        return service.save(pojo);
    }
    //查询全部
    @GetMapping("indexall.do")
    public List<IndexPojo> queryAll(){
        return service.queryAll();
    }
    //模糊查询
    @GetMapping("indexlike.do")
    public List<IndexPojo> queryLike(String name){
        return service.queryLike(name);
    }
    //删除数据
    @GetMapping("indexdel.do")
    public ResultBean del(int id){
        return service.del(id);
    }
}
