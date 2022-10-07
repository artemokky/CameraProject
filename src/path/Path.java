package path;


// Класс пути файла, возможно потребуются какие-то доп. функции
// для корректного использования пути, возможно парсер...
public class Path {
    private String path;

    public Path(String path){
        this.path = path;
    }

    @Override
    public String toString(){
        return path;
    }
}
