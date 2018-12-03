package com.feri.qfedusearch.index;

import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 *@Author feri
 *@Date Created in 2018/12/3 16:37
 */
@Document(indexName = "products",type = "product")
public class IndexPojo implements Serializable {
    private int id;
    private String name;
    private String typename;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }
}
