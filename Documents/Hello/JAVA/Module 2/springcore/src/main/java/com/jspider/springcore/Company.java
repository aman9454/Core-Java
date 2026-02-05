package com.jspider.springcore;

import java.util.List;

public class Company {
    private int id;
    private String name;
    private String website;
    private List<String> branches;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setBranches(List<String> branches) {
        this.branches = branches;
    }

    public void display() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(website);
        System.out.println(branches);
    }
}

