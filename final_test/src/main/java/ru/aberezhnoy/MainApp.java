package ru.aberezhnoy;

import ru.aberezhnoy.entity.PhoneBook;

public class MainApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        // Test records
        phoneBook.addRecord("Peterson", 98676698998L);
        phoneBook.addRecord("Peterson", 91827987791L);
        phoneBook.addRecord("Peterson", 91827987745L);
        phoneBook.addRecord("Nelson", 98786876782L);
        phoneBook.addRecord("Madison", 94563456723L);
        phoneBook.addRecord("Jackson", 96725376564L);
        phoneBook.addRecord("Jackson", 98656753655L);
        phoneBook.addRecord("Franklin", 91235624526L);
        phoneBook.addRecord("Jefferson", 95464646217L);
        phoneBook.addRecord("Jefferson", 93654776538L);
        phoneBook.addRecord("Madison", 92146576629L);
        // выводим отсортированный справочник
        System.out.println("PhoneBook\n");
        phoneBook.PrintSortedPhoneBook();
        // Тестируем поиск по имени
        System.out.println("\nTesting search\n");
        phoneBook.getNumber("peterson");
        phoneBook.addRecord("Smith", 94567543422L);
        phoneBook.addRecord("Peterson", 91254763433L);
        // После добавления записей, как новых, так и по существующим позициям, выводим справочник
        System.out.println("\nTesting phonebook after elements adding");
        phoneBook.PrintSortedPhoneBook();
    }
}
