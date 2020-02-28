/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;
import javax.faces.context.FacesContext;

/**
 *
 * @author adityam945
 */
public class view {
    int userId;  
String name;  
String email;  
String address; 
ArrayList usersList ;  
private Map<String,Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();  
Connection connection; 

public int getuserId() {  
return userId;  
}  
public void setId(int UserId) {  
this.userId = UserId;  
}

public String getname() {  
return name;  
}  
public void setname(String name) {  
this.name = name;  
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

public Connection getConnection(){  
try{  
Class.forName("com.mysql.jdbc.Driver");     
    Connection connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/record?autoReconnect=true&useSSL=false","root","adityam@123");  
}catch(Exception e){  
System.out.println(e);  
}  
return connection;  
}

public ArrayList usersList(){  
try{  
usersList = new ArrayList();  
connection = getConnection();  
Statement stmt=getConnection().createStatement();    
ResultSet rs=stmt.executeQuery("select * from booked_slots");    
while(rs.next()){  
User user = new User();  
user.setId(rs.getInt("userId"));  
user.setName(rs.getString("name"));  
user.setEmail(rs.getString("email"));  
user.setAddress(rs.getString("address"));  
usersList.add(user);  
}  
connection.close();          
}catch(Exception e){  
System.out.println(e);  
}  
return usersList;  
}  

}
