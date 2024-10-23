/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctor;

import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class Doctor {
    private int id;
    private String name;
    private String dateOfBirth;
    private String specialization;
    private int availability;
    private String email;
    private String mobile;

    public Doctor(int id, String name, String dateOfBirth, String specialization, int availability, String email, String mobile) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.specialization = specialization;
        this.availability = availability;
        setEmail(email);
        setMobile(mobile);
    }

    // Getters và Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    public int getAvailability() { return availability; }
    public void setAvailability(int availability) { this.availability = availability; }

    public String getEmail() { return email; }
    public void setEmail(String email) {
        if (Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Email không hợp lệ");
        }
    }

    public String getMobile() { return mobile; }
    public void setMobile(String mobile) {
        if (Pattern.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}", mobile)) {
            this.mobile = mobile;
        } else {
            throw new IllegalArgumentException("Số điện thoại không hợp lệ, phải theo định dạng (000)-000-0000");
        }
    }

    @Override
    public String toString() {
        return "Doctor [ID=" + id + ", Name=" + name + ", DateOfBirth=" + dateOfBirth +
               ", Specialization=" + specialization + ", Availability=" + availability +
               ", Email=" + email + ", Mobile=" + mobile + "]";
    }
}
