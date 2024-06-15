/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author DELL
 */
import java.sql.Statement;
public class AddRecord {
Statement stmt;
public void Form(String name, String address, String gender, String age) {
try {
stmt = DBConnection.getStatementConnection();
stmt.executeUpdate
("INSERT INTO student VALUES('"+name+"', '"+address+"', '"+gender+"', '"+age+"')");
} catch (Exception e) {
e.printStackTrace();
}
}
}