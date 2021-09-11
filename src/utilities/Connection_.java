package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection_ {
    
    private final String db = "challenge_questions";
    private final String user = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost:3306/" + db;
    private Connection con = null;
    
    
    public Connection getCon(){
        dbConnection();
        return con;
    }
    
    public void dbConnection(){
        try{
            setCon(DriverManager.getConnection(this.url, this.user, this.password));
        }catch(SQLException e6){
            System.out.println("SQLException "+ e6.getMessage());
        }catch(Exception e7){
            System.out.println("other"+ e7.getMessage());
        }       
    }
    
    public void setCon(Connection con){
        this.con=con;
    }
    
    public boolean closeDB()
    {
        boolean result = false;
        if(con == null)
        {
            result = true;
        }
        try
        {
            con.close();
            con = null;
            result = true;
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return result;
    }
    
    
}
