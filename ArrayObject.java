class Student {
    int rollNo;
    String name;
    int marks;
}

public class ArrayObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 24;
        s1.name = "varsha";
        s1.marks = 75;

        Student s2 = new Student();
        s2.rollNo = 25;
        s2.name = "arjun";
        s2.marks = 85;

        Student s3 = new Student();
        s3.rollNo = 26;
        s3.name = "mala";
        s3.marks = 95;

        Student[] student = new Student[3]; // It is an Array for Student Reference
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].name);
        }
    }
}
