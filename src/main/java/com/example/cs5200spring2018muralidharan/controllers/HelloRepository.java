package com.example.cs5200spring2018muralidharan.controllers;




import com.example.cs5200spring2018muralidharan.hello.HelloObject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloRepository
        extends JpaRepository<HelloObject, Integer> {
}
