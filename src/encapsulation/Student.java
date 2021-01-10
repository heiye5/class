package encapsulation;

public class Student extends User{
    private String stuName;
    private String number;

    public Student(String id) {
        super(id);
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getNumber() {
        super.Print();
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
