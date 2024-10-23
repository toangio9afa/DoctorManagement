/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctor;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DoctorManagement dm = new DoctorManagement();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Thêm bác sĩ");
            System.out.println("2. Sửa thông tin bác sĩ");
            System.out.println("3. Xóa bác sĩ");
            System.out.println("4. Tìm bác sĩ theo ID");
            System.out.println("5. Tìm bác sĩ theo tên");
            System.out.println("6. Sắp xếp bác sĩ theo ngày sinh");
            System.out.println("7. Hiển thị tất cả bác sĩ");
            System.out.println("8. Thoát");
            System.out.print("Chọn: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    dm.addDoctor();
                    break;
                case 2:
                    System.out.println("Nhập ID bác sĩ cần sửa:");
                    int editId = Integer.parseInt(sc.nextLine());
                    dm.editDoctor(editId);
                    break;
                case 3:
                    System.out.println("Nhập ID bác sĩ cần xóa:");
                    int deleteId = Integer.parseInt(sc.nextLine());
                    dm.deleteDoctor(deleteId);
                    break;
                case 4:
                    System.out.println("Nhập ID bác sĩ:");
                    int searchId = Integer.parseInt(sc.nextLine());
                    Doctor doctor = dm.findDoctorById(searchId);
                    if (doctor != null) {
                        System.out.println(doctor);
                    } else {
                        System.out.println("Không tìm thấy bác sĩ.");
                    }
                    break;
                case 5:
                    System.out.println("Nhập tên bác sĩ:");
                    String name = sc.nextLine();
                    dm.searchDoctorByName(name);
                    break;
                case 6:
                    dm.sortDoctorsByDateOfBirth();
                    break;
                case 7:
                    dm.displayDoctors();
                    break;
                case 8:
                    System.out.println("Thoát chương trình.");
                    sc.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}