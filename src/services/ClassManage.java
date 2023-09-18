package services;

import model.Classes;

import java.util.ArrayList;
import java.util.Scanner;

// khởi tạo lớp ClassManage dùng để thêm sửa xóa lớp
public class ClassManage {
    //tạo nơi lưu trữ lớp
    //CRUD lớp
    // Thứ lấy dữ liệu người dùng nhập vào (Scanner)
    private ArrayList<Classes> classess ;// Cần import class để hết lỗi đỏ
    private Scanner scanner;
// luôn tạo 1 contrucrter rỗng trước rồi tạo contructor có giá trị
    // mục đích để mối khi tạo mới 1 đối tượng trong ClassManage thì tự động tạo mới 1 arrayList và 1 scanner
    public ClassManage() {
        classess = new ArrayList<Classes>();
        scanner =new Scanner(System.in);
    }
//  hàm của chữ Read
    public void showClasses(){
        // for (KDL biến :MẢNG ) {}
        for(Classes classes :classess){
            System.out.println(classes);// phần in ra sẽ gọi đến To string của lớp Classes
        }
    }
// Hàm của chữ CREATE
    public void addClasses(){
            System.out.println("Input class name : ");
            String nameClass = scanner.nextLine();

        // Bước 1 : Hứng dữ liệu người dùng nhập vào biến nameClass
        // Bước 2 : Tạo mới 1 đối tượng class với constructor Classes( String name )
        // Bước 3 : gắn giá trị nameClass vào name trong constructor
       //Bước 4 :  Classes class = new Class("name")
        classess.add(new Classes(nameClass));
        System.out.println("Add Class Success");
   }

// Tìm kiếm luôn trả về đối tượng ( nếu có )
    // Nếu không có trả về null;

    public Classes findClassByID( int id ){
        // Nếu dùng array thì là arr.length;
        // Nếu dùng arraylist thì là arr.size();
        // Duyệt toàn bộ mảng => kiểm tra id xem có tồn tại không ?
        for (int i = 0; i < classess.size(); i++) {

            // Nêu dùng mảng thì là classes[i]
            // Nếu dùng arraylist thì là classes.get(i)

            if(classess.get(i).getId() == id){
                return classess.get(i);
            }
        }
        return null;
    }

    public void editClasses(){
        // Bước 1 : Nhập ID
        // Bước 2 : Kiểm tra đối tượng với id vừa nhập
        // Bước 3 : Nếu có đối tượng ( != null ) thì sửa thông tin
        // Bước 4 : Nếu không có đối tượng thì trả về null
        System.out.println("Input ID class : ");
        int id = Integer.parseInt(scanner.nextLine());
        Classes findClass = this.findClassByID(id);
        if(findClass != null){
            System.out.println("Input new class name : ");
            String name = scanner.nextLine();
            findClass.setName(name);
            System.out.println("Edit Success");
        }
        else {
            System.out.println("ID not found.");
        }
    }

    public void deleteClasses(){
        System.out.println("Input ID class : ");
        int id = Integer.parseInt(scanner.nextLine());
        Classes findClass = this.findClassByID(id);
        if(findClass != null){
            // arraylist hỗ trợ xoá bằng phương thức remove
            // Trong phương thức sẽ truyền 1 đối tượng muốn xoá
            classess.remove(findClass);
            System.out.println("Delete Success");
        }else {
            System.out.println("ID not found");
        }
    }


}