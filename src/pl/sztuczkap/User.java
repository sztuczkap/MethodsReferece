package pl.sztuczkap;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
        System.out.println("Użytkownik: " + name + " został stworzony!");
    }
}
