package com.codegym;

public class QuocGia {
    private String id;
    private String code;
    private String name;
    public QuocGia(String s, String s1, String s2, String s3){}

    public QuocGia(String id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public QuocGia() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "QuocGia{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String ghi() {
        return id+", "+code+", "+name;
    }
}
