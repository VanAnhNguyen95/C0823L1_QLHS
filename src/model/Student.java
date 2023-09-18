package model;

public class Student {
    private static int INDEX =0; // Tạo biến để ID tự tăng
    int id;
    private String name;
    int age;
    String gender;
    double avgPoint;
    Classes classer; //tên lớp chứa học sinh

    public Student() {
    }

    public Student(String name, int age, String gender, double avgPoint, Classes classer) {
        this.id = ++INDEX;// DÙNG để tạo id tự tăng khi tạo mới 1 đối tượng
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.avgPoint = avgPoint;
        this.classer = classer;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(double avgPoint) {
        this.avgPoint = avgPoint;
    }

    public Classes getClasser() {
        return classer;
    }

    public void setClasser(Classes classer) {
        this.classer = classer;
    }
// dùng để hiển thị ra ngoài màn hình để kiểm tra xem đủ thông tin chưa
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", avgPoint=" + avgPoint +
                ", classer=" + classer +
                '}';
    }
}
