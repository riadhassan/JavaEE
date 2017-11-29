
import java.util.*;
public class ArrayList {

    public static void main(String args[])
    {
       //Creat array list

        List<String> list= new java.util.ArrayList<>();
        System.out.println("Initial size of the array list= "+ list.size());

        //add element in array list

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        //Display all element
        System.out.println("Initial size of the array list= "+ list);

        //Display one element
        System.out.println("index no 0 element "+ list.get(0));

        //remove element
        list.remove(1);
        System.out.println("index no 0 element "+ list.get(1));

        //Check any element

        System.out.println("The element A is stay: "+ list.contains("A"));
        System.out.println("The element A is stay: "+ list.contains("B"));



    }
}
