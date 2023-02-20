/*
CIT-244 Assignment 2 - Family Class
Stephen Cook
Prof. J. Winyard
2023/02/04
 */

import java.util.*;

public class FriendsAndFamily {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Object[] friendsAndFamily;
        Friend fri;
        Family fam;
        String name;
        String relation;
        int timeKnown;
        int type;

        System.out.println("(WARNING: When prompted for choice of 'Friend or Family', anything other than" +
                " friend or family will result in the program ending.)");

        friendsAndFamily = getSize(sc);

        for(int i = 0; i < friendsAndFamily.length; i++){
            type = friendOrFamily(sc);

            if(type == 0){
                name = getName(sc, type);
                timeKnown = getTimeKnown(sc, name);
                fri = new Friend(name, timeKnown);
                friendsAndFamily[i] = fri;
            }
            else if (type == 1){
                name = getName(sc, type);
                relation = getRelation(sc, name);
                fam = new Family(name, relation);
                friendsAndFamily[i] = fam;
            }
            else if (type == 2){
                System.out.println("Invalid input, program will end.");
                System.exit(0);
            }
        }
        display(friendsAndFamily);
    }

    public static Object[] getSize(Scanner sc){
        int size;
        System.out.println("How many friends & family do you wish to enter?");
        size = sc.nextInt();
        if(size <= 0){
            System.out.println("Size must be a positive integer.");
        }
        Object[] friendsAndFamily = new Object[size];
        return friendsAndFamily;
    }

    public static int friendOrFamily(Scanner sc){
        System.out.println("Are you entering info for a friend or family?");
        if (sc.next().equalsIgnoreCase("Friend")){
            return 0;
        }
        if (sc.next().equalsIgnoreCase("Family")){
            return 1;
        }
        else {
            return 2;
        }
    }

    public static String getName(Scanner sc, int t){
        if (t == 0){
            System.out.println("What's the name of this friend?");
        }
        if (t == 1){
            System.out.println("What is the family members name?");
        }
        else{
            System.exit(0);
        }
        String name = sc.next();
        return name;
    }

    public static String getRelation(Scanner sc, String n){
        System.out.println("What's your relation to " +n+ "?");
        return sc.next();
    }

    public static int getTimeKnown(Scanner sc, String n){
        System.out.println("How long have you known " +n+ "?");
        return sc.nextInt();
    }

    public static void display(Object[] friendsAndFamily){
        for(Object faf : friendsAndFamily){
            System.out.println(faf);
        }
    }
}