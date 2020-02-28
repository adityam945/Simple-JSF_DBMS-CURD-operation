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
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import java.util.Date;

@ManagedBean
@RequestScoped
public class User1 {

private long userID;
private String day;
private String session;
private Date created_date;
public long getUserID() {
return userID;
}
public void setUserID(long userID) {
this.userID = userID;
}
public String getName() {
return day;
}
public void setName(String day) {
this.day = day;
}
public String getAddress() {
return session;
}
public void setAddress(String session) {
this.session = session;
}
public Date getCreated_date() {
return created_date;
}
public void setCreated_date(Date created_date) {
this.created_date = created_date;
} 
}