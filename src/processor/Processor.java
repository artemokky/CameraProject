package processor;


// Класс обработчика файла
// Будет дополнен классами и методами из android sdk
public class Processor<FormatFrom, FormatTo> {
    private String[] parameters;
    private FormatFrom inputfile;
    private FormatTo outputfile;


    public Processor(String[] parameters){

    }

    public Processor(FormatFrom input){
        inputfile = input;
    }

    // По задумке будем только обрабатывать "сырые" фото
    public void process(){
        /*
        * process magic
        *
        * outputfile = processresult
        */
    }

    // Можно добавить функции компрессии
    // Иногда полезно сжать фото ради забавы
    // Но для этого приходится переходить на сторонние сервисы
    public void compress(){
        /*
         * compress magic
         *
         * outputfile = processresult
         */
    }

    // сеттеры-геттеры
    public void setParameters(String[] parameters){
        this.parameters = parameters;
    }

    public void setInputfile(FormatFrom inputfile){
        this.inputfile = inputfile;
    }

    public FormatTo getOutputfile() {
        return outputfile;
    }
}
