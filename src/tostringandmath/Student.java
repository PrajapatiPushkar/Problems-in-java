package src.tostringandmath;

//define a Student class with fields like name and age,
// and use toString to print student details

public class Student {
    String name;

    int age;

    int rollNumber;

    String house;

    public Student(String name, int age, int rollNumber, String house) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.house = house;
    }

    @Override
    public String toString() {
        return "Student Detail{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNumber=" + rollNumber +
                ", house='" + house + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student stu = new Student("Pushkar", 20, 102, "Bankaata Bazar");
        System.out.println(stu);
    }
}
