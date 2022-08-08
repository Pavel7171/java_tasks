package tasks;
import java.io.*;
import java.util.*;

/**
* Программа, которая показывает информацию о файле
*/
public class size
{
    public static void main(String[] argv) throws IOException
    {
        // проверяем на правильность вызова программы
        if (argv.length == 0) {
            System.err.println("Используется так: " + size.class.getName() + " имя_файла.txt");
            System.exit(1);
        }

        // проходимся по каждому переданному названию файла
        for (String arg: argv) {
            getFileStatus(arg);
        }
    }


    public static void getFileStatus(String fileName) throws IOException
    {
        System.out.println("---" + fileName + "---");

        // Создаем объект File для заданного имени
        File file = new File(fileName);

        // Проверяем файл на существование
        if (!file.exists()) {
            System.out.println("Файл не найден\n");
            return;
        }

        // Выводим в консоль полное название файла
        System.out.println("Полное название " + file.getCanonicalPath());
        // Выводим родительскую папку, если возможно
        String fileParent = file.getParent();
        if (fileParent != null) {
            System.out.println("Родительская папка: " + fileParent);
        }

        // Проверяем права доступа к файлу
        if (file.canRead()) {
            System.out.println("Файл может быть прочитан");
        }

        // Проверка на возможность записи в файл
        if (file.canWrite()) {
            System.out.println("Данные могут быть записаны в файл");
        }

        // Выводим дату изменения файла
        Date date = new Date();
        date.setTime(file.lastModified());
        System.out.println("Файл изменен: " + date);

        // Если файл является именно файлом, а не папкой, например
        if (file.isFile()) {
            // Выводим в консоль размер файла в байтах
            System.out.println("Размер файла: " + file.length() + " байт(а).");
        } else if (file.isDirectory()) {
            System.out.println("Это папка");
        } else {
            System.out.println("Путь и не файл и не папка");
        }

        System.out.println(); // добавляем перевод строки

    }
}
