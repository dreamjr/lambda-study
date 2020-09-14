package filter;

import filter.domain.Name;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterTest {

    List<String> names = Arrays.asList("jeong", "pro", "jdk", "java");
    List<Name> nameList = new ArrayList<>();

    public FilterTest() {
        nameList.add(new Name("Lee Chunghee", 41));
        nameList.add(new Name("Lee Yein", 13));
        nameList.add(new Name("Lee Yeyoung", 10));
    }

    public void printFilteredNames() {
        System.out.println(names.toString());

        Stream<String> nameStream = names.stream().filter(name -> name.length() > 3);
        List<String> filteredArray = nameStream.collect(Collectors.toList());
        System.out.println(filteredArray.toString());
    }

    public void printFilteredNameList() {
        System.out.println(nameList.toString());

        List<Name> filteredNameList = nameList.stream().filter(name -> name.getAge() > 10).collect(Collectors.toList());
        System.out.println(filteredNameList);
    }

}
