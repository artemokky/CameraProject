package reader;

import path.Path;
import dngfile.FileDNG;

// Класс, считывающий обрабатываемый файл по заданной директории
// Главная функция созвучна названию, но возможно потребуются ещё функции
// для корректного доступа к файлу или корректного чтения
public class Reader<FormatFrom> {
    private Path directory;
    private FormatFrom file;

    public Reader(){

    }

    public Reader(Path directory){
        this.directory = directory;
    }


    // Главная функция
    public void read(){
        String newfile = new String("");
        /*
        * Здесь, по заданному пути будет происходить
        * считывание файла фото в строку
        * Будем возвращать ссылку на новосозданную строку
        */
    }

    // сеттеры-геттеры
    public void setDirectory(){
        String newdirectory = new String("");

        directory = new Path(newdirectory);
    }

    public Path getDirectory(){
        return directory;
    }

    public FormatFrom getFile(){
        return file;
    }

}

