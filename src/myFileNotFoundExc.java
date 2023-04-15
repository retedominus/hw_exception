import java.io.FileNotFoundException;

public class myFileNotFoundExc extends FileNotFoundException {
    public myFileNotFoundExc() {
        super("Файл не найден!");
    }
}
