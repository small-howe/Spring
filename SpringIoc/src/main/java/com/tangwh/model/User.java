package com.tangwh.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @PROJECT_NAME: Spring
 * @DESCRIPTION:
 * @USER: Howe
 * @DATE: 2020/6/25 9:22
 */
public class User {


    private String username;

    private String address;

    private Integer id;

    //对象注入
    private Cat cat;

    // 数组注入
    private Cat[] cats;
    private List<String> favorites;

    //Map注入
    private Map<String, Object> details;

    private Properties info;

    /**
     * 测试配置文件 加载这个类
     */
    public User() {

        System.out.println("-------init------");

    }

    /**
     * 有参构造
     *
     * @param username
     * @param address
     * @param id
     */
    public User(String username, String address, Integer id, Cat cat) {
        this.username = username;
        this.address = address;
        this.id = id;
        this.cat = cat;


    }

    public Map<String, Object> getDetails() {
        return details;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("username='").append(username).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", id=").append(id);
        sb.append(", cat=").append(cat);
        sb.append(", cats=").append(cats == null ? "null" : Arrays.asList(cats).toString());
        sb.append(", favorites=").append(favorites);
        sb.append(", details=").append(details);
        sb.append(", info=").append(info);
        sb.append('}');
        return sb.toString();
    }

    public void setDetails(Map<String, Object> details) {
        this.details = details;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    public Cat[] getCats() {
        return cats;
    }

    public void setCats(Cat[] cats) {
        this.cats = cats;
    }

    public List<String> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<String> favorites) {
        this.favorites = favorites;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
