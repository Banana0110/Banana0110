package Student;

public class Main {

    public static void main(String[] args) {
        Age student = new Age();
        student.insertAge(22);
        student.name = "David";
        student.insertAge();
        Student std = new Student();
        std.showHobbie = "Music";  //Почему выходит null не понял
    }
}
