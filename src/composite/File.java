package composite;

// Leaf Class (Individual File)
class File implements FileSystemComponent {
    private String name;
    private long size;

    public File(String name, long size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void display() {
        System.out.println("File: " + name + ", Size: " + size + " bytes");
    }

    @Override
    public long getSize() {
        return size;
    }
}
