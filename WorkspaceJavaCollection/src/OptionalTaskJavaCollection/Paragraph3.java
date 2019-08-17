package OptionalTaskJavaCollection;

//3.   Создать список из элементов каталога и его подкаталогов.
import java.io.File;

public class Paragraph3 {
    public static void main(String[] args) {
        // определяем объект для каталога
        File dir = new File("D://IDA//WorkspaceJavaCollection//src//aircraft//");
        // если объект представляет каталог
        if(dir.isDirectory())
        {
            // получаем все вложенные объекты в каталоге
            for(File item : dir.listFiles()){
                if(item.isDirectory()){
                    System.out.println(item.getName() + " folder");
                }
                else{
                    System.out.println(item.getName() + " file");
                }
            }
        }
    }
}

