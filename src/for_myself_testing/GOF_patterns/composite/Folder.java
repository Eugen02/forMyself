package for_myself_testing.GOF_patterns.composite;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Folder {
    String name;
    Date creationDate;
    List<Folder> folderList = new ArrayList<>();
    List<FiLe> fiLes = new ArrayList<>();

    public  Folder(String name){
        this.name = name;
    }

    void  addFolder(Folder folder){
        folderList.add(folder);
    }

    void removeFolder(Folder folder){
        folderList.remove(folder);
    }

    List<Folder> getFolderList(){
        return folderList;
    }

    void  addFiLe(FiLe folder){
        fiLes.add(folder);
    }

    void removeFiLe(FiLe folder){
        fiLes.remove(folder);
    }

    List<FiLe> getFiLes(){
        return fiLes;
    }
}
