class StudentToString {

    int age;

    String name;

    String house;

    String rollNumber;

    public StudentToString(int age, String name, String house, String rollNumber) {
        this.age = age;
        this.name = name;
        this.house = house;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student Details{age " + age
                + " ;, name: " + name
                +";, house:  " + house
                + " ;, roll Number: " + rollNumber + "}";
    }

    public static void main(String[] args) {
        StudentToString st = new StudentToString(17,"akash","32jaipur",
                "67hd");
        System.out.println(st);
    }
}
