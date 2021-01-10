package encapsulation;

public class User {
    private String id;
    private String password;

    public User(String id) {
        this.id = id;
    }

    public void Print(){
        System.out.println("父类方法");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id.length()<10){
            return;
        }
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
