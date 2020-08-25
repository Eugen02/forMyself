package for_myself_testing.test_SOLID.OCP_test.test1;

public class Pers {
    private int age;
    private int name;
    private boolean job;

    public Pers(int age, int name, boolean job) {
        this.age = age;
        this.name = name;
        this.job = job;
    }

    public boolean isJob() {
        return job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public void setJob(boolean job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Pers{" +
                "age=" + age +
                ", name=" + name +
                ", job=" + job +
                '}';
    }
}
