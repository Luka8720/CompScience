
package ArrayLists;

public class Person implements Comparable {

    private String name;
    private int age;
    
    public Person(String n, int a){
        name = n;
        age = a;
    }
    public String getName(){
        return name;
    }

    @Override
    public int compareTo(Object t) {
        return othname = ((Person)t).getName();
        return this.namecompareTo(othname);
    }
    
}
