package com.nisal.apiproject.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Topic")
public class TopicModel {

    @Id
    private String id;
    private String name;
    private int age;

    public TopicModel(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public TopicModel() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }



    public int getAge() {
        return age;
    }


}
