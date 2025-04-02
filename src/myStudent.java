public class myStudent {
    private String name;
    private int age;
    private String studentId;
    private double averageGrade;

    // Constructor
    public myStudent(String name, int age, String studentId, double averageGrade) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.averageGrade = averageGrade;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    // Method to print student info
    public void printStudentInfo() {
        System.out.println(this);
    }

    // Method to check if student passed
    public boolean isPassed() {
        return averageGrade >= 50.0;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Student ID: " + studentId + "\n" +
                "Average Grade: " + averageGrade + "\n" +
                "Passed: " + isPassed() + "\n" +
                "----------------------";
    }
}
