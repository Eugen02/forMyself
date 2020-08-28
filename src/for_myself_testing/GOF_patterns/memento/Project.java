package for_myself_testing.GOF_patterns.memento;


import java.util.Date;

public class Project {
 private String version;
 private Date data;

 public void setVersionAndDate(String version){
     this.version = version;
     this.data = new Date();
 }

    public Save save(){
     return new Save(version);
    }

    public void load(Save save){
     version = save.getVersion();
     data = save.getDate();
    }

    @Override
    public String toString() {
        return "Project:\n" +
                "\nversion='" + version  +
                "\nDate=" + data + "\n";
    }
}
