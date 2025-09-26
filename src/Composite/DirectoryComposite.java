package Composite;

import java.util.ArrayList;
import java.util.List;

public class DirectoryComposite implements FileComponent{
    private String name;
    private List<FileComponent> components = new ArrayList<FileComponent>();
    
    public  DirectoryComposite(String name) {
        this.name = name;
    }
    
    public void addComponents(FileComponent component) {
        components.add(component);
    }
    
    @Override
    public void showDetails() {
        System.out.println("Directory: " + name);
        for (FileComponent component : components) {
            component.showDetails();
        }
    }
}
