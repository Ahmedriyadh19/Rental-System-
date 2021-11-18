/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental.system.Control;

//import com.sun.org.apache.xerces.internal.util.FeatureState;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import rental.system.Model.ConnectionManager;
import rental.system.Model.Property;
import rental.system.Model.User;
import rental.system.View.LoginPage;

/**
 *
 * @author alahm
 */
public class Control {

    public Connection con;
    public Statement statement;
    public ResultSet res;

    public void displayLoginPage() {
        new LoginPage().setVisible(true);
    }

    public User checkDataFromDB(String email, String pass) {
        int test = 0;
        User user = new User();
        String query = "SELECT * FROM user WHERE  u_e = '" + email + "' AND u_pass = '" + pass + "'";
        try {
            con = ConnectionManager.getConnection();
            statement = con.createStatement();
            res = statement.executeQuery(query);
            while (res.next()) {
                user.setId(res.getInt("u_id"));
                user.setFullName(res.getString("u_fn"));
                user.setUserName(res.getString("u_un"));
                user.setPassword(res.getString("u_pass"));
                user.setPhone(res.getInt("u_p"));
                user.setEmail(res.getString("u_e"));
                user.setAddress(res.getString("u_add"));
                user.setUserType(res.getString("u_type"));
                test++;
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception);
        }
        if (test == 0) {
            user.setFullName("no");
        }
        return user;
    }

    public void insertUserToDB(User u) {
        User checkUserintoDB = checkDataFromDB(u.getEmail(), u.getPassword());
        if ((u.getEmail().equals(checkUserintoDB.getEmail())) && !checkUserintoDB.getFullName().equals("no")) {
            JOptionPane.showMessageDialog(null, "The info that you have used is existed", "Data Existed", 2);
        } else {
            try {
                con = ConnectionManager.getConnection();
                statement = con.createStatement();
                statement.executeUpdate("INSERT INTO user (u_fn,u_un,u_pass,u_p,u_e,u_add,u_type) VALUES ('"
                        + u.getFullName()
                        + "','" + u.getUserName()
                        + "','" + u.getPassword()
                        + "','" + String.valueOf(u.getPhone())
                        + "','" + u.getEmail()
                        + "','" + u.getAddress()
                        + "','" + u.getUserType()
                        + "')");
                JOptionPane.showMessageDialog(null, "Successfully Registered", "Note", 1);
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, exception);
            }
        }
    }

    public void insertPropertyToDB(Property p) {
        try {
            con = ConnectionManager.getConnection();
            statement = con.createStatement();
            statement.executeUpdate("INSERT INTO property (p_n,p_price,p_type,p_fur,p_fac,p_pic,p_act,p_book,p_com,p_user) VALUES ('"
                    + p.getName()
                    + "','" + p.getPrice()
                    + "','" + p.getType()
                    + "','" + p.getFurniture()
                    + "','" + p.getFacility()
                    + "','" + p.getPhoto()
                    + "','" + p.getActivation()
                    + "','" + p.getBook()
                    + "','" + p.getComment()
                    + "','" + p.getUserId()
                    + "')");
            JOptionPane.showMessageDialog(null, "Successfully Adding", "Note", 1);
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception);
        }
    }

    public Vector<User> importUsersDataFromDB() {
        Vector<User> listOfUsers = new Vector<>();
        String query = "SELECT * FROM user ";
        try {
            con = ConnectionManager.getConnection();
            statement = con.createStatement();
            res = statement.executeQuery(query);
            User user;
            while (res.next()) {
                user = new User(res.getInt("u_id"), res.getString("u_fn"), res.getString("u_un"), res.getString("u_pass"), res.getInt("u_p"), res.getString("u_e"), res.getString("u_add"), res.getString("u_type"));
                listOfUsers.add(user);
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception);
        }
        return listOfUsers;
    }

    public Vector<Property> importPropertyDataFromDB(User u) {
        Vector<Property> listOfProperties = new Vector<>();
        String query = "SELECT * FROM property WHERE p_user = '" + u.getId() + "'";

        if (u.getUserType().equals("Admin") || u.getUserType().equals("Tenant")) {
            query = "SELECT * FROM property ";
        }

        try {
            con = ConnectionManager.getConnection();
            statement = con.createStatement();
            res = statement.executeQuery(query);
            Property property;
            while (res.next()) {
                property = new Property(res.getInt("p_id"), res.getString("p_n"), res.getDouble("p_price"), res.getString("p_type"), res.getString("p_fur"), res.getString("p_fac"), res.getString("p_pic"), res.getString("p_act"), res.getString("p_book"), res.getString("p_com"), res.getInt("p_user"));
                listOfProperties.add(property);
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception);
        }
        return listOfProperties;
    }

    public void updatePropertyInof(Property p) {
        try {
            String q = "UPDATE `property` SET "
                    + "`p_n`='" + p.getName()
                    + "',`p_price`='" + p.getPrice()
                    + "',`p_type`='" + p.getType()
                    + "',`p_fur`='" + p.getFurniture()
                    + "',`p_fac`='" + p.getFacility()
                    + "',`p_pic`='" + p.getPhoto()
                    + "',`p_act`='" + p.getActivation()
                    + "',`p_book`='" + p.getBook()
                    + "',`p_com`='" + p.getComment()
                    + "',`p_user`='" + p.getUserId()
                    + "' WHERE p_id = '" + p.getId() + "'";
            con = ConnectionManager.getConnection();
            statement = con.createStatement();
            statement.executeUpdate(q);
            JOptionPane.showMessageDialog(null, "Successfully Updated", "Note UPDATE ", 1);

        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception, "ERROR UPDATE ", 0);

        }
    }

    public void setBooking(Property p) {
        try {
            con = ConnectionManager.getConnection();
            statement = con.createStatement();
            statement.executeUpdate("update property set p_book ='" + p.getBook() + "' where p_id ='" + p.getId() + "'");
            JOptionPane.showMessageDialog(null, "The Property Has booked", "Booking", 1);
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception, "ERROR UPDATE ", 0);
        }
    }

    public void deleteProperty(Property p) {
        try {
            String q = "DELETE FROM `property` WHERE p_id ='" + p.getId() + "'";
            con = ConnectionManager.getConnection();
            statement = con.createStatement();
            statement.executeUpdate(q);
            JOptionPane.showMessageDialog(null, "The Property Has Deleted", "Delete", 1);
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception, "ERROR UPDATE ", 0);
        }
    }
}
