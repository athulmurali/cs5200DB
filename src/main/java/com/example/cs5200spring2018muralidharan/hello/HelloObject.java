package com.example.cs5200spring2018muralidharan.hello;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="hello")
public class HelloObject {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String message;

    public HelloObject() {
        this.message = "no message";

    }
    public HelloObject(String s) {
        this.message = s;

    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
