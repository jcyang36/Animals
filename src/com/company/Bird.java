package com.company;

public class Bird extends Animal{


    private String color;

    //getter
    public String getColor(){
        return color;
    }

    //setter
    public void setColor(String value){
        this.color = value;
    }

    public String fly(){
        return "A bird flies ...";
    }

    @Override
    public String speak(){
        return "A bird tweets ";

    }
}
