package for_myself_testing.GOF_patterns.composite;

public class Main {
    public static void main(String[] args) {
        Folder folder = new Folder("Test");
        folder.addFolder(new Folder("Test2"));
        System.out.println(folder.getFolderList());
    }
}
