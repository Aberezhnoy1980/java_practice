package ru.aberezhnoy;

import java.util.*;

public class Main {
    public static void main(String... args) {

//        task0();
//        task1(10,0,10);
//        task2();
        final List<ArrayList<String>> catalog = new ArrayList<>();
        catalog.add(new ArrayList<>(Arrays.asList("genre", "title")));
        addBook("Poem", "Romeo and Juliet", catalog);
        addBook("Roman", "Master and Margarita", catalog);
        addBook("Poem", "Unknown", catalog);
        addBook("Detective", "Sherlock Holmes", catalog);
        addBook("Detective", "Banditskiy Peterburg", catalog);

        System.out.println(catalog);

    }

    static void task0() {
// Даны следующие строки. Необходимо cравнить их с помощью == и метода equals() класса Object
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
        System.out.println(s4 == s5);
        System.out.println(s5 == s6);
        System.out.println();
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s4.equals(s5));
        System.out.println(s5.equals(s6));

    }

    static void task1(int size, int min, int max) {
/* Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на экран.
*/
        List<Integer> list = createList(size, min, max);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

    static List<Integer> createList(int size, int min, int max) {
        final List<Integer> list = new ArrayList<>(size);

        for (int i = 0; i <= size; i++) {
            list.add((int) (Math.random() * (max - min + 1) + min));
        }
        return list;
    }

    static void task2() {
/* Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа.
 */
        final List<Object> strings = new ArrayList<>();
        strings.add("word1");
        strings.add(123);
        strings.add("word2");
        strings.add(12);
        strings.add(11.11);
        strings.add("word3");

//        Iterator<Object> iterator = strings.iterator();
//        while (iterator.hasNext()) {
//            Object o = iterator.next();
//            if (o instanceof Integer) iterator.remove();
//        }

        strings.removeIf(o -> o instanceof Integer); // predicate

        System.out.println(strings);
    }

    static void task3() {
/* Заполнить список названиями планет Солнечной системы в
произвольном порядке с повторениями.
Вывести название каждой планеты и количество его
повторений в списке.
 */
        final ArrayList<String> planets = new ArrayList<>();

        planets.add("Mars");
    }

    static void addBook(String genre, String title, List<ArrayList<String>> catalog) {
/* Текст задачи:
Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях
- названия книг. Напишите метод для заполнения данной структуры.
*/
        for (int i = 0; i < catalog.size(); i++) {
            if (catalog.get(i).get(0).equals(genre)) {
                catalog.get(i).add(title);
                return;
            }
        }
        catalog.add(new ArrayList<>(Arrays.asList(genre, title)));
    }
}

