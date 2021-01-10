package encapsulation;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();

        student.setNumber("123134785");
        student.setStuId("2018608114");
        student.setStuName("这个");

        System.out.println("stuId" + student.getStuId());
        System.out.println("stuName" + student.getStuName());
        System.out.println("stuNumber" + student.getNumber());
    }
}
