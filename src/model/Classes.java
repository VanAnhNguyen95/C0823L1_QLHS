package model;

public class Classes {
    private static int INDEX = 0; // Tạo biến để ID tự tăng
    int id;
    String name;

    public Classes( String name) {
        this.id = ++INDEX;
        this.name = name;
    }

    public Classes() {
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
// tạo thông tin về đối tượng bao gồm , classer, id ,name tên lớp là gì
    @Override
    public String toString() {
        return "Classes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
