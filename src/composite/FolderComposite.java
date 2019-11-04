package composite;

import java.util.ArrayList;
import java.util.List;

public class FolderComposite implements FileComposite {

    List<FileComposite> files = new ArrayList<>();

    public FolderComposite(List<FileComposite> files) {
        this.files = files;
    }

    @Override
    public void showProperty() {

        for (FileComposite file : files) {
            file.showProperty();
        }

    }

    @Override
    public long totalSize() {

        long size = 0;
        for (FileComposite file : files) {
            size += file.totalSize();
        }
        return size;
    }
}
