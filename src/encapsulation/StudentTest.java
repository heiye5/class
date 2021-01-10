package encapsulation;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("32");

        student.setNumber("123134785");
        student.setId("201860811");
        student.setStuName("这个");

//        System.out.println("stuId = " + student.getId());
//        System.out.println("stuName = " + student.getStuName());
//        System.out.println("stuNumber = " + student.getNumber());

        System.out.println(student.getNumber());
    }
}
