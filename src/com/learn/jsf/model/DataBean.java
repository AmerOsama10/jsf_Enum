package com.learn.jsf.model;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "dataBean")
public class DataBean {

    private String firstName;
    private String lastName;
    private Category category;

    public Category[] getCategoryValues() {
        return Category.values();
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String submit() {
        System.out.println("Selected Category: " + category);
        return "student-response"; 
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
