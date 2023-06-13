// 3) Дана строка (сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: 
// Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class App {
    public static void main(String[] args) {
        try {
            // Чтение файла
            BufferedReader reader = new BufferedReader(new FileReader("students.json"));
            String jsonString = "";
            String line = reader.readLine();
            while (line != null) {
                jsonString += line;
                line = reader.readLine();
            }
            reader.close();

            // Парсинг JSON
            Gson gson = new Gson();
            JsonArray jsonArray = gson.fromJson(jsonString, JsonArray.class);
            StringBuilder stringBuilder = new StringBuilder();
            for (JsonElement jsonElement : jsonArray) {
                JsonObject jsonObject = jsonElement.getAsJsonObject();
                String surname = jsonObject.get("фамилия").getAsString();
                String mark = jsonObject.get("оценка").getAsString();
                String subject = jsonObject.get("предмет").getAsString();
                stringBuilder.append("Студент ").append(surname).append(" получил ").append(mark).append(" по предмету ").append(subject).append(".\n");
            }

            // Вывод результатов
            System.out.println(stringBuilder.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}