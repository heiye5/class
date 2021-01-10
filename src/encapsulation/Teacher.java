package encapsulation;

public class Teacher extends User {
    private String zhicheng;

    public Teacher(String id) {
        super(id);
    }

    public String getZhicheng() {

        return zhicheng;
    }

    public void setZhicheng(String zhicheng) {
        this.zhicheng = zhicheng;
    }
}
