package com.dilshan.Entity;

public class Person {
    private int Id;
    private String Name;
    private String Spoint;

    public Person(int id, String name, String spoint) {
        Id = id;
        Name = name;
        Spoint = spoint;
    }

    public Person() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSpoint() {
        return Spoint;
    }

    public void setSpoint(String spoint) {
        Spoint = spoint;
    }
}
