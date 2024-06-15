/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBSearch {
Statement stmt;
ResultSet rs;
public ResultSet searchLogin(String usName) {
try {
stmt = DBConnection.getStatementConnection();
String name = usName;
//Execute the Query
rs = stmt.executeQuery("SELECT * FROM login where User_Name='" + name + "'");
} catch (Exception e) {
e.printStackTrace();
}
return rs;
}
public ResultSet searchStudents(){
try{
stmt = DBConnection.getStatementConnection();
rs = stmt.executeQuery("SELECT * FROM student");
}
catch(Exception e){
}
return rs;
}
}
