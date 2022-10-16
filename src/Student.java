public class Student {
    private String name;
    private int age;
    private int finalGrade;

    public Student(String name, int age, int finalGrade) {
        this.name = name;
        this.age = age;
        this.finalGrade = finalGrade;
    }

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

    public int getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(int finalGrade) {
        this.finalGrade = finalGrade;
    }

    @Override
    public String toString() {
        return "(" +
                name + " , " +
                 age +
                " , " + finalGrade +
                ')';
    }
}
