package composite;

import java.util.ArrayList;
import java.util.List;

// Composite Class (Directory)
class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components;

    public Directory(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void display() {
        System.out.println("Directory: " + name);
        for (FileSystemComponent component : components) {
            component.display();
        }
    }

    @Override
    public long getSize() {
        return components.stream()
                .mapToLong(FileSystemComponent::getSize)
                .sum();
    }
}
