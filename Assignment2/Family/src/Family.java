/*
CIT-244 Assignment 2 - Family Class
Stephen Cook
Prof. J. Winyard
2023/02/04
 */

public class Family{

    private String name, relation;

    public Family(String n, String r){
        name = n;
        relation = r;
    }

    public String toString(){
        return name + " is part of your family. " + name + " is your " + relation + ".";
    }

}