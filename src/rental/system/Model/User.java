/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rental.system.Model;

import java.util.ArrayList;

/**
 *
 * @author alahm
 */
public class User {

    private int id;
    private String fullName = "in register was null";
    private String userName = "in register was null";
    private String password = "in register was null";
    private int phone = 000000;
    private String email = "in register was null";
    private String address = "in register was null";
    private String userType = "Tenant";

    public User() {
    }

    public User(int id, String fullName, String userName, String password, int phone, String email, String address, String userType) {
        this.id = id;
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.userType = userType;
    }

    public User(String fullName, String userName, String password, int phone, String email, String address) {
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public User(String fullName, String userName, String password, int phone, String email, String address, String userType) {
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.userType = userType;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", fullName=" + fullName + ", userName=" + userName + ", password=" + password + ", phone=" + phone + ", email=" + email + ", address=" + address + ", userType=" + userType + '}';
    }

}
