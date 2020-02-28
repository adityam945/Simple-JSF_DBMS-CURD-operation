/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

/**
 *
 * @author adityam945
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



@ManagedBean(name = "userBean")
@SessionScoped
public class UserBean {

public List<User1> getUserList()
{
List<User1> list = new ArrayList<User1>();
PreparedStatement ps = null;
Connection con = null;
ResultSet rs = null;
try
{
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/record?autoReconnect=true&useSSL=false", "root", "adityam@123");
String sql = "select * from user1";
ps= con.prepareStatement(sql); 
rs= ps.executeQuery(); 
while (rs.next())
{
User1 usr = new User1();
usr.setUserID(rs.getLong("userId"));
usr.setName(rs.getString("day"));
usr.setAddress(rs.getString("session"));
usr.setCreated_date(rs.getDate("created_date"));

list.add(usr);
} 
}
catch(Exception e)
{
e.printStackTrace();
}
finally
{
try
{
con.close();
ps.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
return list;



  
}


}