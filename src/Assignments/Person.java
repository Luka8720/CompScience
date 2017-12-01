
package Assignments;

import ArrayLists.*;

public class Person implements Comparable {

    private String name;
    private int age;
    private String gender;
    
    public Person(String n, int a, String g){
        name = n;
        age = a;
        gender = g;
    }
    public String getGender(){
        return gender;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getName(){
        return name;
    }

    @Override
    public int compareTo(Object t) {
        String other = ((Person)t).getName();
        return name.compareTo(other);
    }
    
}
