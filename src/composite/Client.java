package composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        FileComposite f1 = new FileLeaf("ITechCorp", 10);
        FileComposite f2 = new FileLeaf("Eway", 30);
        FileComposite f3 = new FileLeaf("Septeni", 50);
        FileComposite f4 = new FileLeaf("ttcsolutions", 10);

        List<FileComposite> files = Arrays.asList(f1,f2,f3,f4);
        FileComposite folder = new FolderComposite(files);
        folder.showProperty();
        folder.totalSize();
    }

}
