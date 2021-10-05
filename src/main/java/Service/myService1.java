package Service;


//import org.apache.commons.lang3.StringUtils;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;

public class myService1 {

    public static void main(String[] args){

//        int int1 = 100;
//        int int2 = int1;
//        int1 = 500;
//        System.out.println("int1: " + int1);
//        System.out.println("int2: " + int2);
//
//        Integer int3 = 100;
//        Integer int4 = int3;
//        int3 = 500;
//        System.out.println("int3: " + int3);
//        System.out.println("int4: " + int4);


//        final int[] arr1 = new int[]{1,2,3,4,5};
//        int[] arr2 = arr1;
//        arr1[3] = 8;
//        System.out.println("arr1[3]: " + arr1[3]);
//        System.out.println("arr2[3]: " + arr2[3]);

//        Person per1 = new Person("Tom", "Cruise", 58);
//        Person per2 = per1;
//        per1.setFirstName("Daniel");
//        per1.setLastName("Craig");
//        System.out.println("per1.getFirstName(): "+ per1.getFirstName());
//        System.out.println("per1.getLastName(): "+ per1.getLastName());
//        System.out.println("per2.getFirstName(): "+ per2.getFirstName());
//        System.out.println("per2.getFirstName(): "+ per2.getLastName());

        // what is the difference between == and equals method
        // what do you need to do if you override equals method
        // how will you try to store an object element into a hashset
        // given a hashmap, what will you do if you wanna store Person object as key in hashmap

        // final keyword -
        // Is string immutable or not -
        // how to design an immutable class -

//        HashSet<Person> set1 = new HashSet<>();
//        Person per3 = new Person("Tom", "Cruise", 58);
//        Person per4 = new Person("Tom", "Cruise", 58);
//        set1.add(per3);
//        set1.add(per4);
//        System.out.println(set1.size());

//        Integer i1 = 100;
//        Integer i2 = 100;
//        System.out.println(i1 == i2);
//
//        Integer i3 = 1000;
//        Integer i4 = 1000;
//        System.out.println(i3 == i4);
//
//        Integer i7 = new Integer(100);
//        Integer i8 = new Integer(100);
//        System.out.println(i7 == i8);

//        String s1 = "100"; // Constant String Pool
//        String s2 = "100";
//        System.out.println(s1 == s2);
//
//        String s3 = new String("100");
//        String s4 = new String("100");
//        System.out.println(s3 == s4);
//
//        System.out.println(StringUtils.equals(s3, s4));
//
//        s3.toCharArray();
//
//        Collections.sort
//        Arrays.sort

//        String s1 = "100";
//        String s2 = "100";
//        System.out.println(s1 == s2);
//        System.out.println(StringUtils.equals(s1, s2));


        // oop - encapsulation, abstraction, polymorphism
        // polymorphism
//            1. Inheritance - what is the difference abstract class and interface ?
//            2. override and overload
//            3. Upper casting - parent class to point to our child class

//        List<Integer> list1 = new ArrayList<>():
//        HashMap<Integer> map = new HashMap<>();

//        static: in java 7 , it is in perm generation, and in java 8, it is in MetaSpace


//          Collection
//                  List - Vector
//                  Set Queue PriorityQueue
//                  PriorityQueue is a heap
//                  Deque
//
//          Map - LinkedHashMap
    }
}

class Person {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return age == person.age && firstName.equals(person.firstName) && lastName.equals(person.lastName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(firstName, lastName, age);
//    }
}
//Hashset of Integers
//{1, 2, 3, 4} -> 5 -> hahscode(5) hashvalue5 that will generate hash value -> compare to hashcode(1) hashvalue1
//                                                                                        hashcode(2) hashvalue2
//                                                                                        hashcode(3) hashvalue3
//   key is the value for the set elemtn value will be null                               hashcode(4) hashvalue4

// hashvalue5 is equal to hashvalue3 ----> hashcollision

