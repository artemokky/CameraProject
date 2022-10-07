package writer;

import path.Path;

// Класс для вывода файла
public class Writer {
    private String photo;
    private Path directory;
    private String name;

    Writer(Path directory, String photo){
        this.directory = directory;
        this.photo = photo;
        name = "";
    }

    // Функция, выводящая файл в нужном формате
    public void write(String format){
        name += format;
        /*
        * Выводим файл, называем его в нужном формате
         */

    }

}
