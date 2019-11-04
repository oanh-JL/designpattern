package composite;

public class FileLeaf implements FileComposite {

    String property;
    long size;

    public FileLeaf(String property, long size) {
        this.property = property;
        this.size = size;
    }

    @Override
    public void showProperty() {
        System.out.println("file leaf property: " + property + "\n size: " + size);
    }

    @Override
    public long totalSize() {
        return size;
    }
}
