import Utility.CustomVariable;
import Utility.UtilityMethod;

import javax.swing.*;
import javax.xml.transform.Source;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    static JTextField username_field,
    doj_field,
     age_field, source_field, destination_field, mobile_field,
     ticket_field,
    email_field,
    seat_preference_field;


    public static void main(String[] args) throws SQLException {


            CustomVariable.databaseUrl = "jdbc:mysql://localhost:3306/railwaybookingdb";
            CustomVariable.username = "root";
            CustomVariable.password = "";
            UtilityMethod.createconnection(CustomVariable.databaseUrl, CustomVariable.username, CustomVariable.password);


            JFrame frame = new JFrame(" Railway reservation system");
            // frame.setContentPane().setBackground(Color.GRAY);

            JLabel personal_label = new JLabel("Personal Label");
            personal_label.setBounds(10, 10, 120, 30);

            JLabel ticket_details_label = new JLabel("Ticket Details");
            ticket_details_label.setBounds(310, 10, 120, 30);


            JLabel username_label = new JLabel(" ADD Username");
            username_label.setBounds(10, 50, 120, 30);
            username_field = new JTextField("");
            username_field.setBounds(120, 50, 120, 20);

            JLabel doj_label = new JLabel("Date OF Journey");
            doj_label.setBounds(300, 50, 120, 30);

            doj_field = new JTextField("");
            doj_field.setBounds(400, 60, 120, 20);


            JLabel age_label = new JLabel(" ADD AGE");
            age_label.setBounds(10, 80, 120, 30);
            age_field = new JTextField("");
            age_field.setBounds(120, 80, 120, 20);

            JLabel source_label = new JLabel("SOURCE");
            source_label.setBounds(300, 80, 120, 30);

            source_field = new JTextField("");
            source_field.setBounds(400, 90, 120, 20);


            JLabel gender_label = new JLabel(" GENDER");
            gender_label.setBounds(10, 110, 120, 30);
            JTextField gender_field = new JTextField("");
            gender_field.setBounds(120, 110, 120, 20);

            JLabel destination_label = new JLabel("DESTINATION");
            destination_label.setBounds(300, 110, 120, 30);

            destination_field = new JTextField("");
            destination_field.setBounds(400, 120, 120, 20);

            JLabel mobile_label = new JLabel(" Mobile");
            mobile_label.setBounds(10, 130, 120, 30);
            mobile_field = new JTextField("");
            mobile_field.setBounds(120, 140, 120, 20);

            JLabel ticket_price_label = new JLabel("Ticket Price");
            ticket_price_label.setBounds(300, 140, 120, 30);

            ticket_field = new JTextField("");
            ticket_field.setBounds(400, 150, 120, 20);


            JLabel email_label = new JLabel(" Email");
            email_label.setBounds(10, 160, 120, 30);
            email_field = new JTextField("");
            email_field.setBounds(120, 170, 120, 20);

            JLabel seat_label = new JLabel("Seat Type");
            seat_label.setBounds(300, 170, 120, 30);

            seat_preference_field = new JTextField("");
            seat_preference_field.setBounds(400, 180, 120, 20);


            JButton bookbutton = new JButton("Book TICKET");
            bookbutton.setBounds(30, 220, 150, 30);


            frame.add(personal_label);
            frame.add(ticket_details_label);
            frame.add(username_field);
            frame.add(doj_field);
            frame.add(doj_label);
            frame.add(age_label);
            frame.add(age_field);
            frame.add(source_label);
            frame.add(source_field);
            frame.add(gender_label);
            frame.add(gender_field);
            frame.add(destination_label);
            frame.add(destination_field);
            frame.add(mobile_label);
            frame.add(mobile_field);
            frame.add(ticket_field);
            frame.add(ticket_price_label);
            frame.add(email_label);
            frame.add(email_field);
            frame.add(seat_label);
            frame.add(seat_preference_field);
            frame.add(bookbutton);


            frame.add(username_label);
            frame.setSize(600, 500);
            frame.setLayout(null);
            frame.setVisible(true);


        //DELETE The DATA From Table
//            String delete_query= "delete from  ticketbookingtb where id =?  ";
//            PreparedStatement ps= connection.prepareStatement(delete_query);
//            ps.setInt(1,1);
//            ps.execute();
////            System.out.println(" one record is affected");
//         ADDING booking info

        String  insertQuery="INSERT INTO ticketbookingtb( username, age,gender, mobile,email,doj,source,destination,ticketprice,seat_prefrence)VALUES(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = CustomVariable.connection.prepareStatement(insertQuery);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        ps.setString(1, username_field.getText());
            ps.setInt(2, Integer.parseInt(age_field.getText()));
            ps.setString(3, gender_field.getText());
            ps.setString(4,mobile_field.getText());
            ps.setString(5, email_field.getText());
            ps.setString(6,doj_field.getText());
            ps.setString(7,source_field.getText());
            ps.setString(8, destination_field.getText());
            ps.setString(9,ticket_field.getText());
            ps.setString(10, seat_preference_field.getText());
            ps.execute();
//  System.out.println("your ticket is booked");
        // Update Existing Record
//            String update_Query= "UPDATE   ticketbookingtb  SET  username= ?  , ticketprice= ? , age = ? WHERE  id= ?";
//            PreparedStatement ps = connection.prepareStatement(update_Query);
//            ps.setString(1,"Meena");
//            ps.setString(2,"300");
//            ps.setInt(3,25);
//            ps.setInt(4,3);
//            ps.execute();
//            System.out.println("one record is update");


    }


}

