package com.company;

public class Animal {
    private String name;

    public Animal(){
        System.out.println("An animal has been created");}

    public Animal (String message){

        System.out.println(message);
    }
    public String eat(){
        return "An animal eats...";
    }
    public String sleep(){
        return "An animal sleeps...";
    }

    //getter
    public String getName(){
        return name;
    }
    //setter
    public void setName(String value){
        name= value;
    }



    public String displayWhatAnAnimalDoes(){
        String output;
        output=this.eat()+" "+this.sleep();
        return output;

    }
    public String speak(){
        return "An animal makes noise ";
    }
}
