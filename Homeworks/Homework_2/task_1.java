package Homeworks.Homework_2;

// Задание 1.
// Дана строка sql-запроса "select * from students where ".
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.

// Входная строка:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

// Выходная строка:
// select * from students where name = "Ivanov" and country = "Russia" and city = "Moscow"

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class task_1 {
  public static void main(String[] args) throws IOException {

    StringBuilder sb = new StringBuilder();
    try (BufferedReader br = new BufferedReader(new FileReader("Homeworks/Homework_2/person.json"))) {
      String data;
      System.out.println(sb);
      while ((data = br.readLine()) != null) {
        sb.append(data);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    Map<String, String> dictionary = new HashMap<>();

    String[] keys = sb.toString().replace("{", "").replace("\"", "")
        .replace("}", "").replaceAll("\\s", "").split(",");
    for (String data : keys) {
      String[] keyValue = data.split(":");
      String key = keyValue[0];
      String value = keyValue[1];
      dictionary.put(key, value);
    }
    System.out.println(dictionary);

    String name = dictionary.get("name");
    String country = dictionary.get("country");
    String city = dictionary.get("city");
    System.out.printf("SELECT * FROM students WHERE name = %s AND country = %s AND city = %s", name,
        country, city);
  }
}