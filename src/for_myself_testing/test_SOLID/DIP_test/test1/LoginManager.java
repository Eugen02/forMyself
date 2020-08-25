package for_myself_testing.test_SOLID.DIP_test.test1;

public class LoginManager {
    // the beginning he was high level class
    //SimpleLogin simpleLogin = new SimpleLogin();
    //after replace type he stay be a the smt ez
    Auth auth;

    public LoginManager(Auth auth) {
        this.auth = auth;
    }

    public void login(User user){
        auth.authenticate(user);
    }


    // Смысл в том что бы понизить завизимость между классами, её нужно изолировать в отдельном классе,
    // (можно использовать паттерн абстр фабрику)
    // Также как в примере можно использовать промежуточный интерфейс для понижения зависимостей.
}
