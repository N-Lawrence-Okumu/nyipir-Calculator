
import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;
import java.sql.*;




public class DBConnect {
    private Connection con;
    private Statement st;
    private ResultSet  rs;

    public DBConnect (){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        
        
        con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
        st = con.createStatement();
        
               
    } catch(ClassNotFoundException | SQLException ex) {
        System.out.println("Error:" + ex);
        
    }
    

    }
public void getData(){
    try
    { String query ="SELECT * FROM `persons`";
    rs = st.executeQuery(query);
    System.out.println("Records from Database");
    
    while(rs.next()){
        String name = rs.getString("name");
        String age = rs.getString("age");
        
        System.out.println("Name:  "+name+" " +"Age: "+age+" ");
        
    }
            
    }catch (SQLException ex ){
        System.out.println(ex);
    }

    
   }
}
