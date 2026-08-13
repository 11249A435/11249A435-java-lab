class StudentDemo {
    int rollNo;
    String name;

    StudentDemo(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

class Marks extends StudentDemo {
    int m1, m2, m3, m4, m5;

    Marks(int rollNo, String name, int m1, int m2, int m3, int m4, int m5) {
        super(rollNo, name);

        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;
    }

    void displayMarks() {
        System.out.println("Marks: " + m1 + " " + m2 + " " + m3 + " "
                + m4 + " " + m5);
    }
}

class Result extends Marks {

    Result(int rollNo, String name, int m1, int m2, int m3, int m4, int m5) {
        super(rollNo, name, m1, m2, m3, m4, m5);
    }

    int total() {
        return m1 + m2 + m3 + m4 + m5;
    }

    double average() {
        return total() / 5.0;
    }

    String grade() {
        double avg = average();

        if (avg >= 90)
            return "A+";
        else if (avg >= 80)
            return "A";
        else if (avg >= 70)
            return "B";
        else if (avg >= 60)
            return "C";
        else if (avg >= 50)
            return "D";
        else
            return "F";
    }

    void displayResult() {
        displayStudent();
        displayMarks();

        System.out.println("Total: " + total());
        System.out.println("Average: " + average());
        System.out.println("Grade: " + grade());
    }
}

public class StudentDemos {
    public static void main(String[] args) {

        Result r = new Result(101, "Arun", 85, 90, 78, 88, 92);

        r.displayResult();
    }
}