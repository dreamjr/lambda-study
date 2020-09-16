package main.map;

import main.filter.domain.Name;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapOperation {
    List<String> names = Arrays.asList("jeong", "pro", "jdk", "java");
    List<Name> nameList = new ArrayList<>();

    public MapOperation() {
        nameList.add(new Name("Lee Chunghee", 41));
        nameList.add(new Name("Lee Yein", 13));
        nameList.add(new Name("Lee Yeyoung", 10));
    }

    public void printMapNames() {
        System.out.println(names.toString());

        List<String> mappedArray = names.stream().map(name -> name + " " + name).collect(Collectors.toList());
        System.out.println(mappedArray.toString());
    }

    public void printObjectMapToInt() {
        System.out.println(nameList.toString());

        List<Integer> mappedIntArray = nameList.stream().map(nameElement -> nameElement.getAge()).collect(Collectors.toList());
        System.out.println(mappedIntArray.toString());
    }

    public void printObjectMapToObject() {
        System.out.println(nameList.toString());

        List<Name> mappedObjectArray = nameList.stream().map(
                nameElement -> {
                    nameElement.setName(nameElement.getName() + " Good!");
                    nameElement.setAge(nameElement.getAge() + 10);
                    return nameElement;
                }
            ).collect(Collectors.toList());
        System.out.println(mappedObjectArray.toString());
    }
}
