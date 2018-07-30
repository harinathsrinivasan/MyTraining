package htc.com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Validate {
	public static boolean checkUser(String email,String pass)
    {
        boolean st =false;
        try{

            //loading drivers for postgresql
            Class.forName("org.postgresql.Driver");

            //creating connection with the database
            String url = "jdbc:postgresql://localhost:5432/Employees";
            String username = "postgres";
            String password = "postgres123";
            Connection con = DriverManager.getConnection(url, username, password);
            
            PreparedStatement ps =con.prepareStatement
                    ("select * from user_accounts where username=? and password=?");
            ps.setString(1, username);
            ps.setString(2, pass);
            ResultSet rs =ps.executeQuery();
                     
            if (!rs.wasNull()) 
            	{
            	st = true;
            	System.out.println(rs.getString(1));
            	System.out.println(rs.getString(2));
            	
            	
            	}
            else 
            	{
            	st = false;
            	}

        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return st;
    }
}
