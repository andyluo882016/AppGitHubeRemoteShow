public class User {

    private String id;
    private String name;
    private Integer age;

    public User(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
