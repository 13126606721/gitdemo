package com.baizhi.entity;

import java.util.UUID;

public class Book {
    private String id;
    private  String name;
    private String path;
    private String authod;

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", authod='" + authod + '\'' +
                '}';
    }

    public Book(String id, String name, String path, String authod) {
        this.id = id;
        this.name = name;
        this.path = path;
        this.authod = authod;
    }

    public Book() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        String s= UUID.randomUUID().toString().replaceAll("-", "");

        this.id = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        String a="/lucene/img/"+path;
        this.path = a;
    }

    public String getAuthod() {
        return authod;
    }

    public void setAuthod(String authod) {
        this.authod = authod;
    }
}
