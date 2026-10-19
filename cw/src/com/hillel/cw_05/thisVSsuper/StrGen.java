package com.hillel.cw_05.thisVSsuper;

public class StrGen {
    private Integer id;
    private String name;
    private String email;

    public StrGen(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}
