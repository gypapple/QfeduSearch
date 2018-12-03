package com.feri.qfedusearch.dao;

import com.feri.qfedusearch.index.IndexPojo;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/12/3 16:39
 */
public interface IndexPojoDao extends ElasticsearchRepository<IndexPojo,Integer> {
    //方法名解析查询
    List<IndexPojo> getByNameLike(String name);
}
