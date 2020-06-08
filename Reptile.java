package com.company;

public class Reptile extends AquariumMember {


    public Reptile( int id , String name , int cost ,  String color ) {
        super(cost, name ,  id);


    }



    public int getID(){ // get id
        return this.id;
    }

    @Override
    public String toString() {
        return "Reptile{ " + super.toString() +
                " }";
    }
}
