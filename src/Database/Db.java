package Database;

import java.sql.*;
import javax.swing.JOptionPane;

public class Db {
       public static Connection  c; 
  public  static Statement  st;
  public static  PreparedStatement  checkid1 ,checkid2,checkbatch,getItemById,insertItem,deleteitem,updateitem,getExpItem;
  public static  PreparedStatement  addmember,getMember,insertbill,insertbillitem,insertMLoginDetails,updateMLoginDetails,maxIdMLoginDetails;
  static
         {  try{
//Class.forName("oracle.jdbc.driver.OracleDriver");
//c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","medisol","medisol");
Class.forName("com.mysql.jdbc.Driver");
c=DriverManager.getConnection("jdbc:mysql://localhost:3306/medisol","root","kumar");
st=c.createStatement();
checkid1=c.prepareStatement("select * from memberlogin where mid =? and pass=? ");
checkid2=c.prepareStatement("select * from adminlogin where aid =? and pass=? ");
checkbatch=c.prepareStatement("select * from item where batch=? ");
insertItem=c.prepareStatement("insert into item (name,batch,qty,exp,mrp) values (?,?,?,?,?) ");
getItemById=c.prepareStatement("select * from item where itemid=? ");
deleteitem=c.prepareStatement("delete from item where batch=?");
updateitem=c.prepareStatement("update item set name=?,batch=?,qty=?,exp=?,mrp=? where batch=? ");
getExpItem=c.prepareStatement("select * from item where exp<=? ");
getMember=c.prepareStatement("select * from memberlogin where mid=? ");
addmember=c.prepareStatement("insert into memberlogin (mid,pass,name,phone) values (?,?,?,?) ");
 insertbill=c.prepareStatement("insert into bill (pname,amt,discount,netamt,bdate) values (?,?,?,?,?) ");
 insertbillitem=c.prepareStatement("insert into billitem (bid,itemid,iname,qty,mrp,amt) values (?,?,?,?,?,?) ");
 
         }
catch(Exception ex){
JOptionPane.showMessageDialog(null, ex);
}
}
}
  



