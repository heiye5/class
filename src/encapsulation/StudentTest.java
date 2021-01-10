package encapsulation;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();

        student.setNumber("123134785");
        student.setId("2018608114");
        student.setStuName("这个");

        System.out.println("stuId" + student.getId());
        System.out.println("stuName" + student.getStuName());
        System.out.println("stuNumber" + student.getNumber());
    }
}
