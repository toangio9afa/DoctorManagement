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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DoctorManagement {
    private ArrayList<Doctor> doctors = new ArrayList<>();
    private int currentId = 1;

    public void addDoctor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên bác sĩ:");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh (dd/MM/yyyy):");
        String dateOfBirth = sc.nextLine();
        System.out.println("Nhập chuyên khoa:");
        String specialization = sc.nextLine();
        System.out.println("Nhập trạng thái (0: nghỉ phép, 1: sẵn sàng, 2: bận, 3: đang chẩn đoán):");
        int availability = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập email:");
        String email = sc.nextLine();
        System.out.println("Nhập số điện thoại (định dạng (000)-000-0000):");
        String mobile = sc.nextLine();

        try {
            Doctor doctor = new Doctor(currentId++, name, dateOfBirth, specialization, availability, email, mobile);
            doctors.add(doctor);
            System.out.println("Thêm bác sĩ thành công!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void editDoctor(int id) {
        Doctor doctor = findDoctorById(id);
        if (doctor == null) {
            System.out.println("Không tìm thấy bác sĩ.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên mới (để trống để giữ nguyên):");
        String name = sc.nextLine();
        if (!name.isEmpty()) doctor.setName(name);

        System.out.println("Nhập ngày sinh mới (dd/MM/yyyy) (để trống để giữ nguyên):");
        String dob = sc.nextLine();
        if (!dob.isEmpty()) doctor.setDateOfBirth(dob);

        System.out.println("Nhập chuyên khoa mới (để trống để giữ nguyên):");
        String specialization = sc.nextLine();
        if (!specialization.isEmpty()) doctor.setSpecialization(specialization);

        System.out.println("Nhập trạng thái mới (0, 1, 2, 3):");
        int availability = Integer.parseInt(sc.nextLine());
        doctor.setAvailability(availability);

        System.out.println("Nhập email mới (để trống để giữ nguyên):");
        String email = sc.nextLine();
        if (!email.isEmpty()) doctor.setEmail(email);

        System.out.println("Nhập số điện thoại mới (để trống để giữ nguyên):");
        String mobile = sc.nextLine();
        if (!mobile.isEmpty()) doctor.setMobile(mobile);

        System.out.println("Cập nhật thông tin thành công!");
    }

    public void deleteDoctor(int id) {
        Doctor doctor = findDoctorById(id);
        if (doctor != null) {
            doctors.remove(doctor);
            System.out.println("Xóa bác sĩ thành công!");
        } else {
            System.out.println("Không tìm thấy bác sĩ.");
        }
    }

    public Doctor findDoctorById(int id) {
        for (Doctor doctor : doctors) {
            if (doctor.getId() == id) {
                return doctor;
            }
        }
        return null;
    }

    public void searchDoctorByName(String name) {
        for (Doctor doctor : doctors) {
            if (doctor.getName().equalsIgnoreCase(name)) {
                System.out.println(doctor);
                return;
            }
        }
        System.out.println("Không tìm thấy bác sĩ.");
    }

    public void sortDoctorsByDateOfBirth() {
        Collections.sort(doctors, new Comparator<Doctor>() {
            public int compare(Doctor d1, Doctor d2) {
                return d1.getDateOfBirth().compareTo(d2.getDateOfBirth());
            }
        });
        System.out.println("Danh sách bác sĩ đã được sắp xếp theo ngày sinh.");
    }

    public void displayDoctors() {
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }
}
