package Composite;

public class File {

    public static void main(String[] args) {
        FileLeaf file1 = new FileLeaf("file.txt");
        FileLeaf file2 = new FileLeaf("image.png");
        FileLeaf file3 = new FileLeaf("proyect.java");
        
        DirectoryComposite directory1 = new DirectoryComposite("Folder1");
        DirectoryComposite directory2 = new DirectoryComposite("Folder2");
        
        directory1.addComponents(file1);
        directory1.addComponents(file2);
        
        directory2.addComponents(file3);
        directory2.addComponents(directory1);
        
        directory2.showDetails();
    }
    
}
