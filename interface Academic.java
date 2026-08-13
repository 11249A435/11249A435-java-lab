interface Academic {
    void showAcademicDetails();
}

interface Sports {
    void showSportsDetails();
}

class Student implements Academic, Sports {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void showAcademicDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Academic Score: 85");
    }

    public void showSportsDetails() {
        System.out.println("Sports: Cricket");
        System.out.println("Sports Score: 90");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Arun", 101);

        s.showAcademicDetails();
        s.showSportsDetails();
    }
}