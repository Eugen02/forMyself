package for_myself_testing.GOF_patterns.prototype;

public class ProjectFactory {
    Project project;

    public ProjectFactory(Project project){
        this.project = project;
    }

    public  void setProject(Project project){
        this.project = project;
    }

    Project clonaProject(){
        return (Project) project.copy();
    }
}
