package Lesson5;

import java.util.HashMap;
import java.util.List;
import java.util.*;
public class Main_Les5 {

   /* public static HashMap<String, List<String>> phoneBook = new HashMap<>();
    public static void main(String[] args) {
        addInPhoneBook();
        findInPhoneBook("Козловский");
    }
    public static void addInPhoneBook() {
        phoneBook.put("Сидоров", List.of("+7-908-700-00-00", "+7-951-000-00-00"));
        phoneBook.put("Петров", List.of("+7-904-300-00-00", "+7-900-090-25-00"));
        phoneBook.put("Хохлов", List.of("+7-914-300-00-002", "+7-900-090-00-65"));
        phoneBook.put("Иванов", List.of("+7-904-300-00-00", "+7-900-090-66-66"));
        phoneBook.put("Сидоров", List.of("+7-904-300-00-00", "+7-900-090-78-85"));
        phoneBook.put("Козловский", List.of("+7-954-300-00-77", "+7-900-090-01-85"));
        phoneBook.put("Ляшин", List.of("+7-904-300-00-00", "+7-900-090-85-02"));

    }
    public static void findInPhoneBook(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }*/
   public static void main(String[] args) {
       Map<String, Integer> workerMap = new HashMap<>();
       String employees = "Иван Иванов " +
               "Светлана Петрова " +
               "Кристина Белова " +
               "Анна Мусина " +
               "Анна Крутова " +
               "Иван Юрин " +
               "Петр Лыков " +
               "Павел Чернов " +
               "Петр Чернышов " +
               "Мария Федорова " +
               "Марина Светлова " +
               "Мария Савина " +
               "Мария Рыкова " +
               "Марина Лугова " +
               "Анна Владимирова " +
               "Иван Мечников " +
               "Петр Петин " +
               "Иван Ежов ";

       String[] listWorker = employees.split(" ");
       for (int i = 0; i < listWorker.length; i += 2) {
           if (workerMap.containsKey(listWorker[i])) {
               workerMap.replace(listWorker[i], workerMap.get(listWorker[i]) + 1);
           } else {
               workerMap.put(listWorker[i], 1);
           }
       }


       Map<String, Integer> sortedWorkerMap = new LinkedHashMap<>();
       int max = 1;
       for (int value : workerMap.values()) {
           if (value > max) {
               max = value;
           }
       }
       for (int i = max; i > 0; i--) {
           for (Map.Entry<String, Integer> entry : workerMap.entrySet()) {
               String key = entry.getKey();
               if (workerMap.get(key) == i) {
                   sortedWorkerMap.put(key, workerMap.get(key));
               }
           }
       }
       System.out.println(sortedWorkerMap);
   }

}
