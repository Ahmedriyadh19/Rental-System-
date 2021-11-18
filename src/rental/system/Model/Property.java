/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rental.system.Model;

/**
 *
 * @author alahm
 */
public class Property {

    private int id;
    private String name;
    private double price;
    private String type;
    private String furniture;
    private String facility;
    private String photo;
    private String activation;
    private String book;
    private String comment="";
    private int userId;
    
    
    public Property(){}

    public Property(int id, String name, double price, String type, String furniture, String facility, String photo, String activation, String book, int userId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.furniture = furniture;
        this.facility = facility;
        this.photo = photo;
        this.activation = activation;
        this.book = book;
        this.userId = userId;
    }

    public Property(int id, String name, double price, String type, String furniture, String facility, String photo, String activation, String book, String comment, int userId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.furniture = furniture;
        this.facility = facility;
        this.photo = photo;
        this.activation = activation;
        this.book = book;
        this.comment = comment;
        this.userId = userId;
    }
            
    public Property(String name, double price, String type, String furniture, String facility, String photo, String activation, String book, String comment, int userId) {

        this.name = name;
        this.price = price;
        this.type = type;
        this.furniture = furniture;
        this.facility = facility;
        this.photo = photo;
        this.activation = activation;
        this.book = book;
        this.comment = comment;
        this.userId = userId;
    }

    public Property(String name, double price, String type, String furniture, String facility, String photo, String activation, String book, int userId) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.furniture = furniture;
        this.facility = facility;
        this.photo = photo;
        this.activation = activation;
        this.book = book;
        this.userId = userId;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFurniture() {
        return furniture;
    }

    public void setFurniture(String furniture) {
        this.furniture = furniture;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getActivation() {
        return activation;
    }

    public void setActivation(String activation) {
        this.activation = activation;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Property{" + "id=" + id + ", name=" + name + ", price=" + price + ", type=" + type + ", furniture=" + furniture + ", facility=" + facility + ", photo=" + photo + ", activation=" + activation + ", book=" + book + ", comment=" + comment + ", userId=" + userId + '}';
    }

}