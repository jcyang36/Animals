package com.company;

public class Cat extends Animal {
    @Override
    public String speak(){
        return "A cat purrs... ";
    }

    public String scratch(){
        return "A cat scratches ...";

    }

    public String bite(){
        return "A cat bites ...";
    }
}
