/*
CIT-244 Assignment 2 - Family Class
Stephen Cook
Prof. J. Winyard
2023/02/04
 */

public class Friend {

    private String name;
    private int timeKnown;

    public Friend(String n, int tk){
        name = n;
        validateTimeKnown(tk);
        timeKnown = tk;
    }

    public int validateTimeKnown(int tk){
        //Validate the time known.
        if (tk < 0){
            tk = 0;
        }
        return tk;
    }

    public String toString(){
        return name + " and you have been friends for " + timeKnown;
    }
}