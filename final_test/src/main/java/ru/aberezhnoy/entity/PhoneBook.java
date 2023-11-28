package ru.aberezhnoy.entity;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PhoneBook {
    final private Map<String, Set<Long>> phones;

    public PhoneBook() {
        this.phones = new HashMap<>();
    }

    public void addRecord(String name, Long phoneNumber) {
        if (!phones.containsKey(name)) {
            phones.put(name, new HashSet<>());
        }
        phones.get(name).add(phoneNumber);
    }
    public void PrintPhoneBook() {
        for (Map.Entry<String, Set<Long>> r : phones.entrySet()) {
            System.out.println(r.getValue() + ": " + r.getKey());
        }
    }

    public void PrintSortedPhoneBook() {
        phones.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue().size()))
                .forEach(System.out::println);
    }

    public List<Set<Long>> getNumber(String name) {
        List<Set<Long>> result = new ArrayList<>();
        phones.forEach((key, value) -> {
            if (name.equalsIgnoreCase(key)) {
                result.add(value);
                for (Set<Long> number : result) {
                    System.out.println(name + " phone number(s) is: " + number);
                }
            }
        });
        if (result.size() == 0) {
            System.out.println("record is not exist");
        } return result;
    }
}
