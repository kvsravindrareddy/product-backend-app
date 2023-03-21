package com.ravindra;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamEx {
    public static void main(String[] args) {
        Employee e1 = new Employee("1","Ravi");
        Employee e2 = new Employee("2","Veera");
        List<Employee> employees = Arrays.asList(e1,e2);

        employees.stream().filter(employee -> employee.getName().startsWith("Ve")).map(employee -> employee.getName()).forEach(System.out::println);

        int result = IntStream.range(1,10).parallel().sum();
        System.out.println(result);
    }
}
//sorting and multi thread
//ConcurrentHashmap
//Copyanarraylist
//Olog(n) --> treeset
//log(n) --> hashset
//ArrayList --> O(1)
//LinkedList --> log(n)