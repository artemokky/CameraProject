package wrapper;

import processor.Processor;
import reader.Reader;
import path.Path;

// FormatFrom - с 90% вероятностью будет DNG, но могут быть и другие в случае сжатия
// FormatTo - может быть JPEG, HEIC, HEIF, TIFF, etc
public class Wrapper<FormatFrom, FormatTo> {
    private Processor<FormatFrom, FormatTo> processor;
    private Reader<FormatFrom> reader;

    private FormatTo photo;

    // Определяем директорию файла для обработки
    public void chooseDirectory(Path directory){
        reader = new Reader(directory);
    }

    // Закидываем файл в процессор
    private void putFile(){
        String[] parameters = new String[10];
        processor = new Processor<FormatFrom, FormatTo>(reader.getFile());
    }

    // На выбор - конвертировать
    public void convert(){
        processor.process();

        photo = processor.getOutputfile();
    }

    // Или сжимать
    public void compress(){
        processor.compress();

        photo = processor.getOutputfile();
    }

    // Получаем фото из враппера конвертера и думаем что с ним дальше делать
    public FormatTo getPhoto() {
        return photo;
    }
}
