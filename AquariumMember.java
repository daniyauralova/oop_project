package com.company;

public  class AquariumMember {
    private String name;
    private int cost;
    int id;


    protected AquariumMember(int cost, String name ,  int id) {
        this.cost = cost;
        this.name = name;
        this.id = id;
    }

    public int getCost() { // get price
        return cost;
    }

    public void setCost(int cost) { // change price
        this.cost = cost;
    }

    public String getName() { // get name
        return name;
    }

    public void setName(String name) { // change name
        this.name = name;
    }

    public int getID(){ // get id
        return this.id;
    }


    @Override
    public String toString() {
        return "AquariumMember{ " +
                ", id=" + id +
                "cost=" + cost +
                ", name='" + name + '\'' +
                " }";
    }
}

